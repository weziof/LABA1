package com.example.example.animal

import android.util.Log

class Lion : Animal(animalOld = 5) {
    override fun voice(name: String) {
        Log.d(name, "voice")
        super.voice(name)
    }

    override fun run(name: String) {
        Log.d(name, "run")
        super.run(name)
    }
}