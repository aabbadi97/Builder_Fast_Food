public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Vegan Burger";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
