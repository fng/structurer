package com.efgfp.structurer

case class Bond(coupon: BigDecimal, notional: BigDecimal)

case class BondComponent(quantity: BigDecimal, bond: Bond)