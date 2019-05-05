package cc.shallow.demo

import com.github.jasync.r2dbc.mysql.JasyncConnectionFactory
import com.github.jasync.sql.db.Configuration
import com.github.jasync.sql.db.mysql.pool.MySQLConnectionFactory
import io.r2dbc.spi.ConnectionFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories

@SpringBootApplication
class KotlinSpringWebfluxR2dbcJasyncDemoApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringWebfluxR2dbcJasyncDemoApplication>(*args)
}

/**
 * mysql config
 */
@EnableR2dbcRepositories
@org.springframework.context.annotation.Configuration
class MysqlDataBase: AbstractR2dbcConfiguration() {
	override fun connectionFactory(): ConnectionFactory {
		val mycf = MySQLConnectionFactory(Configuration(host = "localhost",username = "root",
				password = "123456",port = 3306,database = "demo"))
		return JasyncConnectionFactory(mycf)
	}
}