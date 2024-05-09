public class TrashCollectingRobotBuilder implements RobotBuilder {

    private Robot robot;

    public TrashCollectingRobotBuilder(){
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Scanner Head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Trash Compacting Torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Shovel Arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Tread Legs");
    }

    public Robot getRobot(){
        return this.robot;
    }
}

