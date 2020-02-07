package com.example.fragmentwithtab.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.fragment.app.ListFragment;

/**
 * Created by UCSM on 10/11/2016.
 */

public class PhoneList extends ListFragment {
    private String[] phonelist = new String[] {"09795014119", "09403726725", "09259749687", "09960316319", "0949101626"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity().getBaseContext(), android.R.layout.simple_list_item_1, phonelist);

        setListAdapter(arrayAdapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}

