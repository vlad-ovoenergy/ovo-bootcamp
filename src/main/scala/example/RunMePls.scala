package example

import example.RootSquareCalculator.{Threshold, giveMeRootPls}

object RunMePls extends App {

  implicit val threshold = new Threshold(0.1)

//  val year = InputHelpers.getYear()
//  println(easter(year))


  val squaredNum = InputHelpers.getSquared()

  println(giveMeRootPls(squaredNum))
}
