package spring.academy.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

import static org.apache.coyote.http11.Constants.a;

@SpringBootApplication
public class SpringAcademyRestfulLabApplication {

    public static void main(String[] args) {
        File file = new File("file.txt");
        file.deleteOnExit();  // Noncompliant
        boolean a = true;
        boolean b = false;
        boolean c = false;
        int d = 0;
        int e = 0;
        if (a)
            if (b)
                d++;
            else     // Noncompliant, is the "else" associated with "if(a)" or "if (b)"? (the answer is "if(b)")
                e++;
        SpringApplication.run(SpringAcademyRestfulLabApplication.class, args);
    }

}
