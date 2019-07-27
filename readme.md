Design patterns for SDA JAVA group 20.
====================


Exercises:
---------

1. Create a builder for Car, Motorcycle, Truck, Plane
   + make sure that the item is immutable!
   + can you find a way to assure that name and brand fields inside, a builder are not empty, when calling the build method?
   
2. Create a CarFactory class for every vehicle from the Builder package.
   + make sure that name and brand are definable by the user 
   + if there is a VIN number generate it by random, same for number od passengers
   + create a separate factory method for Brands: Toyota, Ferrari, <enter your dream car brand name here>
  
3. Refactor the Prototype class so that you it will be working as the pattern suggests. 
    + by convention the method used should be named copy()

4. Create an adapter for EU PowerPlug  

5. Create an internet proxy that blocks access to sites:
facebook.com
youtube.com
instagram.com

6. Create a decorator implementation for the racing car!

7. Implement the observer pattern using the Facebook as an example:
    - make an profile that implements Observer
    - create a few profiles
    - make an Observable topic
    - assure that an observer can observe the observable
    - every time the notifyObservers() method is called the onNotify() on observing observers should be called

8. Implement the state pattern taking a door as an example

9. Implement the visitor Pattern.

10. Implement the command pattern 

11. Implement the Template Method pattern:
    - create an SdaStudent class that extends the Person class
    - create the Mentor class that extends the Person class
    - override the liveADayMethod to be more adequate for SdaStudent and Mentor
    - override some other methods from the Person class to customize each day
    - add some more methods to customize the day even more! 

12. Implement the Chain of responsibility pattern

13. Implement the memento Pattern.


    
Design Patterns Real life analogies:
==================

### CREATIONAL PATTERNS

Singleton: the President, the Pope

CarFactory method: boxed cake fix  

Abstract factory: ~ a mobile phone factory

Builder: irl building Architect

Prototype: Dolly the sheep
    
### STRUCTURAL PATTERNS

ToEuAdapter: US/UK/EU AC plug adapter
    
Bridge: an operating system which uses drivers

Composite: electrical power strip 

Proxy: internet proxy

Decorator: glasses darkening overlay

Flyweight: image on a webpage, used multiple times

Facade: customer support desk/callcenter 
        
### BEHAVIORAL PATTERNS

Chain of Responsibility: ladies at town hall/ tax office

Pizza: an order in a restaurant

Memento: versioned documents (*.doc files), git commits

Observer: fb like button, adding a friend to fb

Template Method: specified pizza, you can modify when placing order

Cashier: a cashier at a shop, for your shopping cart

Mediator: air traffic control tower

Iterator: tv channels
   
Interpreter: a instrument(ex. piano) player interpreting notes and plays on an instrument

State: door lock 

Strategy: getting home from work, by different communication

    
Java code use examples:
===================

### CREATIONAL PATTERNS

Singleton:

    java.lang.Runtime#getRuntime()
    java.awt.Desktop#getDesktop()

CarFactory method: 

    java.util.EnumSet#of()
    
Abstract factory:

    javax.xml.transform.TransformerFactory#newInstance()
    javax.xml.parsers.DocumentBuilderFactory#newInstance()

Builder:

    java.lang.StringBuilder#append()
    java.lang.StringBuffer#append() 

Prototype:

    java.lang.Object#clone() 
 
    
### STRUCTURAL PATTERNS

ToEuAdapter:

    java.util.Arrays#asList()
    java.util.Collections#list()
    
Bridge:

    java.sql.DriverManager

Composite:

    java.awt.Container#add(Component) (practically all over Swing thus)
    javax.faces.component.UIComponent#getChildren() (practically all over JSF UI thus)

Proxy:

    java.lang.reflect.Proxy
    java.rmi.*
    
Decorator:

    java.util.Collections#checkedXXX(), #synchronizedXXX() and #unmodifiableXXX(),
    javax.servlet.http.HttpServletRequestWrapper and HttpServletResponseWrapper

Flyweight:

    java.lang.Boolean#valueOf(boolean)
    java.lang.Integer#valueOf(int)

Facade:
    
    javax.faces.context.ExternalContext -> acts as a facade for 
    ServletContext, HttpSession, HttpServletRequest, HttpServletResponse

        
### BEHAVIORAL PATTERNS

Chain of Responsibility:

    java.util.logging.Logger#log()
    javax.servlet.Filter#doFilter()

Pizza:

    java.lang.Runnable

Memento:

    java.io.Serializable

Observer:

    javax.servlet.http.HttpSessionBindingListener
    javax.servlet.http.HttpSessionAttributeListener

Template Method:

    java.io.InputStream, 
    java.io.OutputStream, 
    java.io.Reader 
    java.io.Writer.

Cashier:

    javax.lang.model.element.Element and ElementVisitor

Mediator:

    java.util.Timer#schedule()
    java.util.concurrent.Executor#execute()
    java.util.concurrent.ExecutorService#invokeXXX(), #submit()

Iterator:
    
    java.lang.Iterator
    java.lang.Enumeration

Interpreter:

    java.util.Pattern
    
State:

    javax.faces.lifecycle.LifeCycle#execute()

Strategy:

    java.util.Comparator#compare()
    