package org.example

import org.springframework.stereotype.Service
import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

@Service
class HelloService {

    fun getMessage(name: String): String {

        System.getenv().forEach{ entry -> logger.info { "${entry.key}: ${entry.value}" }}

        logger.info { "getMessage $name" }
        return "Hello $name!"
    }
}