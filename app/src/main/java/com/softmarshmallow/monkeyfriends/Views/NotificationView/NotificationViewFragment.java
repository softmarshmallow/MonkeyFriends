package com.softmarshmallow.monkeyfriends.Views.NotificationView;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.softmarshmallow.monkeyfriends.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationViewFragment extends Fragment
{
        
        
        public NotificationViewFragment() {
                // Required empty public constructor
        }
        
        
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
                // Inflate the layout for this fragment
                return inflater.inflate(R.layout.fragment_notification_view, container, false);
        }
        
}
