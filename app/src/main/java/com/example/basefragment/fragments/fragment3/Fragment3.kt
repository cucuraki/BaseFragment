package com.example.basefragment.fragments.fragment3

import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.basefragment.databinding.Fragment3Binding
import com.example.basefragment.fragments.basefragments.BaseFragmentSharedVM
import com.example.basefragment.fragments.fragment2.Fragment2ViewModel
import kotlinx.coroutines.launch

class Fragment3 : BaseFragmentSharedVM<Fragment3Binding,Fragment2ViewModel>(Fragment3Binding::inflate, Fragment2ViewModel::class.java) {
    override fun listeners() {
        binding.btn.setOnClickListener{
            findNavController().navigate(Fragment3Directions.actionFragment3ToFragment2())
        }
    }

    override fun bindObservers() {
        binding.btn.text = viewModel.count.toString()
    }

}