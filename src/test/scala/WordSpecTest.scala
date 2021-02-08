


class WordSpecTest  extends WordSpecBaseClass {

  var tv: TV = _

  before {
    println("before")
    tv = new TV()
  }

  "A TV" when {
    "off" should {
      "have no power" in {
        assert(tv.isOn() === false)
      }
    }
  }

  "A TV" when {
    "switched on" should {
      "have power" in {
        tv.turnTVOn()
        assert(tv.isOn())
      }
    }
  }


  "A TV" when {
    "switched on then off" should {
      "have no power again" in {
        tv.turnTVOn()
        assert(tv.isOn())
        tv.turnTVOff()
        assert(!tv.isOn())
      }
    }
  }


  "A Set" when {
    "empty" should {
      "have size 0" in {
        assert(Set.empty.size == 0)
      }

      "produce NoSuchElementException when head is invoked" in {
        assertThrows[NoSuchElementException] {
          Set.empty.head
        }
      }
    }
  }

}
