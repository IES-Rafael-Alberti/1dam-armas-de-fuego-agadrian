
fun main(args: Array<String>) {

    val pistola = Pistola(10, "9mm")
    val rifle = Rifle(21, "7.62mm")
    val bazooka = Bazooka( 21, "RPG")

    val armas: MutableList<ArmaDeFuego> = mutableListOf(pistola, rifle, bazooka)

    println("Municion extra = ${ArmaDeFuego.cantidadMunicionExtra} para todas las armas de fuego")

    // Crea una lista de 12 de longitud, de pares aleatorios de arma-cantidadDisparos -> [("Rifle", 2), ("Pistola",3)]
    val disparos = (1..12).map { armas.random() to (1..3).random() }

    var cont = 1

    for (disparo in disparos){
        println("*** Disparo: $cont")
        cont++
        val (arma, cantDisparos) = disparo

        for (i in 1..cantDisparos){
            arma.dispara()
            println(arma.toString())
            println()
        }
    }






}