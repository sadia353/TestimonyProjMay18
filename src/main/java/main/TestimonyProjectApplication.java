package main;

<<<<<<< HEAD

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import profile.ProfileDAO;
import profile.ProfileDAOImpl;

@Configuration
@ComponentScan("profile")
@EnableAutoConfiguration
=======
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
>>>>>>> 2195bbc74b4722dc92256b008e7570cdfcefaaf3
public class TestimonyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestimonyProjectApplication.class, args);
    }
<<<<<<< HEAD
    @Bean
	public DataSource getDataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/testimonials");
		dataSource.setUsername("sabertooth");
		dataSource.setPassword("sabertooth");
		
		return dataSource;
	}

	@Bean
	public ProfileDAO getProfileDAO(){
		return new ProfileDAOImpl( getDataSource() );
	}
=======
>>>>>>> 2195bbc74b4722dc92256b008e7570cdfcefaaf3
}
