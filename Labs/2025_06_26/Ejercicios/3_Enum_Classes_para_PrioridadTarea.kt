
// // 2025-06-26
// // 3. Enum Classes para `PrioridadTarea`
fun main() {
    for (prioridadTarea in PrioridadTarea.values()) {
        println("${prioridadTarea.name} => ${obtenerColor(prioridadTarea)}")
    }
}

enum class PrioridadTarea(val colorHex: String) {
    BAJA("#0000FF"),
    MEDIA("#FFFF00"),
    ALTA("#FF0000")
}

fun obtenerColor(prioridad: PrioridadTarea): String {
    return prioridad.colorHex
}
