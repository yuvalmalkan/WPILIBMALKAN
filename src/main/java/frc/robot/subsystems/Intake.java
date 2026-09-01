package frc.robot.subsystems;

public class Intake {
    public enum IntakeState{
        OPEN,
        CLOSED,
    }

    private static IntakeState intakeState;


    public static IntakeState GetState(){
        return intakeState;
    }

    public static void open(){
        intakeState = IntakeState.OPEN;
    }


    public static void close(){
        intakeState = IntakeState.CLOSED;
    }

}
