package Builder;

import java.util.ArrayList;
import java.util.List;

//STEP 5
//Creamos la clase Almuerzo que tiene los objetos Item
public class Almuerzo {
	
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Item item : items){
            cost += item.price();
        }

        return cost;
    }

    public void showItems(){
        for (Item item: items){
            System.out.print("Item : " + item.name() + " ");
            System.out.print(", Empaquetado : " + item.packing().pack() + " ");
            System.out.print(", Precio : " + item.price() + " ,");
        }
    }
}
