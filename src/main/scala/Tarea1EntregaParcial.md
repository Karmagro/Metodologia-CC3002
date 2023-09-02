# Tarea 1 | Entrega Parcial 1

Lea las secciones 2.1 a 2.3 del enunciado e identifique qué elementos debieran
ser traits y cuáles clases.
Escriba además los métodos y variables que considere necesarios, junto con sus
tipos.
Anote los métodos con `def` y las variables con `var` o `val` según corresponda.

Indique de qué trait extiende cada clase.

## 1. Traits

Escriba los traits que considere necesarios para modelar el problema.

### TUnits

- `val unitName : String`
- `val maxHitPoints : Int`
- `val currentHitPoints : Int`
- `val attackPoints : Int`
- `val defensePoints : Int`
- `val evasionPoints :Int`
- `var stars : Int`
- `def throwDice() : Int`
- `def winStars(numberOfStars : Int) : Unit`

### TPlayer extends Tunits

- `val unitName : String`
- `val maxHitPoints : Int`
- `val currentHitPoints : Int`
- `val attackPoints : Int`
- `val defensePoints : Int`
- `val evasionPoints :Int`
- `var stars : Int`
- `def throwDice() : Int`
- `def winStars(numberOfStars : Int) : Unit`
- `var victories : Int`
- `var downed : Boolean`
- `def addVictories(numberOfVictories : Int) : Unit`
- `def loseStars(numberOfStars : Int) : Unit`
- `def recoveryPhase(status : Boolean, turnsPassed : Int) : Unit`

### TSquare

- `val squareType : Int`
- `def squareName : String`
- `var playerInSquare : Array[TPlayer]`
- `def squareEffect(affectedPlayer : TPlayer) : Unit`
- `def playerEnterSquare(referencedPlayer : TPlayer) :Unit`
- `def playerLeftSquare(referencedPlayer : TPlayer) :Unit`
- `def askIfCombat(referencedPlayer : TPlayer) : Unit`
- `def startCombat() : Unit`

### TBoard

- `val boardSize : Int`
- `val numberOfPlayers : Int`
- `var chapters : Int`
- `val winnerOfTheGame : Option[TPlayer]`
- `def createBoard(boardSize : Int, numberOfPlayers : Int) : Array[TSquare]`
- `def movePlayer(referencedPlayer : Tplayer) :Unit`
- `def startPlayerTurn(referencedPlayer : Tplayer) : Unit`
- `def endPlayerTurn(referencedPlayer: Tplayer) : Unit`
- `def giveNewTurnStars(referencedPlayer : TPlayer, chapters : Int) : Unit`
- `endGame() : Unit`

## 2. Clases

Escriba las clases que considere necesarias para modelar el problema.

Prefiero no repetir cada una de las variables y metodos en cada una de las clases (Mucho copiar y pegar), se asume que
una clase hereda todo de la interfaz que extiende.

### Player extends TPlayer

### WildUnit extends TUnit

### ChickenUnit extends WildUnit

### RoboBall extends WildUnit

### Seagull extends WildUnit

### HomeSquare extends TSquare
- `val ownerOfHome : String`
- `isTheOwner(referencedPlayer : TPlayer)`
- `def verifyNorm(referencedPlayer : TPlayer)`

### EncounterSquare extends TSquare
- `val wildUnitInSquare : WildUnit`
- `def spawnWildUnit() : WildUnit`
- `def eliminateWildUnit(wildUnitInSquare : WildUnit) : Unit`

### DropSquare extends TSquare
- `def stealStars(referencedPlayer : TPlayer) : Unit`

### BonusSquare extends TSquare
- `def giveStars(referencedPlayer : Tplayer) : Unit`

### Board extends TBoard

## Entrega

Entregue por u-cursos un archivo `.md` siguiendo el formato de este archivo.
Puede usar este archivo como base para su entrega.

## Consejo

Puede serle de utilidad dibujar un diagrama con sus clases y traits, y cómo se
relacionan entre sí.
