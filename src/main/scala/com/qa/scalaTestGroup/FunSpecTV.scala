package com.qa.scalaTestGroup

class FunSpecTV(var power: Boolean = false)
{
  def isOn(): Boolean = power

  def turnTVOn(): Unit = power = true

  def turnTVOff(): Unit = power = false
}
