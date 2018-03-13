package com.raunak.android.cricketscorerandstats;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by raunak on 13-03-2018.
 */

public class CustomAdapter extends ArrayAdapter{

    private final Activity context;

    private final ArrayList<String> groupNameArray;

    public CustomAdapter(Activity context, ArrayList<String> groupNameArray) {
        super(context, R.layout.group_row ,groupNameArray);
        this.context = context;
        this.groupNameArray = groupNameArray;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.group_row, null,true);

        //this code gets references to objects in the listview_row.xml file
        TextView groupNameField = rowView.findViewById(R.id.textView);

        //this code sets the values of the objects to values from the arrays
        groupNameField.setText(groupNameArray.get(position));
        return rowView;

    };
}
