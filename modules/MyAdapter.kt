package com.kindsapplication.app.modules

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kindsapplication.app.R

class AdapterClass(private val userlist: ArrayList<Camp>):RecyclerView.Adapter<AdapterClass.ViewHolderClass>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycleitem_layout,parent, false)
        return ViewHolderClass(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem = userlist[position]
        holder.regenername.text = currentItem.campname

    }

    override fun getItemCount(): Int {
        return userlist.size
    }
    class ViewHolderClass(itemView: View): RecyclerView.ViewHolder(itemView) {
        val regenername:TextView = itemView.findViewById(R.id.admdetcampname)
    }
}