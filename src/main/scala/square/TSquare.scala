package square

import units.TPlayer


trait TSquare {

  val squareType : Int

  val squareName : String

  var playerInSquare : Array[TPlayer]
  def squareEffect(affectedPlayer: TPlayer) : Unit
  def playerEnterSquare(referencedPlayer : TPlayer) : Unit
  def playerLeftSquare(referencedPlayer : TPlayer) : Unit
  def askIfCombat(referencedPlayer: TPlayer) : Unit
  def startCombat() : Unit

}
