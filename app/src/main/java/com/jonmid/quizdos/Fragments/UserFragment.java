package com.jonmid.quizdos.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import com.jonmid.quizdos.Adapter.UserAdapterOlivaCristian;
import com.jonmid.quizdos.Models.UserModelOlivaCristian;
import com.jonmid.quizdos.R;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserFragment extends Fragment {

    ProgressBar progressBar;
    Button button;
    RecyclerView recyclerView;
    List<UserModelOlivaCristian> modelOlivaCristianListList;

    UserAdapterOlivaCristian userAdapterOlivaCristian;






    public UserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user, container, false);




    }

}
