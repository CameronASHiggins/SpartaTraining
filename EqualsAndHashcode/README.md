## equals() method contract:

### - reflexive
            an object must be equal to itself
            for an object x, x.equals(x) should return true

### - symmetric
            for any objects x and y, if x.equals(y) returns true if and only if y.equals(x) returns true.

### - transitive
            for multiple objects x, y, and z, if x.equals(y) returns true and y.equals(z) returns true,
            then x.equals(z) should return true.

### - consistent
            multiple invocations of x.equals(y) should return the same result, unless any of the object properties
            are modified that are being used in the equals() method implementation

- Object class equals() method implementation returns true only when both the references are pointing to the same
object

---

## Hashcode:
- an int that represents the internal address of an Object
- acts like an identity/barcode for an Object (not necessarily unique)

hashcode() method contract:

### - internal consistency
                multiple invocations of hashcode() (on the same object) should return the same integer value, unless
                a property that is in equals() has changed

### - equals() consistency
                if two objects are equals according to the equals() method, then their hashcode must be the same
                (not necessarily true the other way round)

### - collisions
                if two objects are unequal according to the equals() method, their hash code are not required to be
                different. Their hash codes may or may-not be equal.

## identityHashCode:
- Is a static method and cannot be overridden
- Can be used for things other than hashing and hash tables
- Still not necessarily unique
