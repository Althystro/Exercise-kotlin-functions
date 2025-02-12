fun main() {

    var survival: Int = survivalChance(8)
    println("Survival Chance: $survival")

}


fun survivalChance(supplies: Int): Int = supplies * 10


