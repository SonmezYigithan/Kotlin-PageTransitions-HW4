package com.yigithansonmez.kotlin_pagetransitions_hw4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.yigithansonmez.kotlin_pagetransitions_hw4.databinding.FragmentPageXBinding
import com.yigithansonmez.kotlin_pagetransitions_hw4.databinding.FragmentPageYBinding

class PageYFragment : Fragment() {
    private lateinit var tasarim: FragmentPageYBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentPageYBinding.inflate(inflater, container, false)

        tasarim.button6.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.goToPageMain)
        }

        return tasarim.root
    }
}