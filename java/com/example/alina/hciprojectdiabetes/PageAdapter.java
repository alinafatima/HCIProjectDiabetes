package com.example.alina.hciprojectdiabetes;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import layout.Home;

/**
 * Created by Alina on 27-Nov-17.
 */

public class PageAdapter extends FragmentStatePagerAdapter {


    int mNumberOfTabs;

    public PageAdapter(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNumberOfTabs=NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        Log.d("heyy", Integer.toString(position));
        switch(position)
        {
            case 0:
                Home home=new Home();
                return home;
            case 1:
                Tab2 tab2=new Tab2();
                //Diet
                return tab2;
            case 2:
                Tab3 tab3=new Tab3();
                //Excercise
                return tab3;
            case 3:
                LogBook log=new LogBook();
                return log;
            case 4:
                Forum forum=new Forum();
                return forum;
            case 5:
                Log.d("heyy", "caseeeee5 ");
                Progress_Data progress=new Progress_Data();
                //Progress
                Log.d("heyy", "ban gayg");
                return progress;
            case 6:
                Stories story=new Stories();
                return story;
            case 7:
                Info info=new Info();
                //info
                return info;
            case 8:
                Settings  setting=new Settings();
                //Settings
                return setting;
            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return this.mNumberOfTabs;
    }
}
