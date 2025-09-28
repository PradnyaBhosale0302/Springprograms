package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;

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
	public Subjects createSubjects()
	{
		Subjects s = new Subjects();
		List<String> subjects_list = new ArrayList<String>();
		subjects_list.add("HTML");
		subjects_list.add("CSS");
		subjects_list.add("JS");
		subjects_list.add("Java");
		s.setSubjects(subjects_list);
		return s;
	}
	@Bean
	public Student createStudent()
	{
		Student s = new Student();
		s.setName("Pradnya");
		s.setRollno(222);
//		s.setAddress(createAddress()); //Manually DI
//		s.setSubjects(createSubjects());
		return s;
	}
}
