import kotlin.random.Random

/**
 * Clase que representa un bazooka, un tipo específico de arma de fuego. Por defecto tiene el nombre de Bazooka
 *
 * @property municion La cantidad de munición de la pistola.
 * @property tipoDeMunicion El tipo de munición que utiliza la pistola.
 */
class Bazooka( municion:Int, tipoDeMunicion: String,
): ArmaDeFuego("Bazooka", municion, tipoDeMunicion) {

    override var danio: Int = (10..30).random()
        set(value) {
            require(value in 1..5) {"Daño debe ser 10-30"}
            field = value
        }

    // Asignamos aleatoriamente entre dos valores de la enumClass
    override val radio: TipoRadio
        get() = when (Random.nextInt(2)){
            0 -> TipoRadio.Intermedio
            else -> TipoRadio.Enorme
        }

    // Establecemos cuanta municion gasta el bazooka por disparo
    init {
        municionARestar = 3
    }
}