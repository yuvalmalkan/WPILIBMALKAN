public class Intake {
    public Enum IntakeState{
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
