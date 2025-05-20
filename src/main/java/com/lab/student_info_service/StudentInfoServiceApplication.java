package com.lab.student_info_service;

import com.lab.student_info_service.model.Student;
import com.lab.student_info_service.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentInfoServiceApplication.class, args);
	}


	/*@Bean
	CommandLineRunner initData(StudentRepository repository) {
		return args -> {
			Student s1 = new Student();
			s1.setName("Lucy");
			s1.setAge(21);

			Student s2 = new Student();
			s2.setName("Carla");
			s2.setAge(19);

			Student s3 = new Student();
			s3.setName("Tom");
			s3.setAge(22);

			repository.save(s1);
			repository.save(s2);
			repository.save(s3);
		};
	}*/

}
