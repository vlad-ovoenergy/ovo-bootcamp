package example

object InputHelpers {

  def getYear() : Int = {
    println("Type a year: ")
    val year = Console.readInt()
    require(year > 1950 && year < 2017)
    year
  }

  def getSquared() : Int = {
    println("Type in squared numer: ")
    Console.readInt()
  }

}
