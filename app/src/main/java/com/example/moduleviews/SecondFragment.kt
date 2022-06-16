package com.example.moduleviews

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController


class SecondFragment : Fragment(R.layout.fragment_second) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val button:Button
        super.onViewCreated(view, savedInstanceState)
        button=view.findViewById(R.id.GotoButton)

        button.setOnClickListener(){
            findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)

    }


    }

}