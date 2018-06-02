package com.softmarshmallow.monkeyfriends.Views.Splash;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.softmarshmallow.monkeyfriends.R;
import com.softmarshmallow.monkeyfriends.Views.Login.LoginActivity;
import com.softmarshmallow.monkeyfriends.Views.MainTabController.MainTabControllerActivity;


public class SplashScreenActivity extends AppCompatActivity
{
        
        static final String TAG = "SplashScreenActivity";
        final int delayMilliSeconds = 1700;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setTheme(R.style.AppTheme_FullScreen);
                setContentView(R.layout.activity_splash_screen);

                Test();
        }
        void Test() {
        

        }
        
        @Override
        protected void onResume() {
                super.onResume();
                StartWaiting();
        }
        
        @Override
        protected void onPause() {
                super.onPause();
                handler.removeCallbacks(r);
        }
        
        Handler handler = new Handler();
        Runnable r= new Runnable()
        {
                @Override
                public void run() {
                        MoveToNextActivity();
                }
        };
        void StartWaiting() {
                handler.postDelayed(r , delayMilliSeconds);
        }
        
        void MoveToNextActivity() {
        
/*                if (LoginPreferences.getIsLoggedIn()) {
                        MoveToMainAfterAutoLogin();
                } else {
                        Intent intent = new Intent(SplashScreenActivity.this, LoginActivity.class);
                        startActivity(intent);
                        finish();
                }*/
        
                Intent intent = new Intent(SplashScreenActivity.this, MainTabControllerActivity.class);
                startActivity(intent);
                finish();
                
        }
        /*void MoveToMainAfterAutoLogin(){
                final SweetAlertDialog autoLoginProgressDialog;
                autoLoginProgressDialog = new SweetAlertDialog(SplashScreenActivity.this, SweetAlertDialog.PROGRESS_TYPE)
                        .setTitleText("로그인중...");
                autoLoginProgressDialog.setCancelable(false);
                autoLoginProgressDialog.show();

                LoginService.AutoLogin(new OnCompleteListener<AuthResult>()
                {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                                autoLoginProgressDialog.dismiss();

                                if (task.getException() == null){
                                        MoveToMainActivity();
                                }else {
                                        SweetAlertDialog errorDialog = new SweetAlertDialog(SplashScreenActivity.this, SweetAlertDialog.ERROR_TYPE)
                                                .setTitleText("로그인 오류!")
                                                .setContentText(task.getException().getLocalizedMessage())

                                                .setConfirmText("오프라인으로 계속")
                                                .setConfirmClickListener(
                                                        new SweetAlertDialog.OnSweetClickListener()
                                                        {
                                                                @Override
                                                                public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                                        sweetAlertDialog.dismiss();
                                                                        MoveToMainActivity();
                                                                }
                                                        })

                                                .setCancelText("재시도")
                                                .setCancelClickListener(
                                                        new SweetAlertDialog.OnSweetClickListener()
                                                        {
                                                                @Override
                                                                public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                                        sweetAlertDialog.dismiss();
                                                                        MoveToMainAfterAutoLogin();
                                                                }
                                                        });
                                        errorDialog.setCancelable(false);
                                        errorDialog.show();
                                }
                        }
                });
        }*/
        /*
        void MoveToMainActivity(){
                Intent intent = new Intent(SplashScreenActivity.this, MainTabControllerActivity_v2.class);
                finish();
                startActivity(intent);
        }*/
}
