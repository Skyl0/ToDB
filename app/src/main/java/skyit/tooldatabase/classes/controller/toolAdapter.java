package skyit.tooldatabase.classes.controller;

import skyit.tooldatabase.R;
import skyit.tooldatabase.classes.model.Tool;
import java.util.ArrayList;
import android.content.*;
import android.view.*;
import android.widget.*;
import android.widget.BaseAdapter;

public class ToolAdapter extends BaseAdapter {

    private ArrayList<Tool> _data;
    Context _c;

    public ToolAdapter (ArrayList<Tool> data, Context c){
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
            v = vi.inflate(R.layout.list_view_single, null);
        }

        TextView nameView = (TextView)v.findViewById(R.id.name);
        TextView descView = (TextView)v.findViewById(R.id.description);

        Tool tool = _data.get(position);
        nameView.setText(tool.getName());
        descView.setText(tool.getDescription());

        return v;
    }
}
