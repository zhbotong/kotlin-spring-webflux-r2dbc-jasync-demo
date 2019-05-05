package cc.shallow.demo.controller

import cc.shallow.demo.Demo
import cc.shallow.demo.repository.DemoRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
class DemoController(val dd:DemoRepository) {

    @GetMapping("/demo")
    fun demo(): Flux<Demo> {
        return dd.findAll()
    }
}