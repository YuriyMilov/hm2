package com.quicklydone.hm2.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.quicklydone.hm2.R;

/**
 * Created by User on 11/11/2017.
 */

public class FragmentEntertainment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
     //   View view = inflater.inflate(R.layout.green_activity,container,false);

        View view = inflater.inflate(R.layout.txt,container,false);
        WebView wv=view.findViewById(R.id.webview);
        wv.loadUrl("https://qdone4444.appspot.com/rss?http://gamesnews.quicklydone.com/p/entertainment.html");



        return view;
    }
}
