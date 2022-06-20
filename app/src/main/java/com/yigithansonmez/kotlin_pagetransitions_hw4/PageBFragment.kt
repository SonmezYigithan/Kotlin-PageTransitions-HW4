package com.yigithansonmez.kotlin_pagetransitions_hw4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.yigithansonmez.kotlin_pagetransitions_hw4.databinding.FragmentMainPageBinding
import com.yigithansonmez.kotlin_pagetransitions_hw4.databinding.FragmentPageBBinding

class PageBFragment : Fragment() {
    private lateinit var tasarim:FragmentPageBBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentPageBBinding.inflate(inflater, container, false)

        tasarim.button4.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.goToPageYFromB)
        }

        return tasarim.root


    }
}