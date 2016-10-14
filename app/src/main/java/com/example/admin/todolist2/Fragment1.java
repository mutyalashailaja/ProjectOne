package com.example.admin.todolist2;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.admin.todolist2.Adapter.StudentAdapter;

import java.util.ArrayList;

/**
 * Created by Admin on 14-10-2016.
 */
public class Fragment1 extends Fragment {

    ListView mListView;
    StudentAdapter mStudentAdapter;
    ArrayList<Student> mArrayList;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView txt=(TextView)getActivity().findViewById(R.id.textView2);
        Button button=(Button)getActivity().findViewById(R.id.button) ;
        mListView = (ListView) getActivity().findViewById(R.id.listView);
        mArrayList = new ArrayList<>();
        mArrayList.add(new Student("Buy Vegetables", true));
        mArrayList.add(new Student("Buy Groceries", true));
        mArrayList.add(new Student("Buy Medicines",true));
        mArrayList.add(new Student("Drop child to school",true));
        mArrayList.add(new Student("Pick child from school",true));
        mArrayList.add(new Student("Get household work done",true));
        mArrayList.add(new Student("Organize files",true));
        mArrayList.add(new Student("Submit Project in office",true));
        mArrayList.add(new Student("Attend Meeting",true));
        mArrayList.add(new Student("Do pending works of yesterday",true));
        mArrayList.add(new Student("check call history ",true));
        mArrayList.add(new Student("Call back if there are any imp missed calls",true));
        mArrayList.add(new Student("Prepare dinner",true));
        mArrayList.add(new Student("Have dinner",true));
        mStudentAdapter = new StudentAdapter(getActivity().getBaseContext(), mArrayList);
        mListView.setAdapter(mStudentAdapter);
        registerForContextMenu(button);

    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.setHeaderTitle("list of things to buy");
        menu.add(1, 100, 1, "carrot");
        menu.add(1, 101, 2, "cucumber");
        menu.add(1, 101, 2, "beans");
        menu.add(1, 101, 2, "toor dal");
        menu.add(1, 101, 2, "tamarind");
        menu.add(1, 101, 2, "bread");


    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);



        return view;
    }



}

