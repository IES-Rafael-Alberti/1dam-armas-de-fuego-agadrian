
fun main(args: Array<String>) {


    /*************
     ** PARTE 1 **
    *************/

    /*
    val pistola = Pistola(12, "9mm")
    val rifle = Rifle(25, "7.62mm")
    val bazooka = Bazooka( 6, "RPG")

    val armas: MutableList<ArmaDeFuego> = mutableListOf(pistola, rifle, bazooka)

    println("Municion extra = ${ArmaDeFuego.cantidadMunicionExtra} para todas las armas de fuego")

    // Crea una lista de 12 de longitud, de tuplas aleatorias que contienen un arma de fuego y numero de disparos-> [(Nombre: Bazooka, Munición: 4, Tipo de Munición: RPG, Daño: 20, Radio: Intermedio, 2), ...]
    val disparos = (1..12).map { armas.random() to (1..3).random() }


    var cont1 = 1
    for (disparo in disparos){
        println("*** Disparo: $cont1")
        cont1++
        // Desestructuramos y separamos en dos variables, una con el arma de fuego completa, y otra con el num de disparos
        val (arma, cantDisparos) = disparo

        for (i in 1..cantDisparos){
            arma.dispara()
            println(arma.toString())
            println("MUNICION EXTRA ACTUAL: ${ArmaDeFuego.cantidadMunicionExtra}")
            println()
        }
    }

    */

    /*************
     ** PARTE 2 **
     *************/

    val pistola = Pistola(12, "9mm")
    val rifle = Rifle(25, "7.62mm")
    val bazooka = Bazooka( 6, "RPG")

    val coche = Coche()
    val casa = Casa()
    val bocadillo = Bocadillo()

    val objetos = mutableListOf(pistola, rifle, bazooka, coche, casa, bocadillo)

    val disparos2 = (1..9).map { objetos.random() to (1..3).random()}

    var cont2 = 1
    for (disparo in disparos2) {
        println("*** Disparo: $cont2")
        cont2++
        // Desestructuramos y separamos en dos variables, una con el objeto a disparar, y otra con el num de disparos
        val (objeto, cantDisparos) = disparo

        for (i in 1..cantDisparos) {
            when (objeto){
                is ArmaDeFuego -> {
                    objeto.dispara()
                    println(objeto.toString())
                    println("MUNICION EXTRA ACTUAL: ${ArmaDeFuego.cantidadMunicionExtra}")
                    println()
                }

                is RealizarDisparos -> {
                    println(objeto.disparar())
                    println()
                }
            }
        }
    }

}