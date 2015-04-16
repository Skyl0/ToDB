package skyit.tooldatabase.classes.model;

/**
 * Created by skylo on 16.04.15.
 */
public class Tool {

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getUID() {
        return UID;
    }

    private String description, name;

    public Site getCurrent() {
        return current;
    }

    public void setCurrent(Site current) {
        this.current = current;
    }

    private Site current;
    private float cost;
    private int UID;

    public Tool (String description, String name, float cost, int UID) {
        this.description = description;
        this.name = name;
        this.UID = UID;
        this.cost = cost;
    }
}
