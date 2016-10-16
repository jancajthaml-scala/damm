package com.github.jancajthaml

import org.scalatest.{FlatSpec, Matchers}

class DammSpecs extends FlatSpec with Matchers {
  
  "damm" should "have valid checksum" in {
    damm_checksum("00123014764700968325") should === (0)
  }

}