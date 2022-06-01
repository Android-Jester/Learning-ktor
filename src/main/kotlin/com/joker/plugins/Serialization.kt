package com.joker.plugins

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*

fun Application.configureSerialization() {
    install(
        plugin = ContentNegotiation,
        configure = {
            json()
        }
    )
}