package skyit.tooldatabase.classes.repository;

import java.util.ArrayList;
import skyit.tooldatabase.classes.controller.ListViewController;
import skyit.tooldatabase.classes.model.Tool;

/**
 * Created by skylo on 16.04.15.
 */
public class ToolRepository {

    ArrayList<Tool> tools = new ArrayList<Tool>();
    private int nextUID = 0;
    private ListViewController controller;

    public ToolRepository() {}
    public ToolRepository(ListViewController controller) {
        setController(controller);
    }

    public ListViewController getController() {
        return controller;
    }

    public void setController(ListViewController controller) {
        this.controller = controller;
    }

    public void addTool(String name, String desc, float cost) {
        Tool newItem = new Tool(name,desc,cost,nextUID);
        tools.add(newItem);
        nextUID++;
    }

    public ArrayList<Tool> getList () {
        return tools;
    }
    public String[] getStringArray() {
        String[] output = new String[tools.size()];
        for (int i = 0; i < tools.size(); i++) {
            output[i] = tools.get(i).getName();
        }
        return output;
    }

    public void removeByUid (int UID) {
        Tool temp;
        for (int i = 0; i < tools.size(); i++) {
            temp = tools.get(i);
            if (temp.getUID() == UID) {
                tools.remove(i);
                break;
            }
        }
    }

}
