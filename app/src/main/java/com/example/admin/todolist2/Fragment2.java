package com.example.admin.todolist2;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.admin.todolist2.Adapter.StudentAdapter;

import java.util.ArrayList;

/**
 * Created by Admin on 14-10-2016.
 */
public class Fragment2 extends Fragment {
    ArrayList<Student> myArrayList;
    ListView myListView;
    StudentAdapter myStudentAdapter;

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
       myListView=(ListView)getActivity().findViewById(R.id.listView2);
        myArrayList = new ArrayList<>();
        myArrayList.add(new Student("Buy Vegetables", true));
        myArrayList.add(new Student("Buy groceries", true));
        myArrayList.add(new Student("Buy medicines",true));
        myArrayList.add(new Student("drop child to school",true));
        myArrayList.add(new Student("pick up child from school",true));
        myArrayList.add(new Student("organize your files",true));
        myArrayList.add(new Student("get household work done",true));
        myArrayList.add(new Student("Submit Project in office",true));
        myArrayList.add(new Student("Attend Meeting",true));
        myArrayList.add(new Student("Do pending works of yesterday",true));
        myArrayList.add(new Student("check call history ",true));
        myArrayList.add(new Student("Call back if there are any imp missed calls",true));
        myArrayList.add(new Student("Prepare dinner",true));
        myArrayList.add(new Student("Have dinner",true));
        myStudentAdapter = new StudentAdapter(getActivity().getBaseContext(), myArrayList);
        myListView.setAdapter(myStudentAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_2, container, false);
        return view;
    }

}

