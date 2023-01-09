package com.vagif_tagiyev.customalertdialogmatrix4app.model
@Parcalize
data class Person(
    var personID: Long?, val personName:String,
    val personSurname:String,
    val personAge:Int)

annotation class Parcalize

