
// // 2025-06-26
// // 4. Singleton con `object` para `Logger`
fun main() {
    Logger.log("Log #1")
    Logger.log("Log #2")
    Logger.log("Log #3")
    Logger.mostrarLogs()
}

object Logger {
    private val logs = mutableListOf<String>()

    fun log(mensaje: String) {
        logs.add(mensaje)
    }

    fun mostrarLogs() {
        for (log in logs) {
            println(log)
        }
    }
}
