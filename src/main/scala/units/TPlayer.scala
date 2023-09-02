package units

trait TPlayer extends TUnits {

  var victories : Int

  var downed : Boolean
  def addVictories(numberOfVictories : Int) : Unit
  def loseStars(numberOfStars : Int) : Unit
  def recoveryPhase(status : Boolean, turnsPassed : Int) : Unit
}
