# design-pattern
Code examples of common design pattern

Here’s a quick cheat sheet for lots of design patterns.

#1. Observer Design Pattern: 
Contains an object usually referred to as the subject that maintains a a list of dependent classes called observers. The subject object notifies all observers automatically of any state changes by calling their methods.

#2. Factory Design Pattern: 
Creates objects that share the same super class type. Usually has a method named like makeTypeOfSuperClass which accepts an argument to tell it what to do.
#3. Abstract Factory Design Pattern: 
Groups together individual factories. The objects that the these factories return share a common API.

#4. Singleton Design Pattern: 
Used to eliminate the option of instantiating more than one object. Contains a static variable that holds the first instance of the object created. This object is always is returned. Typically returned by using a getInstance method. The constructor is set as a private function to prevent users instantiating it.

#5. Builder Design Pattern: 
Builder objects contain methods that tell a factory how to build/configure an object.

#6. Prototype Design Pattern: 
Creates new objects by copying other objects. Nice to use a clone factory that accepts an object to clone.

#7. Decorator Design Pattern: 
Adds functionality by using many simple classes.

#8. Command Design Pattern: 
Allows you to set aside a list of commands for later use. Each command is typically it’s own command object that implements the same command interface.

#9. Adapter Design Pattern: 
Allows 2 incompatible objects that share a similar purpose to work transparently by abstraction.
#10. Facade Design Pattern: 
Decouples or separates the client from all of the sub components. Main purpose is to simplify interfaces so you don’t have to worry about what’s going on under the hood. Similar to a Service Design Pattern except a Service typically communicates on external service.

#11. Bridge Design Pattern: 
Defines 2 layers of abstraction. One for the target which can be extended for different types of receivers and one for the controls which can be extended to different type of controls that will be able to communicate with the targets.

#11. Template Design Pattern: 
Contains a usually a final method that defines the steps of an algorithm. It allows subclasses to configure the template by overwriting methods.

#12. Iterator Design Pattern: 
Provides a uniform way to access different collection types of objects. For instance, creating an iterator interface that your collections of Arrays, Lists, or Maps can implement so you can iterate over them the same way.

#13. Composite Design Pattern: 
Allows you to attach individual objects and a composition of objects uniformly. For example, imagine a folder tree structure starting at root. This can be the root composite object (aka folder) where it accepts types of files and types of folders. File types have no child components attached to them but a folder can have many more files and even more groupings contained within.

#14. Flyweight Design Pattern: 
Used when creating a lot (i.e.: 100,000 or more) of similar objects. Objects will be created from a factory that checks if a pre-existing object does not exist that shares a similar definition. If a pre- existing object exists with a similar configuration then the factory will return this rather creating a new object and reconfiguring.

#15. State Design Pattern: 
Allows an object to change it’s behavior when it’s state changes. Each state implements a behavior associated with it’s state of context. Should be implemented with as few states as possible. Ie: Imagine a database connection that has  two states (connected and disconnected) and a query method. The connection object execute the query method differently depending on it’s connection state.

#16. Proxy Design Pattern: 
Provides a class with limited access to another class. This is done for security reasons.

#17. Chain of Responsibility Design Pattern: 
Sends problem to an object and if that object can’t use it, then it sends it to an object chained to it that might. The object chained to it can have an additional object chained and will continue to run it’s course until it finds an object that can solve the problem.

#18. Interpreter Design Pattern: 
This pattern solves a problem by using a context object to interpret an issue and find a class using reflection to return the answer.

#19. Mediator Design Pattern: 
Handles communication between related objects without having to know anything about each other. Objects are typically constructed with the mediator passed in. Mediator will regulate interactions.

#20. Memento Design Pattern: 
Useful for saving history states of an object. The object stored in state is referred to as the Memento. Mementos are managed by caretakers contain a list of each version for retrieval. Lastly, we have an originator which is responsible for communicating with the caretaker to save and restore states. Imagine a save, under, and redo scenario.

#21. Visitor Design Pattern: 
Allows you to perform the same action on many objects of different types without much alteration to those classes. A concrete Visitor class will implement a common visit method for each type of visitor. Each visitable will implement a Visitable interface that implements an accept method. Upon usage, each visitable object can pass a type of visitor object to perform different functions. Extremely useful for creating new ways of Visitors without touching Visitable classes.

