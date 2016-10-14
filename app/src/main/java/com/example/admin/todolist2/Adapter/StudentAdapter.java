package com.example.admin.todolist2.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.admin.todolist2.R;
import com.example.admin.todolist2.Student;

import java.util.ArrayList;

/**
 * Created by Admin on 07-10-2016.
 */
public class StudentAdapter extends BaseAdapter {
    ArrayList<Student> mArrayList;
    LayoutInflater mLayoutInflater;

    public StudentAdapter(Context context, ArrayList<Student> mArrayList) {
        this.mArrayList = mArrayList;
        this.mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return mArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=mLayoutInflater.inflate(R.layout.list_item,parent,false);
        Student student=(Student)getItem(position);
        CheckBox checkBox=(CheckBox)convertView.findViewById(R.id.checkBox);
        TextView ListItem=(TextView)convertView.findViewById(R.id.textView);
        ListItem.setText(student.getListItem());
        checkBox.setActivated(student.isCheckbox());
        return convertView;
    }
}

