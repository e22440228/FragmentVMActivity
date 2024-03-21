package edu.temple.diceroll

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {

    private val selectNumber = MutableLiveData<Int>()

    fun setSelectNumber(number : Int){
        selectNumber.value = number
    }

    fun getSelectNumber() :LiveData<Int>{
        return selectNumber
    }

    fun updateNumber(newNum : Int){
        selectNumber.value = newNum
    }
}