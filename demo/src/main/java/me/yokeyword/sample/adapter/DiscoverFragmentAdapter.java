package me.yokeyword.sample.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import me.yokeyword.sample.ui.fragment.discover.PagerFavoriteFragment;
import me.yokeyword.sample.ui.fragment.discover.PagerHotFragment;
import me.yokeyword.sample.ui.fragment.discover.PagerRecommendFragment;

/**
 * Created by YoKeyword on 16/2/5.
 */
public class DiscoverFragmentAdapter extends FragmentPagerAdapter {
    String[] mTitles = new String[]{"推荐", "热门", "收藏"};

    public DiscoverFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return PagerRecommendFragment.newInstance(0);
        } else if (position == 1) {
            return PagerHotFragment.newInstance(1);
        } else {
            return PagerFavoriteFragment.newInstance(2);
        }
    }

    @Override
    public int getCount() {
        return mTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
