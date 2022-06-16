package com.example.moduleviews

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment(R.layout.fragment_first2),View.OnClickListener{
    private lateinit var loginButton:Button
    private lateinit var registerButton:Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ids(view)
        registerButton.setOnClickListener(this)
        loginButton.setOnClickListener(this)
    }

    private fun ids(view: View) {
        loginButton  = view.findViewById<Button>(R.id.loginButton)
        registerButton=view.findViewById<Button>(R.id.registerButon)
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.registerButon->{
                findNavController().navigate(R.id.action_firstFragment_to_secondFragment)

            }
            R.id.loginButton->{
                findNavController().navigate(R.id.action_firstFragment_to_homeScreen2)

            }

        }
    }
}