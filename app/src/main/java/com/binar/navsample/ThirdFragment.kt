package com.binar.navsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

//lateinit var nameGlobal: String

class ThirdFragment : Fragment() {

    private val arguments: ThirdFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.button_third_fragment)
        val name = view.findViewById<TextView>(R.id.name_text_view)
        val age = view.findViewById<TextView>(R.id.age_text_view)
        val address = view.findViewById<TextView>(R.id.address_text_view)
        val work = view.findViewById<TextView>(R.id.work_text_view)

        //inputs name from parcelable
        name.text = arguments.info.name

        //inputs age from parcelable
        if (arguments.info.age == 0) {
            age.text = ""
        } else {
            val num: Int = arguments.info.age

            if (num % 2 == 0) {
                age.text = "$num is an even number"
            } else {
                age.text = "$num is an odd number"
            }
        }

        // input address from parcelable
        address.text = arguments.info.address
        work.text = arguments.info.work

        button.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_fourthFragment) //goes to third fragment (action)
        }
    }
}