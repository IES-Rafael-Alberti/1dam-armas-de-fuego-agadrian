class Rifle(nombre: String, municion:Int, tipoDeMunicion: String,
): ArmaDeFuego(nombre, municion, tipoDeMunicion){


    init {
        municionARestar = 2
        danio: Int = 0
        require(danio in 5..10) {"El daño debe estar entre 5-10"}
    }

    override val danio: Int = 0

    override val radio: TipoRadio = TipoRadio.Intermedio 
}