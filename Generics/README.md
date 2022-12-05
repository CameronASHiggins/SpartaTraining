## Generics / Wildcards

We can state a generic type for an object if we don't know what type it will be yet.

To do this we use the generic type T, E or ?

We can make collections of E types, using List<E> however there is no way to check the content type during runtime
as generics are only checked during compilation time.

We can have generics that extend other types so we can have anything of that type.

So we can extend a superclass and due to the liskov substitution principle any subclass of that superclass can be used as that generic type

List<T extends Person> could contain Person objects, Employee objects or Customer objects.

    <T extends Comparable<T>>
Means that the type parameter must support comparison with other instances
of its own type. We need the second specification of T because Comparable is a generic interface.

This is known as a bounded generic, you can set the upper bound with extends and the lower bound with super

    <? extends T> and <? super T>

 When T extends a class its raw type changes to that class 

