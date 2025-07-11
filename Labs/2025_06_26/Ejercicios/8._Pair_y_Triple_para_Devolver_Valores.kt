
// // 2025-06-26
// // 8. `Pair` y `Triple` para Devolver Valores
fun main() {
    val (x, y) = obtenerCoordenadas()
    println("Coordenadas: X = $x, Y = $y")

    val (nombre, edad, estaActivo) = obtenerDatosUsuario()
    println("Usuario: $nombre, Edad: $edad, ¿Sigue Activo?: $estaActivo")
}

fun obtenerCoordenadas() : Pair<Double, Double> {
    return Pair(15.12, 81.43)
}

fun obtenerDatosUsuario(): Triple<String, Int, Boolean> {
    return Triple("Juan Alonzo", 32, true)
}