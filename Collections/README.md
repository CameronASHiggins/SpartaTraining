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