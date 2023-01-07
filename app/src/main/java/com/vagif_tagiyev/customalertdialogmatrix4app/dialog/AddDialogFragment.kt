package com.vagif_tagiyev.customalertdialogmatrix4app.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.vagif_tagiyev.customalertdialogmatrix4app.databinding.FragmentAddDialogBinding
import com.vagif_tagiyev.customalertdialogmatrix4app.model.Person

class AddDialogFragment : DialogFragment() {
    var id:Long = 0
    private lateinit var binding: FragmentAddDialogBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentAddDialogBinding.inflate(inflater, container, false)

        binding.addBtn.setOnClickListener {
            val listener =
                requireArguments().getSerializable("AddDialogListener")!! as AddDialogClickListener


            listener.onAddClick(
                person = Person(
                    id++, binding.nameLayout.editText!!.text.toString(),
                    binding.surnameEditTxt.text.toString(),
                    binding.ageEditTxt.text.toString().toInt()

                )
            )
            dismiss()
        }

        return binding.root
    }

}

fun interface AddDialogClickListener : java.io.Serializable {
    fun onAddClick(person: Person)
}