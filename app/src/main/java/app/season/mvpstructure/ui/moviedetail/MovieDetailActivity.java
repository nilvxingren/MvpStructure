package app.season.mvpstructure.ui.moviedetail;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import app.season.mvpstructure.R;
import app.season.mvpstructure.ui.base.BaseActivity;
import app.season.mvpstructure.ui.main.CustomViewPagerAdapter;
import app.season.mvpstructure.ui.moviedetail.moviedetailfragment.IntroduceFragment;
import app.season.mvpstructure.ui.moviedetail.moviedetailfragment.ShortCommentFragment;
import app.season.mvpstructure.ui.moviedetail.moviedetailfragment.StillsFragment;
import butterknife.Bind;
import butterknife.ButterKnife;


public class MovieDetailActivity extends BaseActivity {

    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.tablayout)
    TabLayout mTablayout;
    @Bind(R.id.viewpager)
    ViewPager mViewpager;
    @Bind(R.id.fab)
    FloatingActionButton mFab;

    private final String[] mTitles = new String[]{
            "介绍", "剧照", "短评"
    };
    private List<Fragment> mFragments;
    private CustomViewPagerAdapter mCustomViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);

        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //初始化填充到ViewPager中的Fragment集合
        mFragments = new ArrayList<>();

        IntroduceFragment introduceFragment = new IntroduceFragment();
        ShortCommentFragment shortCommentFragment = new ShortCommentFragment();
        StillsFragment stillsFragment = new StillsFragment();
        mFragments.add(introduceFragment);
        mFragments.add(stillsFragment);
        mFragments.add(shortCommentFragment);

        mCustomViewPagerAdapter = new CustomViewPagerAdapter(getSupportFragmentManager(), mFragments, mTitles);
        mViewpager.setAdapter(mCustomViewPagerAdapter);
        // 设置ViewPager最大缓存的页面个数
        mViewpager.setOffscreenPageLimit(5);
        // 给ViewPager添加页面动态监听器（为了让Toolbar中的Title可以变化相应的Tab的标题）
//        viewpager.addOnPageChangeListener(this);

        mTablayout.setTabMode(TabLayout.MODE_FIXED);
        // 将TabLayout和ViewPager进行关联，让两者联动起来
        mTablayout.setupWithViewPager(mViewpager);
    }

}
