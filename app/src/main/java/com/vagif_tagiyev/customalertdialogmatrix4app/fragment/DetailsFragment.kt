package com.vagif_tagiyev.customalertdialogmatrix4app.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.vagif_tagiyev.customalertdialogmatrix4app.R
import com.vagif_tagiyev.customalertdialogmatrix4app.databinding.FragmentDetailsBinding


class DetailsFragment : Fragment() {
    val args:DetailsFragmentArgs by navArgs()

    lateinit var detailsBinding:FragmentDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        detailsBinding = FragmentDetailsBinding.inflate(layoutInflater,container,false)

        detailsBinding.detailsId.text = args.person.personID.toString()

        detailsBinding.detailsName.text = args.person.personName

        detailsBinding.detailsSurname.text = args.person.personSurname

        detailsBinding.detailsAge.text = args.person.personAge.toString()





        return detailsBinding.root
    }

}