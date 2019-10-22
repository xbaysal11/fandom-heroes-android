package com.example.fandomheroesandroid

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class HeroesRecyclerViewAdapter(private val heroes: List<Hero>) :
    RecyclerView.Adapter<HeroesRecyclerViewAdapter.ViewHolder>() {

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val view = LayoutInflater.from(context).inflate(R.layout.item_hero, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(heroes[position])
    }

    override fun getItemCount(): Int = heroes.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val tvName: TextView = itemView.findViewById(R.id.tv_name)
        private val tvPowerType: TextView = itemView.findViewById(R.id.tv_powerType)
        private val tvAge: TextView = itemView.findViewById(R.id.tv_age)
        private val ivPhoto: ImageView = itemView.findViewById(R.id.iv_photo)

        fun Context.toast(message:CharSequence) =
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
        fun Context.toastLong(message:CharSequence) =
            Toast.makeText(this,message,Toast.LENGTH_LONG).show()

        fun bind(Hero: Hero) {
            tvName.text = Hero.name
            ivPhoto.setImageResource(Hero.imgRes)
            tvPowerType.text = Hero.powerType
            tvAge.text = Hero.age

            itemView.setOnLongClickListener {
                Intent(context, DetailActivity::class.java).also {
                    it.putExtra("Hero", Hero)
                    context.startActivity(it)
                }
                true
            }
            itemView.setOnClickListener {
                Toast.makeText(context,"It is single click toast!"+ Hero.name, Toast.LENGTH_SHORT).show()
            }

        }
    }
}