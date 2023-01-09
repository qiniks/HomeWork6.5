package com.example.homework65.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.homework65.MainViewModel
import com.example.homework65.adapter.HistoryAdapter
import com.example.homework65.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    private lateinit var binding: FragmentThirdBinding
    private lateinit var viewModel: MainViewModel
    private var list: ArrayList<String> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
        initObserver()

        val historyAdapter = HistoryAdapter(list)
        binding.recyclerView.adapter = historyAdapter
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun initObserver() {
        viewModel.mHistory.observe(viewLifecycleOwner) {
            list.clear()
            list.add(it.toString())

            binding.recyclerView.adapter?.notifyDataSetChanged()
        }
    }
}