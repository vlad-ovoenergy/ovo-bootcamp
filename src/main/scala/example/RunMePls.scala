package example

import example.RootSquareCalculator.{Threshold, giveMeRootPls}
import example.ImplicitConversions._

object RunMePls extends App {
//  implicit def threshold(d: Double) : Threshold = Threshold(d)
//  implicit val threshold: Threshold = 0.1

  implicit val threshold: Threshold = 0.1 threshold

//  val year = InputHelpers.getYear()
//  println(easter(year))


  val squaredNum = InputHelpers.getSquared()

  println(giveMeRootPls(squaredNum))
}
