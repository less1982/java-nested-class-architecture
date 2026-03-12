# java-nested-class-architecture
An implementation of Java Nested Classes demonstrating strong encapsulation by decoupling engine logic within a primary vehicle class.

The Goal: To model a complex real-world object (a Car) using Java's Nested feature. The objective was to ensure that the internal components (like the engine) are logically tied to the parent object while remaining hidden from other parts of the application.

The Challenge: In software design, you want to avoid "leaking" complexity. A user should be able to "drive" a car without needing to manually start or shift the engine themselves. The challenge was to create a protected inner class that handles these technical details while the outer class provides a simple public interface.

The Solution: I implemented a Member Inner Class (InnerEngine) within the OuterCar class. This allows the engine to access the outer class' private members while remaining encapsulated. By calling the engine's methods inside the drive() method, I created a clean "abstraction layer" where the test driver only interacts with the top-level OuterCar object.
