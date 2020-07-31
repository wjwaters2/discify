package org.drunkuncle.discify

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
class DiscifyApplication

fun main(args: Array<String>) {
    SpringApplication.run(DiscifyApplication::class.java, *args)
}