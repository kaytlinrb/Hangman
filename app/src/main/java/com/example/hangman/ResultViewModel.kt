package com.example.hangman

import androidx.lifecycle.ViewModel

class ResultViewModel(finalResult: String) : ViewModel() {
    val result = finalResult
}