/**
 * Clase que representa una pistola, un tipo específico de arma de fuego. Por defecto tiene el nombre de Pistola
 *
 * @property municion La cantidad de munición de la pistola.
 * @property tipoDeMunicion El tipo de munición que utiliza la pistola.
 */
class Pistola(municion:Int, tipoDeMunicion: String): ArmaDeFuego("Pistola", municion, tipoDeMunicion) {

    override var danio: Int = (1..5).random()
        set(value) {
            require(value in 1..5) {"Daño debe ser 1-5"}
            field = value
        }

    override val radio: TipoRadio = TipoRadio.Intermedio

    // Establecemos cuanta municion gasta la pistola por disparo
    init {
        municionARestar = 1
    }

}