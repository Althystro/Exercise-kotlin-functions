fun main() {

    var survival: Int = survivalChance(8)
    println("Survival Chance: $survival")

}


fun survivalChance(supplies: Int): Int {

    var chances: Int = supplies * 10

    return chances
}