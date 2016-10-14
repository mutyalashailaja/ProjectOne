package com.example.admin.todolist2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



/**
 * Created by Admin on 14-10-2016.
 */
public class tabsAdapter extends FragmentPagerAdapter {
    public tabsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new Fragment1();
            case 1:
                return new Fragment2();


        }

        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}