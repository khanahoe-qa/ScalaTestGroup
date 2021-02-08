
class FlatSpecTest extends FlatSpecBaseClass {

  var tv: TV = _

  before {
    println("before")
    tv = new TV()
  }

  "A TV" should "have no power if it is not switched on" in {
    assert(tv.isOn() === false)
  }

  it should "turn on" in {
    tv.turnTVOn()
    assert(tv.isOn())
  }

  it should "turn off" in {
    tv.turnTVOn()
    assert(tv.isOn())
    tv.turnTVOff()
    assert(!tv.isOn())
  }

  it should "produce NoSuchElementException when head is invoked" in {
    assertThrows[NoSuchElementException] {
      Set.empty.head
    }
  }
}
