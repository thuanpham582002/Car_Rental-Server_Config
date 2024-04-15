package dev.noroom113.rentcarserverconfig

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
class RentCarServerConfigApplication

fun main(args: Array<String>) {
    runApplication<RentCarServerConfigApplication>(*args)
}
