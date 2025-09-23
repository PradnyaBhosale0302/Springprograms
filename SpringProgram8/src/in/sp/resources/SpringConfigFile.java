package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address createAddress()
	{
		Address addr = new Address(111, "Bavdhan", 123456);
		return addr;
	}
	@Bean
	public Student createStudent()
	{
		Student s = new Student(222, "Pradnya", createAddress());
		return s;
	}
}
