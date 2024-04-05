package com.example.json

data class Potion(
    val name:String,
    val effect:String,
    val potency:Int
)

fun main(){

    val healingPotion=Potion("Healing potion","Restores health",50)
    val invisibility=Potion("Invisibility Potion","Grants invisibility",40)
    val strengthPotion=Potion("Strength Potion","Boosts strength",60)

    val potionList=listOf(healingPotion,invisibility,strengthPotion)

    println(potionList)
}