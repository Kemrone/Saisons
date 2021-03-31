package com.example.saisons.ui.main;

import android.content.Context;
import android.graphics.drawable.Drawable;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import com.example.saisons.R;


import java.util.Locale;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return NatureFragment.newInstance(0, "Printemps");
            case 1:
                return NatureFragment.newInstance(1, "Ete");
            case 2:
                return NatureFragment.newInstance(2, "Automne");
            case 3:
                return NatureFragment.newInstance(2, "Hiver");
        }
        return null;
    }

    @Nullable
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        String titre="";
        Drawable icone=null;
        switch (position) {
            case 0:
                icone = mContext.getResources().getDrawable(R.drawable.printemps_background);
                break;
            case 1:
                icone = mContext.getResources().getDrawable(R.drawable.ete_background);
                break;
            case 2:
                icone = mContext.getResources().getDrawable(R.drawable.automne_background);
                break;
            case 3:
                icone = mContext.getResources().getDrawable(R.drawable.hiver_background);
                break;
        }

        return null;
    }


    @Override
    public int getCount() {
        // Show 4 total pages.
        return 4;
    }
}