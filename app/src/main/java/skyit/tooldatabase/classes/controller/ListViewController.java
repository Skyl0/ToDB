package skyit.tooldatabase.classes.controller;

import skyit.tooldatabase.classes.repository.SiteRepository;
import android.widget.ListView;

/**
 * Created by skylo on 16.04.15.
 */
public class ListViewController {

    SiteRepository repo;
    ListView view;

    public ListViewController(SiteRepository repo) {

        this.repo = repo;

    }

    public void update() {
        //TODO
    }
}
