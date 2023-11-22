import informaString.Notificador.Observador
import informaString.Notificador.Observavel

fun main() {
    val observavel = Observavel("Testar Funcao")
    val observador1 = Observador("Tiao Tatu")
    val observador2 = Observador("Joana D4rk")
    val observador3 = Observador("Roger Waters")
    val observador4 = Observador("C4PIV4RiNH4_BoRR4RR4CHUD4")

    observavel.registraObservador(observador3)
    observavel.registraObservador(observador1)
    observavel.notificaObservadores()
    observavel.registraObservador(observador4)
    observavel.registraObservador(observador2)
    observavel.notificaObservadores()
    observavel.removeObservador(observador2)
    observavel.removeObservador(observador1)
    observavel.modificaPalavra("Nova Palavra")
}
