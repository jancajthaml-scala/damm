package com.github.jancajthaml

/**
  * Helpers without uneccessary roundtrips
  *
  * @author jan.cajthaml
  */
private[jancajthaml] object x {
  val lookup = Array(
    Array(0, 3, 1, 7, 5, 9, 8, 6, 4, 2),
    Array(7, 0, 9, 2, 1, 5, 4, 8, 6, 3),
    Array(4, 2, 0, 6, 8, 7, 1, 3, 5, 9),
    Array(1, 7, 5, 0, 9, 8, 3, 4, 2, 6),
    Array(6, 1, 2, 3, 0, 4, 5, 9, 7, 8),
    Array(3, 6, 7, 4, 2, 0, 9, 5, 8, 1),
    Array(5, 8, 6, 9, 7, 2, 0, 1, 3, 4),
    Array(8, 9, 4, 5, 3, 6, 2, 0, 1, 7),
    Array(9, 4, 3, 8, 6, 1, 7, 2, 0, 5),
    Array(2, 5, 8, 1, 4, 3, 6, 7, 9, 0)
  )
}


/**
  * Damm Checksum algorithm
  *
  * @see https://en.wikipedia.org/wiki/Damm_algorithm
  *
  * @author jan.cajthaml
  */
object damm_checksum extends ((String) => Int) {

  /**
   * @return check_digit
   */
  def apply(number: String): Int = {
    number.getBytes("US-ASCII").foldLeft(0)((digit, c) => x.lookup(digit)(c - 48))
  }

}
