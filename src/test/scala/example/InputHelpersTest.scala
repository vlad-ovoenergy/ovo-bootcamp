package example

import java.io.ByteArrayInputStream

import org.scalatest.{Matchers, WordSpec}

class InputHelpersTest extends WordSpec with Matchers {

  "InputHelpersTest" should {

    "should read and return correct year" in {
      val in = new ByteArrayInputStream("1960".getBytes)
      Console.setIn(in)
      val res = InputHelpers.getYear()
       res should be (1960)
    }

    "should not be earlier than 1950" in {
      val in = new ByteArrayInputStream("1949".getBytes)
      Console.setIn(in)
      val thrown = intercept[IllegalArgumentException] {
        InputHelpers.getYear()
      }
      assert(thrown.getMessage === "requirement failed")
    }
  }
}
