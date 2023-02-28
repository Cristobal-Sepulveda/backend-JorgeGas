package com.example

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.tomcat.*
import com.example.plugins.*

fun main() {
    embeddedServer(Tomcat, port = 8080, host = "34.176.46.245", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureSerialization()
    configureRouting()
}
