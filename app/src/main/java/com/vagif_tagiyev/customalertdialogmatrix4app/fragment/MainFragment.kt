package com.vagif_tagiyev.customalertdialogmatrix4app.fragment

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.vagif_tagiyev.customalertdialogmatrix4app.R
import com.vagif_tagiyev.customalertdialogmatrix4app.adapter.Adapter
import com.vagif_tagiyev.customalertdialogmatrix4app.databinding.FragmentMainBinding
import com.vagif_tagiyev.customalertdialogmatrix4app.dialog.AddDialogClickListener
import com.vagif_tagiyev.customalertdialogmatrix4app.dialog.AddDialogFragment
import com.vagif_tagiyev.customalertdialogmatrix4app.model.Person

class MainFragment : Fragment(), AddDialogClickListener {
    lateinit var fragmentMainBinding: FragmentMainBinding
    private var TAG = "MainFragment"
    private val addDialogFragment by lazy{AddDialogFragment()}
    private lateinit var adapter: Adapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        fragmentMainBinding = FragmentMainBinding.inflate(layoutInflater,container,false)
        adapter = Adapter(arrayListOf())
        fragmentMainBinding.rv.adapter = adapter

        fragmentMainBinding.rv.apply {
            adapter = this@MainFragment.adapter
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
        }
        fragmentMainBinding.addMainBtn.setOnClickListener {
            val args = Bundle()
            args.putSerializable("AddDialogListener", this)
            addDialogFragment.show(childFragmentManager, "AddDialog")
        }
        return fragmentMainBinding.root
    }

    override fun onAddClick(person: Person) {
        adapter.addPerson(person)
    }


}