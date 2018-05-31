package com.includeazzu.azzunoticias.Fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.includeazzu.azzunoticias.R;

public class CsgoFragment extends Fragment {

    public CsgoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_csgo, container, false);
    }

    public interface OnNavigationItemSelectedListener {
    }
}
