fun main() {


    exploreDune(20, 3)


}


fun exploreDune(height: Int, climbRate: Int) {

    var total: Double = height / climbRate.toDouble()
    return println(

        "Time to Climb the Dune: " +
                "%.2f".format(total) +
                " hours"


    )

}