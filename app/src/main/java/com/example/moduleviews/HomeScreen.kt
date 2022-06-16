package com.example.moduleviews

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope


class HomeScreen : Fragment(R.layout.fragment_home_screen) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fun istuser(){
            Log.e("Tag","suhail")
        }
suspend  fun suhail(){
    val user=istuser()

}
    }

    }
