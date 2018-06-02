package com.softmarshmallow.monkeyfriends.Views.ExtraOptionsView;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.softmarshmallow.monkeyfriends.R;

public class ExtraOptionsViewFragment extends Fragment
{

        public ExtraOptionsViewFragment() {
                // Required empty public constructor
        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

                // Inflate the layout for this fragment
                return inflater.inflate(R.layout.fragment_extra_options_view, container, false);
        }

}

