package com.example.viewpagerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    lateinit var viewPager:ViewPager2
    lateinit var adapter: ViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager=findViewById(R.id.viewPager)

        val images= listOf(
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four
        )

        adapter=ViewPagerAdapter(images)
        viewPager.adapter=adapter

//        viewPager.fakeDragBy(-10f)
//        viewPager.endFakeDrag()


    }
}