package example

import scala.annotation.tailrec

object RootSquareCalculator {

  implicit def threshold(d: Double) : Threshold = new Threshold(d)



  case class Threshold(d: Double)


 def giveMeRootPls(in: Double)(implicit threshold: Threshold ) = {

    @tailrec
    def findSquareRoot(estimate: Double)(implicit threshold: Threshold) : Double =
      if (math.abs(in - estimate * estimate)/in - threshold.d < 0)
        estimate
      else
        findSquareRoot((estimate + in/estimate) / 2)

    in match {
      case n: Double if n == 0 | n == 1 => n
      case n: Double if n < 0 => throw new IllegalArgumentException()
      case n: Double if n > 0 => findSquareRoot(1.0)
    }
  }
}
