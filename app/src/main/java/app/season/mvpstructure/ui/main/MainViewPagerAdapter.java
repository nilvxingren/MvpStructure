package app.season.mvpstructure.ui.main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-3-25
 * Time: 13:12
 * FIXME
 */
public class MainViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> fragments;
    private final String[] titles = new String[]{
            "正在热映", "即将上映", "TOP榜"
    };

    public MainViewPagerAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
