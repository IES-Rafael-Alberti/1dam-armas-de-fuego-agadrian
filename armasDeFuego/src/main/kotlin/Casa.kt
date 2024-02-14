/**
 * Clase que hereda de la interfaz RealizarDisparos y crea una casa que dispara confeti
 */
class Casa() : RealizarDisparos {
    /**
     * Realiza un disparo de confetti desde la casa.
     * @return El mensaje que indica que se ha disparado confetti.
     */

    override fun disparar(): String {
        return "Se ha disparado confetti"
    }
}