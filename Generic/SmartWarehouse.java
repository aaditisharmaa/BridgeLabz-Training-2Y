import java.util.*;

public class SmartWarehouse {
    static abstract class WarehouseItem { String name; WarehouseItem(String n){name=n;} public String toString(){return getClass().getSimpleName()+":"+name;} }
    static class Electronics extends WarehouseItem { Electronics(String n){super(n);} }
    static class Groceries extends WarehouseItem { Groceries(String n){super(n);} }
    static class Furniture extends WarehouseItem { Furniture(String n){super(n);} }

    static class Storage<T extends WarehouseItem> {
        private final List<T> items = new ArrayList<>();
        public void add(T i){ items.add(i); }
        public List<T> getItems(){ return items; }
    }

    public static void displayAll(List<? extends WarehouseItem> list) {
        for (WarehouseItem w : list) System.out.println(w);
    }

    public static void main(String[] args) {
        Storage<Electronics> eStore = new Storage<>();
        eStore.add(new Electronics("TV"));
        eStore.add(new Electronics("Phone"));

        Storage<Groceries> gStore = new Storage<>();
        gStore.add(new Groceries("Rice"));

        displayAll(eStore.getItems());
        displayAll(gStore.getItems());
    }
}
