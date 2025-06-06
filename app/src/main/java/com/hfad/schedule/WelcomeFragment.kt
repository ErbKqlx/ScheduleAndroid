package com.hfad.schedule

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_welcome, container, false)
        val showTeachersButton = view.findViewById<Button>(R.id.button_show_teachers)
        val showGroupsButton = view.findViewById<Button>(R.id.button_show_groups)
        val showCabinetsButton = view.findViewById<Button>(R.id.button_show_cabinets)
        val showDisciplinesButton = view.findViewById<Button>(R.id.button_show_disciplines)

        showTeachersButton.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_welcomeFragment_to_teachersFragment)
        }

        showGroupsButton.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_welcomeFragment_to_groupsFragment)
        }

        showCabinetsButton.setOnClickListener{
            view.findNavController()
                .navigate(R.id.action_welcomeFragment_to_cabinetsFragment)
        }

        showDisciplinesButton.setOnClickListener{
            view.findNavController()
                .navigate(R.id.action_welcomeFragment_to_disciplinesFragment)
        }

        return view
    }
}