

# Dependency Injection using Spring Boot

This project demonstrates how Spring Boot handles dependency injection using the IoC container and the `@Component` annotation.

## Description

The source code includes:

1. An interface `ApplicationContext` from the Spring Framework, which extends multiple interfaces:
   - `EnvironmentCapable`
   - `ListableBeanFactory`
   - `HierarchicalBeanFactory`
   - `MessageSource`
   - `ApplicationEventPublisher`
   - `ResourcePatternResolver`

This interface provides methods like:
- `getId()`
- `getApplicationName()`
- `getDisplayName()`
- `getStartupDate()`
- `getParent()`
- `getAutowireCapableBeanFactory()`

These are used internally by Spring to manage beans and application configuration.

2. A simple class `Dev` in the package `com.example.Dependency_Injection`:

```java
@Component
public class Dev {
    public void build(){
        System.out.println("I am building a project.");
    }
}
````

This class is annotated with `@Component`, which tells Spring to register it as a bean in the application context.

---

## Summary

* Spring Boot automatically scans and registers `@Component` annotated classes.
* The `Dev` class can then be retrieved using `ApplicationContext.getBean(Dev.class)`.
* This demonstrates how Spring handles object creation and dependency injection using annotations.
  
