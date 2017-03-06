package com.example.jonntnguyen.foodlog;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;

public class Content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        ListCheckboxAdapter list_adapter=new ListCheckboxAdapter(this,new String[]{"hoang ","nghi","cao sang"});
        ListView temp= (ListView) findViewById(R.id.listview_content);
        temp.setAdapter(list_adapter);
    }

}
class ListCheckboxAdapter extends ArrayAdapter<String>{
    private final Context context;
    private final String[] values;

    public ListCheckboxAdapter(Context context, String[] values) {
        super(context, -1, values);
        this.context = context;
        this.values = values;
    }



    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater =LayoutInflater.from(context);
        View rowView = inflater.inflate(R.layout.button_checkbox, parent, false);
        CheckBox newCheck =(CheckBox) rowView.findViewById(R.id.checkBox);
        newCheck.setText(values[position]);

        return rowView;

    }

}