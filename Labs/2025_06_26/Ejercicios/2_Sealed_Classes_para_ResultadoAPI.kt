
// // 2025-06-26
// // 2. Sealed Classes para `ResultadoAPI`
fun main() {
  val r1 = Exito("Datos recibidos de la API")
    val r2 = Error("Fallo de conexión con la API")
    val r3 = Cargando

    println(procesarResultado(r1))
    println(procesarResultado(r2))
    println(procesarResultado(r3))
}

sealed class ResultadoAPI()

data class Exito(var datos: String) : ResultadoAPI()

data class Error(var mensaje: String) : ResultadoAPI()

object Cargando : ResultadoAPI()

fun procesarResultado(resultado: ResultadoAPI) : String {
    return when (resultado) {
        is Exito -> "Exito con Datos: ${resultado.datos}"
        is Error -> "Error con Mensaje: ${resultado.mensaje}"
        is Cargando -> "Cargando..."
    }
}
