## Abstract Classes
Cannot be directly instantiated, so we use them when it would not make sense to create a generic class. (instantiate the class itself)
- Used to share code between closely related classes
For example a vehicle manufacturer would never make a "Vehicle" class, but they would make a "Car" class or a "Motorbike" class.
- Does not support multiple inheritance

### Abstract Methods
Abstract classes can have abstract methods, these methods cannot contain any body whatsoever but make sure that any class that extends the abstract class contains an overridden implementation of the abstract method.

For an example of this see the abstract class Shape and the abstract method calcArea(). Any class that extends shape will throw an error if calcArea is not overridden.

### Interface
Like a blueprint/contract (they don't do anything themselves)
-Implementing classes have to obey this contract.
Concrete classes that implement interface has to override the abstract methods that are in the interface, much like abstract classes.
- They use the "implements" keyword
- Does support multiple inheritance - multiple interfaces can be implemented
- Can be used for unrelated classes implementing your interface
- USed where you want to specify a behaviour, but not how that behaviour is implemented.

---
You can think of implementing an interface is like assigning behaviour to an object while extending a class is declaring a type.

#### e.g. 
- Pikachu can implement attack but cant extend attack (Because Pikachu can attack but isn't an attack)
- Pikachu can extend Pokémon but cannot implement Pokémon (Because Pikachu is a Pokémon but cant Pokémon)

