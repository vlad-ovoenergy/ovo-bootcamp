package example

import example.RootSquareCalculator.Threshold

object ImplicitConversions {
  implicit class ToThreshold(d: Double){
    def threshold: Threshold = Threshold(d)
  }

}
