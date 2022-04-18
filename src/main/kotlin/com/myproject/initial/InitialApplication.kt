package com.myproject.initial

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.myproject")
class InitialApplication

fun main(args: Array<String>) {
	runApplication<InitialApplication>(*args)
}
