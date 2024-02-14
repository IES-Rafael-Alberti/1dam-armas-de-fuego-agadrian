
fun main(args: Array<String>) {

    val pistola = Pistola(8, "9mm")
    val rifle = Rifle(12, "7.62mm")
    val bazooka = Bazooka( 4, "RPG")

    val armas: MutableList<ArmaDeFuego> = mutableListOf(pistola, rifle, bazooka)

    println("Municion extra = ${ArmaDeFuego.cantidadMunicionExtra} para todas las armas de fuego")

    // Crea una lista de 12 de longitud, de tuplas aleatorias que contienen un arma de fuego y numero de disparos-> [(Nombre: Bazooka, Munición: 4, Tipo de Munición: RPG, Daño: 20, Radio: Intermedio, 2), ...]
    val disparos = (1..12).map { armas.random() to (1..3).random() }


    var cont = 1
    for (disparo in disparos){
        println("*** Disparo: $cont")
        cont++
        // Desestructuramos y separamos en dos variables, una con el arma de fuego completa, y otra con el num de disparos
        val (arma, cantDisparos) = disparo

        for (i in 1..cantDisparos){
            arma.dispara()
            println(arma.toString())
            println("MUNICION EXTRA ACTUAL: ${ArmaDeFuego.cantidadMunicionExtra}")
            println()
        }
    }






}