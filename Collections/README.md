## Collections

### Map

- Key - value pairs

### Set

- Unordered collection (unless TreeSet)
- No duplicates allowed

### List

- Ordered (indexed)
- Allows for duplicates

### Linked list

- Stores data and a pointer in each node
- Great for insertions and deletions
- Slow for searching when compared to ArrayList
With a fixed size link list its possible to have a cyclical list.

### Queue
Some queues utilise the stack structure
- Regular type
  - FIFO - First In First Out (elements can be added to the tail and removed from the head)
- Stack (Still a queue)
  - LIFO - Last In First Out (elements can be added to the tail and removed from the tail)

A double ended queue is known as a Deque, elements in a deque can be added or removed from either the head or the tail

Ask about this ^

---

## < & >

These angled brackets specify the type of object will be used in the collection.

---

## The Stack

- .add() adds an element to the tail of the stack
- .pop() returns the tail of the stack and also removes that element from the stack
- .peek() returns the tail of the stack

## Linked List
- Can be referenced as a List or a Queue

### Queue type

- .poll() returns the head of the queue and removes it from the queue
- .peek() returns the head of the queue

## Deque

- .add()
- .addFirst()
- .addLast()

## Vector

It is a thread safe version of ArrayList

---

## The collections framework

the java platform includes a collections framework.
A collection is an object that represents a group of objects.
A collections framework is a unified architecture for representing and manipulating collections, enabling collections to be manipulated indepndently of implementation details.

The primary advantage of a collections framework is that it:

- Reduces programming effort by providing data structures and algorithms so you don't have to write them yourself
- Increase performance by providing high-performance implementations of data structures and algorithms.
- Provides interoperability between unrelated APIs by establishing a common language to pass collections back and forth

among other things.

The java collections framework consists of:

- Collection interfaces
- General purpose implementations
- Legacy implementations
- Bespoke implementations
- Concurrent implementations
- Wrapper implementations
- Convenience implementations
- Abstract implementations
- Algorithms - static methods that perform useful functions for the collection interfaces
- Infrastructure - Interfaces that provide essential support for the collection interfaces.
- Array utilities - utility functions for arrays of primitive types and refernce objects ( not strictly a part of the collections framework, was added to the java platform at the same time as the collections framework and relies on some of the same infrastructure)

### Collection interfaces

There are 2 groups, the basic infrastructure and the others

The basic infrastructure:

- List
- Set
- Sorted Set
- NavigableSet
- Queue
- BlockingQueue
- TransferQueue
- Deque
- BlockingDeque

Other:

- SortedMap
- NavigableMap
- ConcurrentMap
- ConcurrentNavigableMap
  
https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html