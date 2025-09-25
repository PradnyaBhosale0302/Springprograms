# Spring Programs Collection

This repository contains multiple Spring programs, each in its own folder.

## Projects

1. SpringProgram1 - XML Configuration  
   - Location: `SpringProgram1/`  
   - How to Run: Open in your IDE (Eclipse/IntelliJ), run the `Main` class.  
   - Configuration: Spring XML file (`applicationContext.xml`) is used for bean configuration.

2. SpringProgram2 - Java-based Configuration  
   - Location: `SpringProgram2/`  
   - How to Run: Open in IDE, run the `Main` class.  
   - Configuration: Spring beans are configured using a Java `@Configuration` class with `@Bean` methods.  
   - Notes: Defines multiple `Student` beans programmatically (`stdId1`, `beanObj`) instead of using XML.

3. SpringProgram3 - Annotation-based Configuration  
   - Location: `SpringProgram3/`  
   - How to Run: Open in IDE, run the `Main` class.  
   - Configuration: Uses `@Component` and `@Value` annotations for injecting values from properties or XML.
  
4. SpringProgram4

## Notes

- Each program is independent and can be run separately.  
- Compiled files and IDE settings are **ignored** via `.gitignore`.  
- Make sure your IDE is configured to use **Java 8+** and has **Spring libraries** added.
