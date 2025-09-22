package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Student stdId1()
	{
		Student s = new Student();
		s.setName("Pradnya");
		s.setRollno(111);
		s.setEmail("pradnya123@gmail.com");
		return s;
	}
	
	@Bean("beanObj")
	public Student stdId2()
	{
		Student s = new Student();
		s.setName("Pradnyaa");
		s.setRollno(222);
		s.setEmail("pradnya222@gmail.com");
		return s;
	}
}
