package com.binar.navsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController

class FourthFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.fourth_fragment_button)
        val age = view.findViewById<EditText>(R.id.age_edit_text)
        val address = view.findViewById<EditText>(R.id.address_edit_text)
        val work = view.findViewById<EditText>(R.id.work_edit_text)

        button.setOnClickListener {
            val info = InfoParcelable(
                name = nameGlobal,
                age = age.text.toString().toInt(),
                address = address.text.toString(),
                work = work.text.toString()
            )

            findNavController().navigate(FourthFragmentDirections.actionFourthFragmentToThirdFragment(info))
        }

    }
}