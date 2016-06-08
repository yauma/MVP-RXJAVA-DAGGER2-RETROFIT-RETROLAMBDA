package com.example.jaimequeraltgarrigos.mvptest.ui.activity;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

import com.example.jaimequeraltgarrigos.mvptest.AppComponent;
import com.example.jaimequeraltgarrigos.mvptest.MyConstant;
import com.example.jaimequeraltgarrigos.mvptest.R;
import com.example.jaimequeraltgarrigos.mvptest.common.BaseActivity;
import com.example.jaimequeraltgarrigos.mvptest.common.BasePresenter;
import com.example.jaimequeraltgarrigos.mvptest.ui.fragment.MatchesFragment;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends BaseActivity {

    private ViewPager viewPager;

    @Override
    protected void injectViews() {
    }

    @Override
    protected void setTablayout() {
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        TabLayout tabs = (TabLayout) findViewById(R.id.tabLayout);
        tabs.setupWithViewPager(viewPager);
    }

    @Override
    protected void setComponent(AppComponent component) {

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }


    @Nullable
    @Override
    protected BasePresenter getPresenter() {
        return null;
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(MatchesFragment.newInstance(MyConstant.ALL), getResources().getString(R.string.all_matches));
        adapter.addFragment(MatchesFragment.newInstance(MyConstant.LIVE), getResources().getString(R.string.live_matches));
        adapter.addFragment(MatchesFragment.newInstance(MyConstant.FINISHED), getResources().getString(R.string.finished_matches));
        viewPager.setAdapter(adapter);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        return false;
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

}
