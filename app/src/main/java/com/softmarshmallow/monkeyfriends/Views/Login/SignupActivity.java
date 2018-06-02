package com.softmarshmallow.monkeyfriends.Views.Login;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.bumptech.glide.Glide;
import com.softmarshmallow.monkeyfriends.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.pedant.SweetAlert.SweetAlertDialog;

/**
 * A login screen that offers login via email/password.
 */
public class SignupActivity extends AppCompatActivity
{
        
        @Override
        public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
                super.onCreate(savedInstanceState, persistentState);
                setTheme(R.style.AppTheme_FullScreen);
                setContentView(R.layout.activity_signup);
                ButterKnife.bind(this);
        }
}

