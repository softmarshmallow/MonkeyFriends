package com.softmarshmallow.monkeyfriends.Views.Login;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.softmarshmallow.monkeyfriends.R;
import com.softmarshmallow.monkeyfriends.Views.MainTabController.MainTabControllerActivity;

import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.pedant.SweetAlert.SweetAlertDialog;
import mehdi.sakout.fancybuttons.FancyButton;


public class LoginActivity extends AppCompatActivity
{
        
        @Override
        public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
                super.onCreate(savedInstanceState, persistentState);
                setTheme(R.style.AppTheme_FullScreen);
                setContentView(R.layout.activity_login);
                ButterKnife.bind(this);
                LoadNext();
        }
        
        void LoadNext(){
                Log.d("", "LoadNext");
                Intent intent = new Intent(this, MainTabControllerActivity.class);
                startActivity(intent);
        }
}