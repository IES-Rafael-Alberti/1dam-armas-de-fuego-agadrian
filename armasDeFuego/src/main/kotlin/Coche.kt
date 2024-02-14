/**
 * Clase que hereda de la interfaz RealizarDisparos y crea un coche que dispara rafagas de luz larga
 */
class Coche : RealizarDisparos {
    /**
     * Realiza un disparo de ráfagas de luz larga desde el coche.
     * @return El mensaje que indica que se ha disparado ráfagas de luz larga.
     */
    override fun disparar(): String {
        return "Se ha disparado rafagas de luz larga"
    }
}