package units

trait TUnits{

    val unitName : String

    val maxHitPoints : Int

    var currentHitPoints : Int

    val attackPoints : Int

    val defensePoints : Int

    val evasionPoints : Int

    var stars : Int

    def throwDice : Int


}