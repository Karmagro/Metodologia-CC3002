package board

import square.TSquare
import units.TPlayer

import scala.collection.mutable.ArrayBuffer

trait TBoard {

  val boardSize : Int

  val numberOfPlayers : Int

  var chapters : Int

  val winnerOfTheGame : Option[TPlayer]
  def createBoard(boardSize : Int, numberOfPlayers : Int) : Array[TSquare]
  def movePlayer(referencedPlayer : TPlayer) : Unit
  def startPlayerTurn(referencedPlayer : TPlayer) :Unit
  def endPlayerTurn(referencedPlayer : TPlayer) : Unit
  def giveNewTurnStars(referencedPlayer : TPlayer, chapters : Int) : Unit
  def startNewChapter() : Unit
  def endGame() : Unit

}
