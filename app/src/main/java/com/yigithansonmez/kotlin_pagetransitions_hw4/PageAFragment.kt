package com.yigithansonmez.kotlin_pagetransitions_hw4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.yigithansonmez.kotlin_pagetransitions_hw4.databinding.FragmentPageABinding

class PageAFragment : Fragment() {
    private lateinit var tasarim:FragmentPageABinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim =  FragmentPageABinding.inflate(inflater, container, false)

        tasarim.button3.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.goToPageB)
        }

        return tasarim.root
    }
}