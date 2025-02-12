fun main() {


    exploreDune(climbRate = 3, height = 20)


}


fun exploreDune(height: Int, climbRate: Int) {

    var total: Double = height / climbRate.toDouble()
    return println(

        "Time to Climb the Dune: " +
                "%.2f".format(total) +
                " hours"


    )

}