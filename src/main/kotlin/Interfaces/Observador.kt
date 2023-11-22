package informaString.Interfaces

import informaString.Notificador.Observavel

interface IObservador {
    fun update(netflix: Observavel)
}