
// // 2025-06-26
// // 7. Delegación de Interfaces con `by`
fun main() {
    val impresora = ImpresoraLaser()
    val escaner = EscanerDeCamaPlana("Informe de mensual => Via escaner")

    val multifuncional = Multifuncional(impresora, escaner)

    multifuncional.imprimir("Informe mensual => Via Impresora Laser")

    val resultadoEscaneo = multifuncional.escanear()
    println(resultadoEscaneo)
}

interface Impresora {
    fun imprimir(documento: String)
}

interface Escaner {
    fun escanear(): String
}

class ImpresoraLaser() : Impresora {
    override fun imprimir(documento: String) {
    println(documento)
	}
}

class EscanerDeCamaPlana(val documento: String) : Escaner {
	override fun escanear() : String {
        return documento
	}
}

class Multifuncional(
	private val impresora: Impresora,
	private val escaner: Escaner
) : Impresora by impresora, Escaner by escaner