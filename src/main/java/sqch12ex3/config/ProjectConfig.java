package sqch12ex3.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class ProjectConfig {
	
	@Bean
	DataSource customDataSource() {
		HikariDataSource dataSource = new HikariDataSource();
		return dataSource;
	}

}
