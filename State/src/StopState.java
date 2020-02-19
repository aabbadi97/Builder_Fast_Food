public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("le joueur is in the Stop State");
        context.setState(this);
    }

    public String toString(){
        return "Stop state";
    }
}
