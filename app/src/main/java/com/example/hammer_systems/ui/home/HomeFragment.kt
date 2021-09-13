package com.example.hammer_systems.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hammer_systems.R
import com.example.hammer_systems.databinding.FragmentHomeBinding
import com.example.hammer_systems.ui.home.adapter.FoodAdapter
import com.example.hammer_systems.ui.home.adapter.AdAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment: Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private val viewModel: HomeViewModel by viewModels()
    private val foodAdapter = FoodAdapter()
    private val adAdapter = AdAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_home,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        setObservers()
        viewModel.getFoods()
        viewModel.getAds()
    }

    private fun initView() {
        //init food adapter
        binding.menuRecycler.adapter = foodAdapter
        binding.menuRecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL,false)

        //init ad Adapter

    }

    private fun setObservers() {
        viewModel.foods.observe(viewLifecycleOwner){
            foodAdapter.setData(it)
        }
        viewModel.ads.observe(viewLifecycleOwner){
            adAdapter.setData(it)
        }
    }
}