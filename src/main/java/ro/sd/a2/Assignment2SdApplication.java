package ro.sd.a2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.sd.a2.dto.CreateUserDtoFront;
import ro.sd.a2.entity.Movie;
import ro.sd.a2.entity.User;
import ro.sd.a2.repository.MovieRepository;
import ro.sd.a2.repository.UserRepository;
import ro.sd.a2.service.MovieService;
import ro.sd.a2.service.UserService;

@SpringBootApplication
public class Assignment2SdApplication {





    public static void main(String[] args) {
        SpringApplication.run(Assignment2SdApplication.class, args);
    }

    }

