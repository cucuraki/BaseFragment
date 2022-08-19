package com.example.basefragment.fragments.basefragments

import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.example.basefragment.globaltypes.Inflater

abstract class BaseFragmentVM<VB: ViewBinding, VM: ViewModel>(private val inflater: Inflater<VB>, private val viewModelClass: Class<VM>): BaseFragment<VB>(inflater) {

    private lateinit var _viewModel: VM
    protected val viewModel get() = _viewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _viewModel = ViewModelProvider(this)[viewModelClass]
    }
}