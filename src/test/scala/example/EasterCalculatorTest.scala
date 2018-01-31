package example

import org.scalatest.{FunSuite, Matchers, WordSpec}

class EasterCalculatorTest extends WordSpec with Matchers{

  "EasterCalculator" should {
    "calculate year, month, day for 2017" in {
      val year = 2017
      val result = EasterCalculator.easter(year)

      result should be (2017,4,16)
    }

    "calculate first ever ever easter in the world by means of modern calculation" in {
      val year = 325
      val result = EasterCalculator.easter(year)

      result should be (325,4,19)
    }
  }

}
