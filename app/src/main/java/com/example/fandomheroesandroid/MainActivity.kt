package com.example.fandomheroesandroid


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = HeroesRecyclerViewAdapter(getHeroes().apply {})
    }

    private fun getHeroes() = arrayListOf(
        Hero("Flash", "Power Type: Fast Hero","Age: 25", R.drawable.flash),
        Hero("Batman", "Power Type: Fly Hero","Age: 45", R.drawable.batman),
        Hero("Fish man", "Power Type: Strong Hero","Age: 15", R.drawable.flash),
        Hero("Super man", "Power Type: Big Hero","Age: 20", R.drawable.sman),
        Hero("Hulk", "Power Type: Small Hero","Age: 15", R.drawable.hulk),
        Hero("Doctor Strange", "Power Type: Fly Hero","Age: 25", R.drawable.strange),
        Hero("Bill ", "Power Type: Strong Hero","Age: 35", R.drawable.flash),
        Hero("Iron Man", "Power Type: Fast Hero","Age: 22", R.drawable.iron),
        Hero("Arrow", "Power Type: Strong Hero","Age: 20", R.drawable.flash),
        Hero("Spider Man", "Power Type: Spider like Hero","Age:22", R.drawable.spider)
    )
}