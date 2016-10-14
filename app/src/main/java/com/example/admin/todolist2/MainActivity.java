package com.example.admin.todolist2;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ActionBar.TabListener, ViewPager.OnPageChangeListener {
    ViewPager viewPager;
    tabsAdapter tabsAdapter;

    String tabs[]={"TO DO LIST","DONE LIST",};
    ActionBar actionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        tabsAdapter=new tabsAdapter(getSupportFragmentManager());
        viewPager.setAdapter(tabsAdapter);
        actionBar=getSupportActionBar();
        actionBar.setNavigationMode(actionBar.NAVIGATION_MODE_TABS);
        actionBar.setHomeButtonEnabled(true);
        for(String tab : tabs ){
            actionBar.addTab(actionBar.newTab().setText(tab).setTabListener(this));
    }
        viewPager.setOnPageChangeListener(this);
    }


    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        viewPager.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        actionBar.setSelectedNavigationItem(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }}
