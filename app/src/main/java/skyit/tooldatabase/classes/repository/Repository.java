package skyit.tooldatabase.classes.repository;

import java.util.ArrayList;

import skyit.tooldatabase.classes.controller.ListViewController;
import skyit.tooldatabase.classes.model.*;

/**
 * Created by skylo on 16.04.15.
 */
public class Repository<T> {

    private int nextUID = 0;
    private ListViewController controller;
    private ArrayList<T> items = new ArrayList<T>();

    public Repository(ListViewController controller) {
        setController(controller);
        this.controller.update();
    }

    public ListViewController getController() {
        return controller;
    }

    public void setController(ListViewController controller) {
        this.controller = controller;
        this.controller.update();
    }

    public void addItem (T item) {
        items.add(item);
        nextUID++;
        controller.update();
    }


    public ArrayList<T> getList () {
        return items;
    }

    public void removeByUid (int UID) {
        // extend this
    }
}
