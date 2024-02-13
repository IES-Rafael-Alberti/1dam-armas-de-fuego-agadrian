fun main(args: Array<String>) {

    val pistola1 = Pistola("M9", 10, "9mm")

    println(ArmaDeFuego.cantidadMunicionExtra)
    pistola1.dispara()
    pistola1.dispara()

}