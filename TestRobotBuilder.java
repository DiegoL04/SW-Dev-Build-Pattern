public class TestRobotBuilder {

    public static void printRobot(Robot robot){
        System.out.println("Head: " + robot.getRobotHead());
        System.out.println("Torso: " + robot.getRobotTorso());
        System.out.println("Arms: " + robot.getRobotArms());
        System.out.println("Legs: " + robot.getRobotLegs());
        System.out.println();
    }

    public static void main(String[] args) {

        RobotBuilder oldRobotPlan = new OldRobotBuilder();

        RobotEngineer robotEngineer = new RobotEngineer(oldRobotPlan);

        robotEngineer.makeRobot();

        Robot oldRobot = robotEngineer.getRobot();

        printRobot(oldRobot);

        RobotBuilder futureRobotPlan = new FuturisticRobotBuilder();

        RobotEngineer robotEngineer2 = new RobotEngineer(futureRobotPlan);

        robotEngineer2.makeRobot();

        Robot futureRobot = robotEngineer2.getRobot();

        printRobot(futureRobot);

        RobotBuilder trashPlan = new TrashCollectingRobotBuilder();

        RobotEngineer robotEngineer3 = new RobotEngineer(trashPlan);

        robotEngineer3.makeRobot();

        Robot trashRobot = robotEngineer3.getRobot();

        printRobot(trashRobot);

    }
}
