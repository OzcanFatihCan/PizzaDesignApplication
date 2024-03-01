package com.ozcanfatihcan.pizzaappdesing

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ozcanfatihcan.pizzaappdesing.databinding.FragmentEntranceScreenBinding


class EntranceScreenFragment : Fragment() {
    private lateinit var binding: FragmentEntranceScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentEntranceScreenBinding.inflate(inflater, container, false)
        binding.buttonList.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.listMenuFragment)
        }
        return binding.root
    }
}