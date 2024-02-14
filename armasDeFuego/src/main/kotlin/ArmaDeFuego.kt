/**
 * Clase abstracta que representa un arma de fuego.
 * @property nombre El nombre del arma de fuego.
 * @property municion La cantidad de munición actual del arma.
 * @property tipoDeMunicion El tipo de munición del arma.
 */
abstract class ArmaDeFuego( val nombre: String, private var municion: Int,  private val tipoDeMunicion: String) {

    companion object{
        var cantidadMunicionExtra = (5..15).random()
    }

    abstract var danio: Int
    abstract val radio: TipoRadio

    // Cnatidad a restar al disparar
    protected var municionARestar: Int = 0


    /**
     * Método que simula el disparo del arma de fuego. Si no tiene municion, llamar a la funcion recarga()
     */
    fun dispara(){
        if (municionARestar <= municion) {
            municion -= municionARestar
            println("$nombre dispara. Municion restante: $municion")
        } else {
            print("No hay municion para disparar. Intentando recargar... ")
            recarga()
            if (municion < municionARestar){
                println("No hay suficiente munición para disparar.")
            }else{
                dispara()
            }
        }
    }

    /**
     * Método que simula la recarga del arma de fuego.
     */
    fun recarga() {
        if (cantidadMunicionExtra >= (municionARestar * 2 )){
            municion += (municionARestar * 2)
            cantidadMunicionExtra -= (municionARestar * 2)
            println("Se ha recargado doble $nombre. Municion actual: $municion")
        }
        else if(cantidadMunicionExtra >= municionARestar ){
            municion += municionARestar
            cantidadMunicionExtra -= municionARestar
            println("Se ha recargado $nombre. Municion actual: $municion")
        }
        else{
            println("No hay suficiente munición extra para recargar.")
        }
    }

    /**
     * Retorna una cadena de texto con la informacion del arma
     */
    override fun toString(): String {
        return "Nombre: $nombre, Munición: $municion, Tipo de Munición: $tipoDeMunicion, Daño: $danio, Radio: $radio"
    }
}