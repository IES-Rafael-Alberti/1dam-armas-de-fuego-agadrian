/**
 * Clase que hereda de la interfaz RealizarDisparos y crea un bocadillo que dispara olor a jamon
 */
class Bocadillo : RealizarDisparos {
    /**
     * Realiza un disparo de olor a jamón desde el bocadillo.
     * @return El mensaje que indica que se ha disparado olor a jamón.
     */
    override fun disparar(): String {
        return "Se ha disparado olor a jamon"
    }
}