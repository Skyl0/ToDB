package skyit.tooldatabase.classes.repository;

import java.util.ArrayList;

import skyit.tooldatabase.classes.controller.ListViewController;
import skyit.tooldatabase.classes.model.*;

/**
 * Created by skylo on 16.04.15.
 */
public class SiteRepository {

    private int nextUID = 0;
    private ListViewController controller;
    private ArrayList<Site> sites = new ArrayList<Site>();

    public SiteRepository() {};
    public SiteRepository(ListViewController controller) {
        setController(controller);
    }

    public ListViewController getController() {
        return controller;
    }

    public void setController(ListViewController controller) {
        this.controller = controller;
    }

    public void addSite (String name, String desc) {
        Site newItem = new Site (name, desc, nextUID);
        sites.add(newItem);
        nextUID++;
        controller.update();
    }

    public void addSite (Site site) {
        sites.add(site);
    }


    public ArrayList<Site> getList () {
        return sites;
    }

    public Site getByUid (int UID) {
        Site temp;
        for (int i = 0; i < sites.size(); i++) {
            if (sites.get(i).getUID() == UID) {
                return sites.get(i);
            }
        }
        return null;
    }
    public void removeByUid (int UID) {
        Site temp;
        for (int i = 0; i < sites.size(); i++) {
            temp = sites.get(i);
            if (temp.getUID() == UID) {
                sites.remove(i);
                controller.update();
                break;
            }
        }
    }
}
