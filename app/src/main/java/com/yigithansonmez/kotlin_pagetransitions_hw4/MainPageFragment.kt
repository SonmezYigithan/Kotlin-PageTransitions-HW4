package com.yigithansonmez.kotlin_pagetransitions_hw4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.yigithansonmez.kotlin_pagetransitions_hw4.databinding.FragmentMainPageBinding

class MainPageFragment : Fragment() {
    private lateinit var tasarim:FragmentMainPageBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim =  FragmentMainPageBinding.inflate(inflater, container, false)

        tasarim.button.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.goToPageA)
        }

        tasarim.button2.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.goToPageX)
        }

        return tasarim.root
    }
}