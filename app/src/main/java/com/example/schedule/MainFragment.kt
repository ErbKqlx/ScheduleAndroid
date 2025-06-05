package com.example.schedule

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

class MainFragment : Fragment(R.layout.fragment_main) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val button = view.findViewById<android.widget.Button>(R.id.button_show_table)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_teachersFragment)
        }
    }
}