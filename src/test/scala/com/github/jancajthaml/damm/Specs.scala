package com.github.jancajthaml

import org.scalatest.{FlatSpec, Matchers}

class DammSpecs extends FlatSpec with Matchers {
  
  "damm" should "produce check-digit 0 for input 00123014764700968325" in {
    damm_digit("00123014764700968325") should === (0)
  }

  it should "produce check-digit 5 for input 1234567812345678" in {
    damm_digit("1234567812345678") should === (5)
  }

  // should choke on "xy-1"
}