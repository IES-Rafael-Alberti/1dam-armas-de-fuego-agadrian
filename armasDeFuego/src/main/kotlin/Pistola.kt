class Pistola(nombre: String, municion:Int, tipoDeMunicion: String): ArmaDeFuego(nombre, municion, tipoDeMunicion) {

    init {
        municionARestar = 1
    }

    override val danio: Int = (1..5).random()

    override val radio: TipoRadio = TipoRadio.Corto



}