package com.example.fragmentwithtab.adapter;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.fragmentwithtab.fragment.AddressList;
import com.example.fragmentwithtab.fragment.CoffeeListFragment;
import com.example.fragmentwithtab.fragment.FriendListFragment;
import com.example.fragmentwithtab.fragment.PhoneList;

/**
 * Created by aungaung.
 */

public class MainFragmentPagerAdapter extends FragmentPagerAdapter {

    final int FRAGMENT_PAGE_COUNT = 4;

    public MainFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                //
                FriendListFragment friendListFragment = new FriendListFragment();
                return friendListFragment;
            case 1:
                //
                CoffeeListFragment coffeeListFragment = new CoffeeListFragment();
                return coffeeListFragment;
            case 2:
                //
                AddressList addressList = new AddressList();
                return addressList;
            case 3:
                //
                PhoneList phoneList = new PhoneList();
                return phoneList;
        }
        return null;
    }

    @Override
    public int getCount() {
        return FRAGMENT_PAGE_COUNT;
    }
}
