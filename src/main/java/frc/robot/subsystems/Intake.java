package frc.robot.subsystems;

public class Intake {
    public enum IntakeState{
        OPEN,
        CLOSED,
    }

    private IntakeState intakeState;

    public void open(){
        intakeState = IntakeState.OPEN;
    }

    public void close(){
        intakeState = IntakeState.CLOSED;
    }

}
