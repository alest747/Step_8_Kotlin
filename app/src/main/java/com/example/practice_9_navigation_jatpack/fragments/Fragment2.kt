package com.example.practice_9_navigation_jatpack.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.practice_9_navigation_jatpack.R

class Fragment2 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val buttonFrag1 = view.findViewById<Button>(R.id.buttonFragment1)
        val buttonMain = view.findViewById<Button>(R.id.buttonMain2)

        val controller = findNavController()
        buttonFrag1.setOnClickListener { controller.navigate(R.id.fragment1) }
        buttonMain.setOnClickListener { controller.navigate(R.id.mainFragment) }
    }
}