package com.example.view

import com.example.Styles
import com.example.controller.MainController
import javafx.geometry.Pos
import tornadofx.*


class MainView : View("label 1") {
    override val root = vbox {
        alignment = Pos.CENTER
        spacing = 100.0
        val MainController = find(MainController::class)


        label(MainController.labelText) {

            addClass(Styles.heading)

        }

        button {
            this.text = "test"
            action {
                MainController.rndm()

            }

        }
    }
}

