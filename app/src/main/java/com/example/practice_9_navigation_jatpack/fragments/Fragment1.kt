package com.example.practice_9_navigation_jatpack.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.practice_9_navigation_jatpack.R

class Fragment1 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val buttonFrag2 = view.findViewById<Button>(R.id.buttonFragment2)
        val buttonMain = view.findViewById<Button>(R.id.buttonMain1)

        val controller = findNavController()
        buttonFrag2.setOnClickListener { controller.navigate(R.id.fragment2) }
        buttonMain.setOnClickListener { controller.navigate(R.id.mainFragment) }
    }
}