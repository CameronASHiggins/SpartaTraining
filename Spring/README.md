# What is Spring?

Spring is a way to make programming Java quicker, easier and safer for everybody. Spring focuses on speed, simplicity and productivity, which has made it the world's most popular framework.

The Spring framework is modular by design, allowing developers to choose only the modules they need for their application.

## SpringFramework AKA Spring

This is the foundation for all Spring based projects.

It provides core support for dependency injection, transaction management, web apps, data access, messaging and more.

Based on a few key technologies, foremost is the Inversion of Control (IoC) container. https://docs.spring.io/spring-framework/docs/current/reference/html/core.html

## Spring Projects

Instead of packaging all utilities into the framework Spring utilities that aren't considered necessary for all types of programs are split into different modules (projects).

List of some of the different projects:

| Spring x | Usage |
| --- | --- |
| Boot | Allows you to create a standalone business grade application that "just runs". |
| Data | Provide a familiar and consistent, Spring-based programming model for data access while still retaining the special traits of the underlying data store |
| Cloud |  |
| Cloud Data Flow |  |
| Security |  |
| for GraphQL |  |
| Session |  |
| Integration |  |
| HATEOAS |  |
| Rest Docs |  |
| Batch |  |
| AMQP |  |
| CredHub |  |
| Flo |  |
| for Apache Kafka |  |
| LDAP | Lightweight Directory Access Protocol, allows you to easily identify users |
| Shell |  |
| Statemachine |  |
| Vault |  |
| Web Flow |  |
| Web Services |  |


## Spring Beans

In Spring the objects that form the backbone of your application and that are managed by the Spring IoC container are called "beans".
A bean is an object that is instantiated, assembled and managed by a Spring IoC container.

They are called beans because Java is named after coffee and coffee is made from beans.

## Spring Core Technologies

1. The Inversion of Control Container | Dependency Injection
2. Resources
3. Validation, Data Binding, and Type Conversion
4. Spring Expression Language (SpEL)
5. Aspect Oriented Programming (AOP) with Spring
6. Spring AOP APIs
7. Testing


IoC/DI -  It is a process whereby objects define their dependencies (that is, the other objects they work with) only through constructor arguments, arguments to a factory method, or properties that are set on the object instance after it is constructed or returned from a factory method.

This removes the need for a new keyword in our class. The new class dependencies are instantiated in a factory and are injected into our constructors.
