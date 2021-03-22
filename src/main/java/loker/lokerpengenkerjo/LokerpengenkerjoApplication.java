package loker.lokerpengenkerjo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;



@SpringBootApplication
public class LokerpengenkerjoApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(LokerpengenkerjoApplication.class, args);
// 	}

// }


// @SpringBootApplication  
// public class LokerpengenkerjoApplication implements CommandLineRunner {

    // @Autowired
	// private JdbcTemplate jdbcTemplate;
	
public static void main(String[] args) {
    SpringApplication.run(LokerpengenkerjoApplication.class, args);
}

// @Override
// public void run(String... args) throws Exception {
//     String sql = "INSERT INTO roles (name) VALUES ("
//             + "'ROLE_ADMIN')";
     
//     int rows = jdbcTemplate.update(sql);
//     if (rows > 0) {
//         System.out.println("A new role has been inserted.");
//     }
// }
}
