package com.qa.scalaTestGroup

import org.scalatest.funspec.AnyFunSpec

class FunSpecTVTest extends AnyFunSpec {

  var tv: FunSpecTV = new FunSpecTV()

  describe("A TV") {
    describe("when new") {
      it("should be powered off") {
        assert(!tv.isOn())
      }
    }
  }

  describe("After pressing power button") {
    describe("on a tv that is powered off") {
      it("should power on") {
        tv.turnTVOn()
        assert(tv.isOn())
      }
    }
  }

  describe("After powering the tv off") {
    it("should be off") {
      tv.turnTVOn()
      assert(tv.isOn())
      tv.turnTVOff()
      assert(!tv.isOn())
    }
  }

}
