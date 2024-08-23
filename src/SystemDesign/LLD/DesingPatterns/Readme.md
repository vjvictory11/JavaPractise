# Types of Design Patterns.

Reference: https://github.com/iluwatar/java-design-patterns

| Type       | Pattern   | Description                                                                                 |
|------------|-----------|---------------------------------------------------------------------------------------------|
| Creational | Singleton | create single instance of a class                                                           |
| | Builder   | Flexibility in construction process, as well as for immutables classes                      |
| | Factory   | Used to hide the complexity of object creation.                                             |
| | Abstract Facotry | factory of factories                                                                        |
| Structural | Adapter| Used when we need to add a class which is incompatible with implementations of an interface |
| | Decorator | Used when we need to modify any implemented classes. 
| | Facade| Used to hide the internal logics|
| Behavioral| Chain of Responsibility| Used to chain and pass the onjects from one class to another|

## Creational
### Singleton
1. Create a private variable of same class
2. create private constructor
3. create a public method to get instance of that class.

### Builder
1. Create a static inner class along with setters
2. create a build method which will call the constructor of outer class which takes inner class as parameter.

### Factory
1. Craete a factory class and create a method like get().
2. based on params passed, return the right implementation.
### Abstract factory
1. If need to group a list of implementations under different factories.
2. create a parent factory which will return correct factory based on requirement.

## Structural
### Adapter
1. Create a Adapter class and extend it with the base class.
2. create a constructor which will have the incompatible class object as param.
3. implement the base class methods and pass correct values.
### Decorator
Eg: VegBurger, NonVegBurger extends Burger(abstract class). Now if you want to add toppings then you will create
a BurgerDecorator(abstract class) extends Burger.
Then you create extraCheesBurger(Burger) extends BurgerDecorator.
1. Create an abstract class decorator which extends base abstrac class.
2. create impl of abstract decorator class which takes Burger as param in constructor.
3. Override the methods of base class using the burger properties as well.
### Facade
Service is a facade as it hides all the different calls and exposes only one method to the client.

## Behavioural
### Chain of responsibility
1. Create ab interface class which will methods like canHandleRequest, handle
2. implementations or abstract of this interface will contain one more variable called next which will store which method to call next.
3. client will just call the handle method of the interface and rest will be taken up by the chain

### Command 





