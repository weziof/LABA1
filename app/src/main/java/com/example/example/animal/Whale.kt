package com.example.example.animal

import android.util.Log

class Whale: Animal(animalOld = 3) {
    override fun swim(name: String) {
        Log.d(name, "swim")
        super.swim(name)
    }

    override fun fountain(name: String) {
        Log.d(name, "fountain")
        super.fountain(name)
    }
}