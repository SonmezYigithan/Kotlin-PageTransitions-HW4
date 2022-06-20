package com.yigithansonmez.kotlin_pagetransitions_hw4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.yigithansonmez.kotlin_pagetransitions_hw4.databinding.FragmentPageBBinding
import com.yigithansonmez.kotlin_pagetransitions_hw4.databinding.FragmentPageXBinding

class PageXFragment : Fragment() {
    private lateinit var tasarim: FragmentPageXBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentPageXBinding.inflate(inflater, container, false)

        tasarim.button5.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.goToPageYFromX)
        }

        return tasarim.root
    }
}