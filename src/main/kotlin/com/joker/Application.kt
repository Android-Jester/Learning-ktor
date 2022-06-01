package com.joker

import com.joker.plugins.configureRouting
import com.joker.plugins.configureSerialization
import io.ktor.server.application.*

fun main(args: Array<String>):Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    configureRouting()
    configureSerialization()
}



