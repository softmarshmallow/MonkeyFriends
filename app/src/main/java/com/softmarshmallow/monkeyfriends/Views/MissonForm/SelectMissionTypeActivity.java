package com.softmarshmallow.monkeyfriends.Views.MissonForm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.softmarshmallow.monkeyfriends.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class SelectMissionTypeActivity extends AppCompatActivity
{
        
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_selectmission);
                ButterKnife.bind(this);
        }
        
        
        @OnClick(R.id.selectRockButton)
        void OnSelectRockButtonClick(){
                Intent intent = new Intent(this, RockFormActivity.class);
                startActivity(intent);
        }
}
