package com.dev20.diyoutube

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController

import com.dev20.diyoutube.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,R.layout.fragment_title,container,false )


        binding.btnAutoFragment.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_titleFragment_to_autoFragment2)
        }
            binding.btnTechFragment.setOnClickListener { view: View ->
                view.findNavController().navigate(R.id.action_titleFragment_to_techFragment)
            }
                binding.btnHomeFragment.setOnClickListener { view: View ->
                    view.findNavController().navigate(R.id.action_titleFragment_to_homeFragment)
                }
                    binding.btnGardenFragment.setOnClickListener { view: View ->
                        view.findNavController()
                            .navigate(R.id.action_titleFragment_to_gardenFragment)
        }
        return binding.root

    }

}