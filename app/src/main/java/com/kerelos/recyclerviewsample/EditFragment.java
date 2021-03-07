package com.kerelos.recyclerviewsample;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.kerelos.recyclerviewsample.model.Student;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */

public class EditFragment extends Fragment implements AdapterCallback {


    ArrayList<Student> all = new ArrayList<>();

    private MyRVAdapter mMyAdapter;


    public EditFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edit, container, false);
    }

    @Override
    public void onMethodCallback() {
            // DO something
        Toast.makeText(getContext(), "Test All ", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

     //    all = null;
    //    this.mMyAdapter = new MyRVAdapter(all); // this class implements callback

    }
}
