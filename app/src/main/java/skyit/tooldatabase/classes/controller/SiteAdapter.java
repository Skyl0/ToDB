package skyit.tooldatabase.classes.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import skyit.tooldatabase.R;
import skyit.tooldatabase.classes.model.Site;

public class SiteAdapter extends BaseAdapter {

    private ArrayList<Site> _data;
    Context _c;

    public SiteAdapter(ArrayList<Site> data, Context c){
        _data = data;
        _c = c;
    }

    public int getCount() {
        // TODO Auto-generated method stub
        return _data.size();
    }

    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return _data.get(position);
    }

    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return _data.get(position).getUID();
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View v = convertView;
        if (v == null)
        {
            LayoutInflater vi = (LayoutInflater)_c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.list_site_single, null);
        }

        TextView nameView = (TextView)v.findViewById(R.id.name);
        TextView descView = (TextView)v.findViewById(R.id.description);
        //TextView costView = (TextView)v.findViewById(R.id.cost);

        Site site = _data.get(position);
        //float cost = site.getCost();
        nameView.setText(site.getName());
        descView.setText(site.getDescription());
       // costView.setText(Float.toString(cost));

        return v;
    }
}
