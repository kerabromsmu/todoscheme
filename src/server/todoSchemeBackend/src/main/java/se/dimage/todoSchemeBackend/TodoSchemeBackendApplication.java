package se.dimage.todoSchemeBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoSchemeBackendApplication {

	@SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        try {
            System.setProperty("spring.devtools.restart.enabled", "false");
            SpringApplication.run(TodoSchemeBackendApplication.class, args);
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
	}

}
