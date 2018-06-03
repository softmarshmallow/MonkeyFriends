package com.softmarshmallow.monkeyfriends.Views.MissonForm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.softmarshmallow.monkeyfriends.R;

import butterknife.ButterKnife;

public class RockFormActivity extends AppCompatActivity
{
        
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_rockform);
                ButterKnife.bind(this);
        }
}
