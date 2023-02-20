package br.com.Boshy

import jakarta.websocket.server.PathParam
import org.springframework.boot.context.properties.bind.DefaultValue
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingControler {
    val counter: AtomicLong = AtomicLong()
    @RequestMapping("/greeting")
    fun greeting(@RequestParam(value="name", defaultValue = "World param")name: String?): Greeting{
        return Greeting(counter.incrementAndGet(), "Olá!, $name")
    }
}