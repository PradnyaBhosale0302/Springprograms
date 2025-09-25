package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfig {
	@Bean
	public Address createAddress()
	{
		Address a = new Address();
		a.setHouseno(111);
		a.setCity("Mumbai");
		a.setPincode(123456);
		return a;
	}
	@Bean
	public Student createStudent()
	{
		Student s = new Student();
		s.setName("Pradnya");
		s.setRollno(222);
//		s.setAddress(createAddress()); //Manually DI
		return s;
	}
}
