package example

case class EasterCalculator() {

}

object EasterCalculator {
  def easter(year: Int) : (Int,Int,Int) = {
    val a = year % 19
    val b : Double = math.floor(year / 100)
    val c = year % 100
    val d = math.floor(b / 4)
    val e = b % 4
    val f : Double = math.floor((b + 8) / 25)
    val g = math.floor((b - f + 1)/3)
    val h = (19*a + b - d- g + 15) % 30
    val s = math.floor(c / 4)
    val k = c % 4
    val q = (32 + 2*e + 2*s - h - k) % 7
    val m = math.floor((a + 11*h + 22*q) / 451)
    val month = math.floor((h + q - 7*m + 114) / 31)
    val day = ((h + q - 7*m + 114) % 31) + 1
    (year,month.toInt, day.toInt)
  }
}