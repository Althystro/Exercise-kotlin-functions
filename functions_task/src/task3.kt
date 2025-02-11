fun main() {
    println(currentTemperature(25, 40))
}

fun currentTemperature(morningTemperature: Int, afternoonTemperature: Int): Int {


    var average: Int = (morningTemperature + afternoonTemperature) / 2


    return average


}