package informaString.Notificador

import informaString.Interfaces.IObservavel

class Observavel(var listaDePalavra: String) : IObservavel {
    private lateinit var palavrasCortada: Array<String>
    private val observadores: MutableList<Observador>

    init {
        separarPalavra()
        observadores = ArrayList()
    }

    fun modificaPalavra(listaDePalavra: String) {
        this.listaDePalavra = listaDePalavra
        separarPalavra()
        println(" Frase modificada")
        notificaObservadores()
    }

    private fun separarPalavra() {
        palavrasCortada = listaDePalavra.split("\\s".toRegex()).toTypedArray()
    }

    fun quantidadeDePalavras(): Int {
        return palavrasCortada.size
    }

    fun quantidadeParDeCaracter(): Int {
        var cont = 0
        for (palavra in palavrasCortada) {
            if (palavra.length % 2 == 0) cont++
        }
        return cont
    }

    fun comecaComLetraMaiuscula(): Int {
        var cont = 0
        for (i in palavrasCortada.indices) {
            val primeiraLetra = palavrasCortada[i][0]
            if (Character.isUpperCase(primeiraLetra)) {
                cont++
            }
        }
        return cont
    }

    override fun registraObservador(obs: Observador) {
        observadores.add(obs)
    }

    override fun removeObservador(obs: Observador) {
        if (observadores.contains(obs)) {
            observadores.remove(obs)
            println(obs.nome + " remolvido com sucesseso :-)")
        }
    }

    override fun notificaObservadores() {
        for (observador in observadores) {
            observador.update(this)
        }
    }

    fun getPalavrasCortada(): Array<String> {
        return palavrasCortada
    }
}
