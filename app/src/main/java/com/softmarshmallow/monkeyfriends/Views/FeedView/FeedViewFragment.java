package com.softmarshmallow.monkeyfriends.Views.FeedView;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.softmarshmallow.monkeyfriends.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FeedViewFragment extends Fragment
{

        
        public FeedViewFragment() {
                // Required empty public constructor

        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
                View v = inflater.inflate(R.layout.fragment_feed_view, container, false);

                return inflater.inflate(R.layout.fragment_feed_view, container, false);
        }

}
