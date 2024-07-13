package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Main implements CommandLineRunner {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }
	@Override
	public void run(String... args) throws Exception {
		//Create the database table:
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS dog(id INT, breed VARCHAR(20), color VARCHAR(10))");
		
		//Insert a record:
		jdbcTemplate.execute("INSERT INTO dog VALUES (0, 'Stella', 'Black')");
	}
}
