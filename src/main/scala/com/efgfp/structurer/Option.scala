package com.efgfp.structurer

case class Option(optionType: OptionType, strike: BigDecimal, notional: BigDecimal, barrier: BigDecimal)

case class OptionComponent(quantity: BigDecimal, option: Option)

sealed trait OptionType
case object CALL extends OptionType
case object PUT extends OptionType