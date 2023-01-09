package com.example.homework65

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var mCounter = MutableLiveData<Int>()
    var mHistory: MutableLiveData<MutableList<String>> = MutableLiveData()


    private var history = ArrayList<String>()
    private var counter = 0

    fun onIncrement() {
        counter++
        mCounter.value = counter
        history.add("+")
        mHistory.value = history
    }

    fun onDecrement() {
        counter--
        mCounter.value = counter
        history.add("-")
        mHistory.value = history
    }
}