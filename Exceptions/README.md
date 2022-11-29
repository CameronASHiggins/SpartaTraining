## Exceptions

Exceptions are not the same as errors, although both are usually unexpected exceptions can be anticipated and dealt with.
Exceptions interrupt the flow of a program.

You can make your own exceptions - want to disrupt your own program's flow.

When an exception occurs at runtime, the normal flow of the program is disrupted, the exception is thrown and the program terminates.

![img.png](img.png)

A common way of dealing with exceptions is a try catch finally block.
```java
try{
   //some code that might throw an exception
} catch (someException e){
    //do this if that exception happens
} finally {
    //this code will always run
}
//continue code with the exception now handled
```

If you don't do anything with the catch statement that's called "hiding the exception" and is awful.
The minimum is print the exception and terminate code block.

You can use multiple catch statements but only one catch block will run for the try statement.
If you get multiple exceptions in the try block the first applicable catch will run and then the rest of the catch blocks will be skipped.

You can have a single catch block catch multiple exceptions like so:

```java
catch(someException | someOtherException e){/* some code*/ }
```

