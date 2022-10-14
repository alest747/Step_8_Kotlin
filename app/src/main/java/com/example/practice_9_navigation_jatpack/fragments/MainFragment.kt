package com.example.practice_9_navigation_jatpack.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.practice_9_navigation_jatpack.R

class MainFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bF1 = view.findViewById<Button>(R.id.buttonF1)  //кнопки
        val bF2 = view.findViewById<Button>(R.id.buttonF2)

        val controller = findNavController()  //находим контролер навигатора

        bF1.setOnClickListener { controller.navigate(R.id.fragment1) }  //слушатель нажатий кнопки
        bF2.setOnClickListener { controller.navigate(R.id.fragment2) }  //указываем навигацию фрагмента, который должен открыться при нажатии на кнопку
    }
}