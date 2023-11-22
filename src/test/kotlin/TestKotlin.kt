package informaString.Notificador

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class ObservavelTest {
    private lateinit var observavel: Observavel

    @BeforeEach
    fun setUp() {
        observavel = Observavel("Esta é uma frase de teste")
    }

    @Test
    fun testModificaPalavra() {
        observavel.modificaPalavra("Nova frase de teste")
        assertEquals(4, observavel.quantidadeDePalavras())
    }

    @Test
    fun testQuantidadeDePalavras() {
        assertEquals(6, observavel.quantidadeDePalavras())
    }

    @Test
    fun testQuantidadeParDeCaracter() {
        assertEquals(3, observavel.quantidadeParDeCaracter())
    }

    @Test
    fun testComecaComLetraMaiuscula() {
        assertEquals(1, observavel.comecaComLetraMaiuscula())
    }
}
