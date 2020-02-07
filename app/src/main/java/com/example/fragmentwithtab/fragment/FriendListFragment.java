package com.example.fragmentwithtab.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.fragment.app.ListFragment;

/**
 * Created by aungaung.
 */

public class FriendListFragment extends ListFragment {

    private String[] friendList = new String[] {"Mg Aung", "Mg Mya", "Ma Hla", "Mg Zaw", "Ma Myo"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity().getBaseContext(), android.R.layout.simple_list_item_1, friendList);

        setListAdapter(arrayAdapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
