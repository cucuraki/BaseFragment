package com.example.basefragment.fragments.fragment2


import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.basefragment.databinding.Fragment2FragmentBinding
import com.example.basefragment.fragments.basefragments.BaseFragmentSharedVM
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Fragment2 : BaseFragmentSharedVM<Fragment2FragmentBinding, Fragment2ViewModel>(Fragment2FragmentBinding::inflate, Fragment2ViewModel::class.java) {
    private var count = 0
    private var over = false
    override fun listeners() {
        binding.btn.setOnClickListener{
            if(!over){
                count++
            }else{
                viewModel.count += count
                findNavController().navigate(Fragment2Directions.actionFragment2ToFragment3())
            }
        }
    }

    override fun bindObservers() {
        over = false
        viewLifecycleOwner.lifecycleScope.launch{
            delay(5000)
            over = true
        }
    }
}