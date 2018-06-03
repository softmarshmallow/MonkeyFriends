package com.softmarshmallow.monkeyfriends.Views.MissonForm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.softmarshmallow.monkeyfriends.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class TargetFriendActivity extends AppCompatActivity
{
        
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_targetfriend);
        
                ButterKnife.bind(this);
        }
        
        
        @OnClick(R.id.target)
        void OnTargetClick(){
                Intent intent = new Intent(this, SelectMissionTypeActivity.class);
                startActivity(intent);
        }
        
        
}
