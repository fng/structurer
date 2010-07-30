package com.efgfp.structurer


/**
Bonus Certificate (1 Bond, 2 Options)
- solve for Barrier
- solve for Bonus

/
|            /
|           /
|      ____/
|         /
-|--------/-----------
|       /
|      /
|     /
|    /
 **/

object BonusCertificateTest {
  def main(args: Array[String]) {

    val bonusLevel = 112
    val barrierLevel = 60

    val bond = Bond(0, bonusLevel * 10)
    val longCall = Option(CALL, bonusLevel, 100, barrierLevel)
    val shortPut = Option(PUT, bonusLevel, 100, barrierLevel)

    val bondComponent = BondComponent(1, bond)
    val longCallComponent = OptionComponent(10, longCall)
    val shortPutComponent = OptionComponent(-10, shortPut)

    val pack = Package(List(longCallComponent, shortPutComponent), Some(bondComponent))


    //packValue = 1 * BondValue + 10 * LongCallValue - 10 * ShortPutValue

    



  }
}