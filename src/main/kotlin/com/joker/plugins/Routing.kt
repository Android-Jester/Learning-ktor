package com.joker.plugins

import com.joker.routes.customerRouting
import com.joker.routes.getOrderRoute
import com.joker.routes.listOrdersRoute
import com.joker.routes.totalizeOrderRoute
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        customerRouting()
        listOrdersRoute()
        getOrderRoute()
        totalizeOrderRoute()
    }
}