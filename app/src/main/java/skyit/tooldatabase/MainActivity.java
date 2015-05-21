package skyit.tooldatabase;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.ListView;

import android.widget.ArrayAdapter;

import skyit.tooldatabase.classes.controller.ListViewController;
import skyit.tooldatabase.classes.controller.ToolAdapter;
import skyit.tooldatabase.classes.model.Tool;
import skyit.tooldatabase.classes.repository.SiteRepository;
import skyit.tooldatabase.classes.repository.ToolRepository;


public class MainActivity extends ActionBarActivity {
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_sites);

        listview = (ListView) findViewById(R.id.sitesListView);

        SiteRepository srepo = new SiteRepository();
        ToolRepository trepo = new ToolRepository();
        ListViewController lvc = new ListViewController(srepo);

        srepo.setController(lvc);
        trepo.setController(lvc);

        srepo.addSite("Baustelle A", "Desc A");
        trepo.addTool("Hammer","Ein Hammer",2.0f);
        trepo.addTool("Säge","Ein Fuchsschwanz",3.0f);

        String[] items ;
        items = trepo.getStringArray();

        ToolAdapter tool_adapt = new ToolAdapter(trepo.getList() , this);

        listview.setAdapter(tool_adapt);

        //ListAdapter list_adapt = new ArrayAdapter<String>(this, R.layout.list_view_single, items);

        //listview.setAdapter(list_adapt);


       /* [Activity(Label = "BasicTable", MainLauncher = true, Icon = "@drawable/icon")]
        public class HomeScreen : ListActivity {
            string[] items;
        protected override void OnCreate(Bundle bundle)
        {
            base.OnCreate(bundle);
            items = new string[] { "Vegetables","Fruits","Flower Buds","Legumes","Bulbs","Tubers" };
            ListAdapter = new ArrayAdapter<String>(this, Android.Resource.Layout.SimpleListItem1, items);
        }
        protected override void OnListItemClick(ListView l, View v, int position, long id)
        }*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
