package informaString.Interfaces

import informaString.Notificador.Observador

interface IObservavel {
    fun registraObservador(obs: Observador)
    fun removeObservador(obs: Observador)
    fun notificaObservadores()
}