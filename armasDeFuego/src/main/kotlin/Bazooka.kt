class Bazooka(nombre: String, municion:Int, tipoDeMunicion: String,
): ArmaDeFuego(nombre, municion, tipoDeMunicion) {

    init {
        municionARestar = 3
    }

    override val danio: Int = (10..30).random()

    override val radio: TipoRadio = TipoRadio.Enorme
}