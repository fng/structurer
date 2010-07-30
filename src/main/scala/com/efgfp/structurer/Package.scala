package com.efgfp.structurer

import scala.{Option => SOption}

case class Package(options: List[OptionComponent], bond: SOption[BondComponent])

