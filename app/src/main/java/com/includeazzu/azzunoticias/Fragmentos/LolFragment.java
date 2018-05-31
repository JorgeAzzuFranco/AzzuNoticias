package com.includeazzu.azzunoticias.Fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.includeazzu.azzunoticias.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LolFragment extends Fragment {

    public LolFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lol, container, false);
    }

    public interface OnNavigationItemSelectedListener {
    }
}
