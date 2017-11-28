package com.example.alina.hciprojectdiabetes;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import layout.Home;


public class Diet extends AppCompatActivity implements LogBook.OnFragmentInteractionListener, Progress_Data.OnFragmentInteractionListener, Info.OnFragmentInteractionListener, Settings.OnFragmentInteractionListener, Forum.OnFragmentInteractionListener, Stories.OnFragmentInteractionListener, Home.OnFragmentInteractionListener, Tab1.OnFragmentInteractionListener,Tab2.OnFragmentInteractionListener,Tab3.OnFragmentInteractionListener
{
    private int[] tabIcons = {
            R.drawable.home,
            R.drawable.diet,
            R.drawable.walking,
            R.drawable.logbook,
            R.drawable.forum,
            R.drawable.progress,
            R.drawable.motivation,
            R.drawable.info,
            R.drawable.settings
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("Home"));
        tabLayout.addTab(tabLayout.newTab().setText("Diet"));
        tabLayout.addTab(tabLayout.newTab().setText("Excercise"));
        tabLayout.addTab(tabLayout.newTab().setText("LogBook"));
        tabLayout.addTab(tabLayout.newTab().setText("Forum"));
        tabLayout.addTab(tabLayout.newTab().setText("Progress"));
        tabLayout.addTab(tabLayout.newTab().setText("Motivation"));
        tabLayout.addTab(tabLayout.newTab().setText("Info"));
        tabLayout.addTab(tabLayout.newTab().setText("Settings"));

        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[3]);


        tabLayout.getTabAt(4).setIcon(tabIcons[4]);
        tabLayout.getTabAt(5).setIcon(tabIcons[5]);

        tabLayout.getTabAt(6).setIcon(tabIcons[6]);
        tabLayout.getTabAt(7).setIcon(tabIcons[7]);
        tabLayout.getTabAt(8).setIcon(tabIcons[8]);


        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager)findViewById(R.id.pager);
        final PageAdapter adapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Log.d("heyy","alinafatima");
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
