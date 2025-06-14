
// // Ejercicios de POO en Kotlin
// // 2025-06-12
// // 10. Sistema de Notificaciones Polimórfico
fun main() {
	val lista = listOf(
        Notificacion(),
        NotificacionEmail("juan@gmail.com", "Bienvenido Juan"),
        NotificacionSMS("8096767779", "Tu código es 1626"),
        NotificacionPush("device-001", "Tienes un nuevo mensaje")
    )

    enviarTodas(lista)
}

fun enviarTodas(notificaciones: List<Notificacion>) {
    for (n in notificaciones) {
        n.enviar()
    }
}

open class Notificacion {
    open fun enviar() {
        println("Enviando notificación genérica...")
    }
}

class NotificacionEmail(val destinatario: String, val asunto: String) : Notificacion() {
    override fun enviar() {
        println("Enviando Email a [$destinatario] con asunto: '$asunto'")
    }
}

class NotificacionSMS(val numero: String, val mensaje: String) : Notificacion() {
    override fun enviar() {
        println("Enviando SMS a [$numero] con mensaje: '$mensaje'")
    }
}

class NotificacionPush(val dispositivoId: String, val contenido: String) : Notificacion() {
    override fun enviar() {
        println("Enviando Notificación Push a dispositivo [$dispositivoId]: $contenido")
    }
}