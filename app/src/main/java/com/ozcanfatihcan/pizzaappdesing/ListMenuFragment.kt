package com.ozcanfatihcan.pizzaappdesing

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ozcanfatihcan.pizzaappdesing.databinding.FragmentListMenuBinding


class ListMenuFragment : Fragment() {
    private lateinit var binding:FragmentListMenuBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentListMenuBinding.inflate(inflater,container,false)
        binding.card2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.detailScreenFragment)
        }
        return binding.root
    }
}