import java.util.*;



public class Meal {
    List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost=0.0f;
        for(Item item:items){
            cost+=item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item:items){
            System.out.print("name is: "+item.name());
            System.out.print(", price is: "+item.price()+"DH");
            System.out.println(", packing is in: "+item.packing().pack());
        }
    }
}
