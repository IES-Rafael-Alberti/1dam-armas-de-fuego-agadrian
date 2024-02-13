abstract class ArmaDeFuego(private val nombre: String, private var municion: Int,  private val tipoDeMunicion: String) {

    companion object{
        //var cantidadMunicionExtra = (5..15).random()
        var cantidadMunicionExtra = 7
    }

    abstract var danio: Int
    abstract val radio: TipoRadio

    protected var municionARestar: Int = 0

    fun dispara(){
        if (municionARestar <= municion) {
            municion -= municionARestar
            println("Se ha disparado $nombre. Municion restante: $municion")
        } else {
            print("No hay municion para disparar. Intentando recargar... ")
            recarga()
            if (cantidadMunicionExtra < municionARestar){
                println("No hay suficiente munición para disparar.")
            }else{
                dispara()
            }
        }
    }

    fun recarga() {
        if (cantidadMunicionExtra >= (municionARestar * 2 )){
            municion += (municionARestar * 2)
            cantidadMunicionExtra -= (municionARestar * 2)
            println("Se ha recargado $nombre. Municion actual: $municion")
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

    override fun toString(): String {
        return "Nombre: $nombre, Munición: $municion, Tipo de Munición: $tipoDeMunicion, Daño: $danio, Radio: $radio"
    }
}