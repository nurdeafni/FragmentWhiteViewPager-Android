package com.nurde.fragmentwithviewpager;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;

//class for initialize Fragment
public class ViewPagerAdapter extends FragmentPagerAdapter {
    private Context context;
    public final int PAGE_COUNT = 4;
    public String tabTitles[] = new String[]{"CHAT", "STATUS", "PANGGILAN","WEB VIEW"};

    public ViewPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int page) {
        Fragment halaman = null;
        switch (page) {
            case 0:
                halaman = new ChatFragment();
                break;
            case 1:
                halaman = new StatusFragment();
                break;
            case 2:
                halaman = new PanggilanFragment();
                break;
            case 3:
                halaman = new WebFragment();
                break;
        }
        return halaman;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int page) {
        return  tabTitles[page];
    }

}
