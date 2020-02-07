package com.example.fragmentwithtab;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import com.example.fragmentwithtab.adapter.MainFragmentPagerAdapter;
import com.example.fragmentwithtab.adapter.ViewPagerAdapter;
import com.example.fragmentwithtab.fragment.AddressList;
import com.example.fragmentwithtab.fragment.CoffeeListFragment;
import com.example.fragmentwithtab.fragment.FriendListFragment;
import com.example.fragmentwithtab.fragment.PhoneList;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    ViewPagerAdapter adapter;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.pager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new AddressList(),"");
        adapter.AddFragment(new CoffeeListFragment(), "");
        adapter.AddFragment(new FriendListFragment(), "");
        adapter.AddFragment(new PhoneList(),"");
        viewPager.setAdapter(adapter);
       tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Address");
        tabLayout.getTabAt(1).setText("Coffee");
        tabLayout.getTabAt(2).setText("Friends");
        tabLayout.getTabAt(3).setText("Contact");
    }
}
