package com.example.homework65

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.homework65.adapter.PagerAdapter
import com.example.homework65.databinding.ActivityMainBinding
import com.example.homework65.fragments.FirstFragment
import com.example.homework65.fragments.SecondFragment
import com.example.homework65.fragments.ThirdFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewPager: ViewPager2
    private var list : ArrayList<Fragment> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fillList()

        viewPager = binding.viewPager
        viewPager.adapter = PagerAdapter(this, list)

    }

    private fun fillList() {
        list.add(FirstFragment())
        list.add(SecondFragment())
        list.add(ThirdFragment())
    }
}