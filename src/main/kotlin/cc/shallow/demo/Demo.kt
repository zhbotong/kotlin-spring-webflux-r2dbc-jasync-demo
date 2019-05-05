package cc.shallow.demo

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime

@Table("demo")
class Demo(
        @Id
        var id:Int,
        var create_date:LocalDateTime?,
        var update_date:LocalDateTime?
)