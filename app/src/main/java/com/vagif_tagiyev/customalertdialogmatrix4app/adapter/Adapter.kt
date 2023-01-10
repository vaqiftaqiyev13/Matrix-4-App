package com.vagif_tagiyev.customalertdialogmatrix4app.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import android.widget.Toast.makeText
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.vagif_tagiyev.customalertdialogmatrix4app.databinding.ListItemBinding
import com.vagif_tagiyev.customalertdialogmatrix4app.fragment.MainFragmentDirections
import com.vagif_tagiyev.customalertdialogmatrix4app.model.Person

class Adapter(private var personList: ArrayList<Person>) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {

    var onItemClick:((Person) -> Unit)? = null

    inner class ViewHolder(val holderBinding: ListItemBinding) :
        RecyclerView.ViewHolder(holderBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val person = personList[position]
        holder.holderBinding.also {
            it.itemId.text = person.personID.toString()
            it.itemName.text = person.personName
            it.itemSurname.text = person.personSurname
            it.itemAge.text = person.personAge.toString()
        }

        holder.itemView.setOnClickListener {
               onItemClick?.invoke(person)

        }
    }

    override fun getItemCount() = personList.size

    fun addPerson(person: Person){
        personList.add(person)
        notifyItemInserted(personList.size-1)
    }

    fun updateElements(newList: ArrayList<Person>){
        this.personList = newList
        notifyDataSetChanged()
    }


}