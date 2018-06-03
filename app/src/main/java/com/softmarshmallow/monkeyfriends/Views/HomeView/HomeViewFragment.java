package com.softmarshmallow.monkeyfriends.Views.HomeView;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mikhaellopez.circularprogressbar.CircularProgressBar;
import com.softmarshmallow.monkeyfriends.R;
import com.softmarshmallow.monkeyfriends.Views.MissonForm.TargetFriendActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeViewFragment extends Fragment
{
        
        
        public HomeViewFragment() {
                // Required empty public constructor
        }
        
        
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
                // Inflate the layout for this fragment
                View view =  inflater.inflate(R.layout.fragment_home_view, container, false);
                
                ButterKnife.bind(this, view);
                
                return view;
        }
        
        @BindView(R.id.progressBar)
        CircularProgressBar progressBar;
        
        @OnClick(R.id.logButton)
        void OnLogButtonClick(){
        
        
        
        }
        
        
        @OnClick(R.id.badgeButton)
        void OnBadgeButtonClick(){
        
        }
        
        @OnClick(R.id.newMissionButton)
        void OnNewMissionButtonClick(){
                Intent intent = new Intent(getContext(), TargetFriendActivity.class);
                startActivity(intent);
        }
        
        @OnClick(R.id.todayMissionButton)
        void OnTodayMissionButtonClick(){
        
        }
        
        
        
        
}
