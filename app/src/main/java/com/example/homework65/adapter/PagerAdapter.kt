package com.example.homework65.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(fa: FragmentActivity, private var fragmentList : List<Fragment>) : FragmentStateAdapter(fa) {

    override fun getItemCount(): Int = fragmentList.size

    override fun createFragment(position: Int): Fragment {

        return fragmentList[position]

    }

}