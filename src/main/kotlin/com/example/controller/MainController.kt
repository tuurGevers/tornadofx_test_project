package com.example.controller

import javafx.beans.property.SimpleStringProperty
import tornadofx.Controller
import kotlin.random.Random

class MainController:Controller() {
    var labelText = SimpleStringProperty()

    fun rndm(){
        labelText.value =  Random.nextInt(0, 10).toString()


    }
}