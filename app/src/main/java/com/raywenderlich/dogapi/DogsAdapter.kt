package com.raywenderlich.dogapi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DogsAdapter (private val images:List<String>):RecyclerView.Adapter<DogsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogsViewHolder {
       val layoutInflater = LayoutInflater.from(parent.context)
        return DogsViewHolder(layoutInflater.inflate(R.layout.item_dog , parent, false))
    }

    override fun onBindViewHolder(holder: DogsViewHolder, position: Int) {
        val item:String = images [position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = images.size


}