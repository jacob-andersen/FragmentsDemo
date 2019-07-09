package com.example.fragmentsdemo;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DynamicFragment extends Fragment {
    private static final String TAG = "Dynamic Fragment";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myLayout = inflater.inflate(R.layout.fragment_dynamic,container, false);
        Log.d(TAG,"onCreateView");
        return myLayout;
    }

    public void incrementCount(){
        Dashboard.counter++;
    }
}
