import kotlin.random.Random

/**
 * Clase que representa un rifle, un tipo específico de arma de fuego. Por defecto tiene el nombre de Rifle asignado
 * @property municion La cantidad de munición del rifle.
 * @property tipoDeMunicion El tipo de munición que utiliza el rifle.
 */
class Rifle(municion:Int, tipoDeMunicion: String,
): ArmaDeFuego("Rifle", municion, tipoDeMunicion){

    override var danio: Int = (5..10).random()
        set(value) {
            require(value in 1..5) {"Daño debe ser 5-10"}
            field = value
        }

    // Asignamos aleatoriamente entre dos valores de la enumClass
    override val radio: TipoRadio
        get() = when (Random.nextInt(2)){
            0 -> TipoRadio.Corto
            else -> TipoRadio.Intermedio
        }

    // Establecemos cuanta municion gasta el rifle por disparo
    init {
        municionARestar = 2
    }
}