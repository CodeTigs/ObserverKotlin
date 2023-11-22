package informaString.Notificador

import informaString.Interfaces.IObservador

class Observador(val nome: String) : IObservador {
    override fun update(palavras: Observavel) {
        println("-------------------------------------------------------------------------------")
        println("Nome do observador: $nome")
        println("Numero de palavras: ${palavras.quantidadeDePalavras()}")
        println("Numero de palavras com numero de caracteres par: ${palavras.quantidadeParDeCaracter()}")
        println("Numero de palavras iniciadas com letra maiúscula: ${palavras.comecaComLetraMaiuscula()}")
        println("-------------------------------------------------------------------------------")
    }
}