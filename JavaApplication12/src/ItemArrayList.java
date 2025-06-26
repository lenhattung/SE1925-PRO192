
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tungi
 */
public class ItemArrayList extends ArrayList<Item> {

    public ItemArrayList() {
    }

    public int getNumberOfItems() {
        return this.size();
    }

    public boolean addItem(Item item) {
        return this.add(item);
    }

    public void displayAll() {
        if (this.isEmpty()) {
            System.out.println("The list is empty!");
        }
        for (int i = 0; i < this.size(); i++) {
            System.out.println(this.get(i));
        }
    }

    public Item findItem(String creator) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getCreator().equals(creator)) {
                return this.get(i);
            }
        }
        return null;
    }

    public int findItemIndex(String creator) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getCreator().equals(creator)) {
                return i;
            }
        }
        return -1;
    }

    public boolean updateItem(int index) {
        if (index >= 0 && index < this.size()) {
            this.get(index).input();
            return true;
        }
        return false;
    }

    public boolean removeItem(int index) {
        return this.remove(index) != null;
    }

    public void displayItemsByType(String type) {
        if (type.equals("Vase")) {
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i) instanceof Vase) {
                    System.out.println(this.get(i));
                }
            }
        } else if (type.equals("Statue")) {
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i) instanceof Statue) {
                    System.out.println(this.get(i));
                }
            }
        } else {
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i) instanceof Painting) {
                    System.out.println(this.get(i));
                }
            }
        }
    }

    public void sortItems() {
        Collections.sort(this);
    }
}
