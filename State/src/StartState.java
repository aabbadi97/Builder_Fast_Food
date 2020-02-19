public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("le joueur is in the start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}