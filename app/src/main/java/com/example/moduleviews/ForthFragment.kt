package com.example.moduleviews

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class ForthFragment : Fragment(R.layout.fragment_forth) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val button:Button
        super.onViewCreated(view, savedInstanceState)
        button=view.findViewById(R.id.backbutton)
        button.setOnClickListener(){
            findNavController().navigate(R.id.action_forthFragment_to_firstFragment)


    }


    }


}