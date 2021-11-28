package com.example.fragments.Fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragments.R

class FragmentOne : Fragment(R.layout.fragment_one) {

    private lateinit var editTextAmount: EditText
    private lateinit var buttonSend: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editTextAmount = view.findViewById(R.id.editTextAmount)
        buttonSend = view.findViewById(R.id.buttonSend)

        buttonSend.setOnClickListener(){
            editTextAmount.text.clear()


        }
    }


}