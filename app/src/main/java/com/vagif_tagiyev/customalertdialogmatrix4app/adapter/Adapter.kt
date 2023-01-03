package com.vagif_tagiyev.customalertdialogmatrix4app.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.vagif_tagiyev.customalertdialogmatrix4app.databinding.ListItemBinding
import com.vagif_tagiyev.customalertdialogmatrix4app.model.Person

class Adapter(private val context: Context, private val personList: List<Person>) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {

    inner class ViewHolder(val holderBinding: ListItemBinding) :
        RecyclerView.ViewHolder(holderBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ListItemBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val person = personList[position]
        holder.holderBinding.also {
            it.itemId.text = person.personID.toString()
            it.itemName.text = person.personName
            it.itemSurname.text = person.personSurname
            it.itemAge.text = person.personAge.toString()
        }
    }

    override fun getItemCount() = personList.size


}