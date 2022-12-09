## Streams

Takes input from a collection and allows for the manipulation of this data.
Doesn't change the original data structure.
Returns a new data structure.

A key concept in functional programming.

Source - The actual collection that we are using the stream api on

Intermediate operations - They take a stream and return a stream.

For example:

    Source - list of ints 1 to 100

    Stream1 - list of 10 ints from source

    Stream2 - Stream1.add1toEach

Terminal operation: Required at the end. Returns not a stream.

Optional: Object container for another Object, may or may not have something inside it.
    Can contain null, but we can still run methods on the optional.

    Optional = Container that may or may not contain null

Lambda expressions are an example of functional programming.

