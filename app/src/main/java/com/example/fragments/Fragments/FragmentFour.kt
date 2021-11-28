package com.example.fragments.Fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragments.R

class FragmentFour : Fragment(R.layout.fragment_four) {

    private lateinit var text1: EditText
    private lateinit var button1: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        text1 = view.findViewById(R.id.text1)
        button1 = view.findViewById(R.id.button1)

        button1.setOnClickListener(){
            val text2 = text1.text.toString().trim()

            if (text1.length()>0){
                Toast.makeText(activity, "თქვენი ნაშრომი წარმატებით აიტვირთა.გილოცავთ!", Toast.LENGTH_SHORT).show()
                text1.text.clear()
            }else
                text1.error = "შეიტანეთ ტექსტი"




        }

    }
}


