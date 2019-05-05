package cc.shallow.demo.repository

import cc.shallow.demo.Demo
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface DemoRepository:ReactiveCrudRepository<Demo,Int> {
}