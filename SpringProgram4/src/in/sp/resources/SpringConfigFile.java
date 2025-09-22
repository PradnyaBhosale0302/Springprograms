package in.sp.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("in.sp.beans")
public class SpringConfigFile {
//	We don't have to create method for bean objects here we will directly write @Component-scan
}
