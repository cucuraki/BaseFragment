package com.example.basefragment.fragments

import android.content.Intent
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.basefragment.databinding.HomeFragmentBinding
import com.example.basefragment.fragments.basefragments.BaseFragmentVM
import kotlinx.coroutines.launch

class HomeFragment : BaseFragmentVM<HomeFragmentBinding, HomeViewModel>(HomeFragmentBinding::inflate, HomeViewModel::class.java) {
    override fun listeners() {
        binding.btn.setOnClickListener{
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToFragment2())
        }
    }

    override fun bindObservers() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.testFlow.collect {
                val intent: Intent? = requireContext().packageManager.getLaunchIntentForPackage(it)
                intent?.let {
                    startActivity(intent)
                }
            }
        }
    }

}