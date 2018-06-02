package com.softmarshmallow.monkeyfriends.Views.MainTabController;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import com.softmarshmallow.monkeyfriends.Views.ExtraOptionsView.ExtraOptionsViewFragment;
import com.softmarshmallow.monkeyfriends.Views.FeedView.FeedViewFragment;
import com.softmarshmallow.monkeyfriends.Views.HomeView.HomeViewFragment;
import com.softmarshmallow.monkeyfriends.Views.NotificationView.NotificationViewFragment;
import com.softmarshmallow.monkeyfriends.Views.RankView.RankViewFragment;


public class MainPagerAdapter extends FragmentStatePagerAdapter
{

        private static final String TAG = "MainPagerAdapter";

        public MainPagerAdapter(FragmentManager fm) {
                super(fm);
        }


        @Override
        public int getCount() {
                return MainTabsType.values().length;
        }
        
        Fragment homeViewFragment = new HomeViewFragment();
        Fragment feedViewFragment = new FeedViewFragment();
        Fragment rankViewFragment = new RankViewFragment();
        Fragment notificationsPageFragment = new NotificationViewFragment();
        Fragment extraOptionsViewFragment = new ExtraOptionsViewFragment();


        @Override
        public Fragment getItem(int position) {
                MainTabsType tabType = MainTabsType.MainTabsPositionMapping.get(position);
                Log.d(TAG, "tab == null : " + (tabType  == null));
                Log.d(TAG, "position : " + position + ", tab : " + tabType);


                switch (tabType)
                {
                        case Featured:
                                     return homeViewFragment;
                        case Search:
                                return feedViewFragment;
                        case MyPage:
                                return rankViewFragment;
                        case Notifications:
                                return notificationsPageFragment;
                        case More:
                                return extraOptionsViewFragment;
                        default:
                                return null;
                }
        }


}
