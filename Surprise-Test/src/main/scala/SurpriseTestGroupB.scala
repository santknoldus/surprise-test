package com.knoldus.surprisetest

import sun.security.util.Length

// capitalise a particular character in a string also display count of that character
object SurpriseTestGroupB extends App{

  def capitalise(string: String, character: Char): String = {
    def iterator(length: Int = string.length-1): Int = {
      if(string.charAt(length) == character){
        string.replace(string.charAt(length),string.charAt(length).toUpper)
      }
      iterator(length-1)
    }
    string
  }
}
