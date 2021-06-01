package com.example.ataei.ui.home.list

import com.example.ataei.databinding.FragmentHomeListBinding
import com.example.ataei.ui.base.BaseFragment
import com.example.ataei.ui.base.ViewModelScope
import com.example.ataei.ui.base.adapter.SingleLayoutAdapter

class HomeListFragment : BaseFragment<HomeListViewModel, FragmentHomeListBinding>() {

    override val layoutId: Int = com.example.ataei.R.layout.fragment_home_list
    override val viewModel: HomeListViewModel by getLazyViewModel(ViewModelScope.ACTIVITY)

    override fun onViewInitialized(binding: FragmentHomeListBinding) {
        super.onViewInitialized(binding)
        binding.viewModel = viewModel
    }


}