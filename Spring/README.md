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

A bean is just a Java class that conforms to a set of predefined standard.

A bean must satisfy **6** features
- **Introspections**
  - Introspection is a process of analysing a Bean to determine its capabilities. This is an essential feature of the Java Beans specification because it allows another application, such as a design tool, to obtain information about a component.
- **Properties**
  - A property is a subset of a Bean's state. The values assigned to the properties determine the behaviour and appearance of that component. They are set through a setter method and can be obtained by a getter method.
- **Customisation**
  - A customizer can provide a step-by-step guide that the process must follow to use the component in a specific context.
- **Events**
  - Beans may interact with the EventObject EventListener model.
- **Persistence**
  - Persistence is the ability to save the current state of a Bean, including the values of a Bean's properties and instance variables, to nonvolatile storage and to retrieve them at a later time.
- **Methods**
  - A Bean should use accessor methods to encapsulate the properties. A Bean can provide other methods for business logic not related to the access to the properties.


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

## **Objects define their dependencies only through constructors or setters**
The IoC container "injects" these dependencies when it creates the "bean"
This is fundamentally the inverse, hence the name, of the bean itself controlling the instantiation or location of its dependencies through direct construction of classes.


You can use either or a mix of constructors or setters for dependency inversion.

Setter based DI:

```Java
public class ExampleBean {

    private AnotherBean beanOne;

    private YetAnotherBean beanTwo;

    private int i;

    public void setBeanOne(AnotherBean beanOne) {
        this.beanOne = beanOne;
    }

    public void setBeanTwo(YetAnotherBean beanTwo) {
        this.beanTwo = beanTwo;
    }

    public void setIntegerProperty(int i) {
        this.i = i;
    }
}
```

Constructor based DI:

```Java
public class ExampleBean {

    private AnotherBean beanOne;

    private YetAnotherBean beanTwo;

    private int i;

    public ExampleBean(
        AnotherBean anotherBean, YetAnotherBean yetAnotherBean, int i) {
        this.beanOne = anotherBean;
        this.beanTwo = yetAnotherBean;
        this.i = i;
    }
}
```
