package skyit.tooldatabase.classes.model;

/**
 * Created by skylo on 16.04.15.
 */
public class Site {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String name, description;

    public int getUID() {
        return UID;
    }

    private static int UID;

    public Site (String name, String description, int UID) {
        this.name = name;
        this.description = description;
        this.UID = UID;
    }
}
