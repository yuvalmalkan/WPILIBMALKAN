package frc.robot.subsystems;

public class Intake {
    public enum IntakeState{
        OPEN,
        CLOSED,
    }

    private static IntakeState intakeState = IntakeState.CLOSED;;


    public static IntakeState getState(){
        return intakeState;
    }

    public static void open(){
        intakeState = IntakeState.OPEN;
    }


    public static void close(){
        intakeState = IntakeState.CLOSED;
    }

}
