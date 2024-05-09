public class FuturisticRobotBuilder implements RobotBuilder {

    private Robot robot;

    public FuturisticRobotBuilder(){
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Hologram Head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Platinum Torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Laser Arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Hover Legs");
    }

    public Robot getRobot(){
        return this.robot;
    }
}

