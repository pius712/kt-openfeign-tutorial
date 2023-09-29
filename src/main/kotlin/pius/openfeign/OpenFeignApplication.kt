package pius.openfeign

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class OpenFeignApplication

fun main(args: Array<String>) {
    runApplication<OpenFeignApplication>(*args)
}
