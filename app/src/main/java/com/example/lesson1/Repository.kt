package com.example.lesson1

object Repository {

    private val usersList : List<User>

    init {
        usersList = listOf(
            User("Jenia", "Evteev"),
            User("Petya", "Petrov"),
            User("Ivan", "Ivanov")
        )
    }

    fun getUsersList() : List<User> {
        return usersList
    }

}