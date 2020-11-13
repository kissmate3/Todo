package com.example.todo

interface UpdateAndDelete{

    fun modifyItem(itemUID :String, isDone :Boolean )
    fun onItemDelete(itemUID: String)
}