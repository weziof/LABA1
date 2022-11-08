package com.example.example.animal

import android.util.Log

open class Animal(private val animalOld: Int) : InterfaceAnimal {
    private var sayAnimal: String = ""

    val arrayOfAnimal = arrayOf("Lion", "Whale", "Eagle")

    override fun voice(name: String) {
        sayAnimal = "scream"
        if (animalOld > 0) {
            for (i in arrayOfAnimal.indices) {
                if (arrayOfAnimal[i] == name) {
                    Log.d("Animal", "$name $sayAnimal")
                }
            }
        }
    }
    override fun fly(name: String) {
        var counter = 0
        while (counter < arrayOfAnimal.size) {
            if (arrayOfAnimal[counter] == name) {
                Log.d(name, "Eagle fly")
            }
            ++counter
        }
    }
    override fun run(name: String) {
        var counter = 0
        while (counter < arrayOfAnimal.size) {
            if (arrayOfAnimal[counter] == name) {
                Log.d(name, "Lion run")
            }
            ++counter
        }
    }
    override fun swim(name: String) {
        var counter = 0
        while (counter < arrayOfAnimal.size) {
            if (arrayOfAnimal[counter] == name) {
                Log.d(name, "Whale swim")
            }
            ++counter
        }
    }
    override fun fountain(name: String) {
        var counter = 0
        while (counter < arrayOfAnimal.size) {
            if (arrayOfAnimal[counter] == name) {
                Log.d(name, "Whale make a fountain")
            }
            ++counter
        }
    }
}