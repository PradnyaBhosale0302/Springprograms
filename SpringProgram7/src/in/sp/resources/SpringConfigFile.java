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
		Address addr = new Address();
		addr.setHouseno(111);
		addr.setCity("Satara");
		addr.setPincode(123456);
		return addr;
	}
	@Bean
	public Student createStudent()
	{
		Student s = new Student();
		s.setRollno(222);
		s.setName("Pradnya");
		s.setAddress(createAddress()); //Injecting dependencies using setter method
		return s;
	}
}
