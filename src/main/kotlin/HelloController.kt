package org.example

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

data class HelloRequest(val name: String)
data class HelloResponse(val message: String)

@RestController
class HelloController(private val helloService: HelloService) {


    @PostMapping("/hello")
    fun hello(@RequestBody helloRequest: HelloRequest): HelloResponse {
        return HelloResponse(helloService.getMessage(helloRequest.name))
    }
}