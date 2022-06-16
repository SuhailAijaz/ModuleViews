package com.example.moduleviews

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class ThirdFragment : Fragment(R.layout.fragment_third) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val button:Button
        super.onViewCreated(view, savedInstanceState)
        button=view.findViewById(R.id.you)
        button.setOnClickListener(){
            findNavController().navigate(R.id.action_thirdFragment_to_forthFragment)
        }
    }






}