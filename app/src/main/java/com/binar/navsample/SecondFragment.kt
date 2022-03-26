package com.binar.navsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

lateinit var nameGlobal: String

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.button_second_fragment)
        val nameEditText = view.findViewById<EditText>(R.id.name_edit_text)

        button.setOnClickListener {
            nameGlobal = nameEditText.text.toString()
            val info = InfoParcelable(
                name = nameGlobal,
                age = 0,
                address = "",
                work = ""
            )
            findNavController().navigate(SecondFragmentDirections.actionSecondFragmentToThirdFragment(info)) //brings data to third fragment
        }


    }
}