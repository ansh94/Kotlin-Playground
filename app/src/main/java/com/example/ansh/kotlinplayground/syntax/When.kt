package com.example.ansh.kotlinplayground.syntax

/**
 * Created by ansh on 06/02/18.
 */
class When {

    //using when as an expression inside a function
    fun describe(obj: Any): String =
            when (obj) {
                1 -> "One"
                "Hello" -> "Greeting"
                is Long -> "Long"
                !is String -> "Not a string"
                else -> "Unknown"
            }

    fun ifelseif() {
        var number = 234

        // traditional if-else-if chain
        if (number > 0) {
            print("number is bigger than 0")
        } else if (number < 0) {
            print("number is lower than 0")
        } else {
            print("number is 0")
        }

        // using when to replace the above chain
        when {
            number > 0 -> print("number is bigger than 0")
            number < 0 -> print("number is lower than 0")
            else -> print("number is 0")
        }
    }
}