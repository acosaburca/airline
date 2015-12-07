package com.patson.model

case class LinkConsumptionDetails(linkId : Int, price : Int, capacity: Int, soldSeats: Int, fuelCost : Int, crewCost : Int, airportFees: Int, fixedCost : Int, revenue : Int, profit : Int, fromAirportId : Int, toAirportId : Int, airlineId : Int, distance : Int, cycle : Int, var id : Int = 0) extends IdObject
