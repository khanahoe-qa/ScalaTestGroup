package com.qa.scalaTestGroup

class FunsuiteTVTest extends FunSuiteBaseClass {

	var tv: FunsuiteTV = _

	before {
		println("before")
		tv = new FunsuiteTV()
	}

	test("A new tv should be powered off") {
		assert(!tv.isOn())
	}

	test("After pressing power button on a tv that is off, tv should power on") {
		tv.turnTVOn()
		assert(tv.isOn())
	}

	test("After powering off the tv should be off"){
		tv.turnTVOn()
		assert(tv.isOn())
		tv.turnTVOff()
		assert(!tv.isOn())
	}

}