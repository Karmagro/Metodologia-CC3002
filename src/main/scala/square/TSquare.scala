package square

import units.TUnits


trait TSquare {

  val squareType : Int

  val squareName : String

  var playerInSquare : Array[TUnits]

  def squareEffect(affectedPlayer: TUnits) : Unit

  def playerEnterSquare(referencedPlayer : TUnits) : Unit

  def playerLeftSquare(referencedPlayer : TUnits) : Unit

}
