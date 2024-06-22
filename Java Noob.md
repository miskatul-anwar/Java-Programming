# Setup ☕

## Setup Process 🚀

```Bash
java --version
```

If you haven't installed java, then write down the following code to install java in your arch linux system.

```Bash
sudo pacman -S jdk-openjdk
```

Now, you have successfully installed java ☕

```
#setup java virtual machine
sudo archlinux-java set java-17
#you can choose your version , I've choosen mine
```

Yay! 🌌
you are now in _java_ environment!

## how to run java program? 🧩

### Sample Java Code: ☕

```Java
public class hello {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
```

### Now, Compile and run: 🏃

```Bash
javac hello.java
java hello
```

### Output in Console: 💻

```Bash
Hello World!
```

# Program Basics 
## The `instanceof` operator

The `instanceof` operator in Java is used to check if an object is an instance of a particular class, interface, or superclass. It returns `true` 
if the object is an instance of the specified type, and `false` otherwise.

Here are some examples:

1. **Checking if an object is an instance of a class**:
```java
public class Animal {
    // ...
}

public class Dog extends Animal {
    // ...
}

Dog myDog = new Dog();
System.out.println(myDog instanceof Animal); // prints true
```
In this example, we're checking if `myDog` is an instance of the `Animal` class. Since `Dog` is a subclass of `Animal`, the result is `true`.

2. **Checking if an object implements an interface**:
```java
public interface Printable {
    void print();
}

public class Document implements Printable {
    public void print() {
        System.out.println("Printing document...");
    }
}

Document myDoc = new Document();
System.out.println(myDoc instanceof Printable); // prints true
```
In this example, we're checking if `myDoc` implements the `Printable` interface. Since it does, the result is `true`.

3. **Checking if an object is a subclass of another class**:
```java
public class Vehicle {
    // ...
}

public class Car extends Vehicle {
    // ...
}

Car myCar = new Car();
System.out.println(myCar instanceof Vehicle); // prints true
```
In this example, we're checking if `myCar` is an instance of the `Vehicle` class. Since it's a subclass of `Vehicle`, the result is `true`.

4. **Using instanceof with null**:
```java
Object obj = null;
System.out.println(obj instanceof Object); // prints false
```
In this example, we're checking if a null object is an instance of the `Object` class. Since it's not an instance of anything (it's null), the 
result is `false`.

5. **Using instanceof with primitive types**:
```java
int x = 5;
System.out.println(x instanceof Integer); // prints true
```
In this example, we're checking if a primitive `int` value is an instance of the `Integer` class. Since it's a wrapper around the primitive type, 
the result is `true`.

Remember that `instanceof` only checks the runtime type of the object, not its compile-time type. This means you can use it to check for 
unexpected types at runtime, but be careful when using it to ensure correct behavior in your code.

## The `static` keyword
***
The `static` keyword in Java is used to declare static variables or methods that belong to a class rather than an instance of the class. Here are 
some key uses of the `static` keyword:

1. **Static Variables**: You can use `static` variables to store values that don't change throughout the program's execution.

Example:
```java
public class MyMath {
    public static int MAX_VALUE = 100;

    public static void main(String[] args) {
        System.out.println(MyMath.MAX_VALUE); // prints 100
    }
}
```
In this example, `MAX_VALUE` is a class-level variable that can be accessed without creating an instance of the `MyMath` class.

2. **Static Methods**: You can use `static` methods to perform operations that don't depend on instance-specific data.

Example:
```java
public class MathUtil {
    public static double sqrt(double num) {
        return Math.sqrt(num);
    }

    public static void main(String[] args) {
        System.out.println(MathUtil.sqrt(4)); // prints 2.0
    }
}
```
In this example, the `sqrt` method is a `static` method that can be called without creating an instance of the `MathUtil` class.

3. **Singleton Pattern**: You can use `static` variables to implement the Singleton pattern, where only one instance of a class exists throughout 
the program's execution.

Example:
```java
public class Logger {
    private static Logger instance = null;

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // ...
}
```
In this example, the `Logger` class uses a `static` variable to keep track of the single instance.

4. **Utility Methods**: You can use `static` methods as utility methods that can be called from anywhere in your code without creating an instance
of the class.

Example:
```java
public class StringHelper {
    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static void main(String[] args) {
        System.out.println(StringHelper.isEmpty("")); // prints true
        System.out.println(StringHelper.isEmpty("hello")); // prints false
    }
}
```
In this example, the `isEmpty` method is a `static` utility method that can be called from anywhere in your code.

These are just a few examples of how you can use the `static` keyword in Java. Remember to use it wisely and only when necessary!
## Encapsulation
***
- Java Packages
- Access Modifiers
- Java Encapsulation
- Data Hiding
- The `static` keyword
### Java Packages
A package is simply a container that groups related types (Java classes, interfaces, enumerations, and annotations)
An example package: 
![[Screenshot_20240621_095243.png]]
How to use them?
![[Pasted image 20240621095621.png]]
### Access Modifiers
In Java, access modifiers are keywords that determine the visibility of a class, method, or variable to other parts of your program. They control 
who can see or interact with these elements.

**Access Modifiers**

1. **public**: Accessible from anywhere in your program.
2. **private**: Only accessible within the same class.
3. **protected**: Accessible only within the same class and its subclasses.
4. **default** (or no modifier): Accessible only within the same package.

**Examples**

Let's consider a simple example with a class `Car`:
```java
public class Car {
    // public variable
    public String color = "red";

    // private method
    private void startEngine() {
        System.out.println("Vroom!");
    }

    // protected constructor
    protected Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
}
```
**Use Cases**

### Public

* Use public classes when you want to expose a class or interface to the outside world.
* Examples:
	+ A web service API that needs to be accessed by clients.
	+ A utility class that provides common functionality.

```java
public class MathUtils {
    public static int sum(int a, int b) {
        return a + b;
    }
}
```
### Private

* Use private variables or methods when you want to hide internal implementation details from the outside world.
* Examples:
	+ A `Car` class might have a private `startEngine()` method that's not meant to be called directly by other classes.
	+ An immutable class might have private setters and getters.
#### Getters & Setters
Sample code on getters and setters: 
![[Pasted image 20240621100946.png]]
Another example:
![[Pasted image 20240621103550.png]]
#### Types of Access Modifiers

| Access <br>Modifiers | Same<br>Class | Same<br>package<br>subclass | Same<br>package<br>non-subclass | Difference<br>Package<br>subclass | Different<br>package<br>non-subclass |
| :------------------: | :-----------: | :-------------------------: | :-----------------------------: | :-------------------------------: | :----------------------------------: |
|      `default`       |       Y       |              Y              |                Y                |                 N                 |                  N                   |
|      `private`       |       Y       |              Y              |                N                |                 N                 |                  N                   |
|     `protected`      |       Y       |              Y              |                Y                |                 Y                 |                  N                   |
|       `public`       |       Y       |              Y              |                Y                |                 Y                 |                  Y                   |

### Encapsulation
Encapsulation is a fundamental concept in object-oriented programming (OOP) that binds together the data (variables) and the methods (functions) 
that manipulate that data within a single unit, such as a class or module. This unit is designed to hide its internal details from the outside 
world while exposing only necessary information through a controlled interface.

**Why Encapsulation?**

1. **Data Hiding**: Encapsulation helps to hide the implementation details of an object from the outside world, making it difficult for other 
parts of the program to access or modify the data directly.
2. **Abstraction**: It provides abstraction by showing only the necessary information to the outside world while hiding the internal 
implementation details.
3. **Code Organization**: Encapsulation promotes good code organization and structure by grouping related data and methods together.

**Java Examples:**

1. **Simple Class**: A basic Java class that encapsulates a private integer variable `x` and provides a public method `getValue()` to retrieve its
value:
```java
public class SimpleClass {
    private int x;

    public SimpleClass(int x) {
        this.x = x;
    }

    public int getValue() {
        return x;
    }
}
```
2. **Bank Account**: A Java class that encapsulates a bank account, with private fields for balance and account number, and public methods to 
deposit, withdraw, and get the balance:
```java
public class BankAccount {
    private double balance;
    private int accountNumber;

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public double getBalance() {
        return balance;
    }
}
```
3. **Student Record**: A Java class that encapsulates a student's record, with private fields for name, age, and grades, and public methods to set
and retrieve the information:
```java
public class StudentRecord {
    private String name;
    private int age;
    private double[] grades;

    public StudentRecord(String name, int age) {
        this.name = name;
        this.age = age;
        this.grades = new double[5];
    }

    public void setGrade(int index, double grade) {
        grades[index] = grade;
    }

    public double getAverageGrade() {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}
```
**Use Cases:**

1. **Security**: Encapsulation ensures that sensitive data is protected from unauthorized access.
2. **Code Reusability**: By encapsulating related data and methods, you can reuse the code in different parts of your program.
3. **Improved Code Organization**: Encapsulation helps to organize your code in a logical and structured way.

**Applications:**

1. **Database Management Systems**: Database management systems like MySQL or Oracle use encapsulation to hide their internal implementation 
details while providing a controlled interface for data manipulation.
2. **Financial Applications**: Banking and financial applications, such as accounting software, use encapsulation to protect sensitive customer 
data and ensure secure transactions.
3. **Gaming**: Games often use encapsulation to hide the internal workings of game mechanics, levels, or characters, making it easier to modify or
extend the game without affecting other parts.

In summary, encapsulation is a fundamental concept in object-oriented programming that helps to organize code, protect sensitive data, and improve
code reusability.
### Data Hiding

Data hiding is a principle of encapsulation that conceals the internal representation of an object's state (data) from external objects, making it
difficult for other parts of the program to access or modify the data directly. This helps to:

1. **Prevent Accidental Changes**: By hiding the internal state, you prevent accidental changes to the data from outside the class.
2. **Control Access**: You can control access to the data by providing methods (getters and setters) that allow only authorized objects to modify 
the data.
3. **Improve Code Quality**: Data hiding encourages good coding practices, such as using meaningful variable names and encapsulating related data.

**How to Apply Data Hiding:**

1. **Make Data Private**: Declare the data variables as private within the class:
```java
public class Example {
    private int x;
    // ...
}
```
2. **Use Getters and Setters**: Provide public methods (getters and setters) that allow controlled access to the data:
```java
public class Example {
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int value) {
        x = value; // validate or transform the value if needed
    }
}
```
3. **Avoid Direct Access**: Refrain from accessing the data directly from outside the class:
```java
public class Example {
    private int x;

    public void someMethod() {
        System.out.println(x); // bad practice, avoid direct access
    }
}
```
**Best Practices:**

1. **Use Meaningful Variable Names**: Use descriptive names for your variables to make the code more readable.
2. **Limit Access Modifiers**: Limit access modifiers (public, private, protected) to only what's necessary.
3. **Validate Input**: Validate input data before modifying it to ensure integrity and prevent errors.
4. **Use Immutable Objects**: Consider using immutable objects when possible, especially for sensitive or critical data.

**Real-World Examples:**

1. **Bank Account**: A bank account class should hide its internal balance and only provide methods for depositing, withdrawing, and getting the 
balance.
2. **Person Information**: A person information class might hide their personal details (name, age, address) and provide getter methods to access 
this information.

By applying data hiding principles, you can create more robust, maintainable, and secure code that is easier to understand and modify over time.
## File Handling
***
* Write a program of copy the contents of a file named “INPUT.DAT” into a file called “OUPUT.DAT”.
```java
public class copyPaste {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("input.dat"));
    String str;
    if ((str = br.readLine()) != null) {
      System.out.println(str);
    }
    br.close();
    BufferedWriter bw = new BufferedWriter(new FileWriter("output.dat"));
    // bw.write(str);
    bw.append(str);
    bw.close();
    return;
  }
}
```
* Another example:
```java
import java.io.*;

public class file1 {
  public static void main(String[] args) throws IOException {
    FileOutputStream fout = new FileOutputStream("Test.txt");
    DataOutputStream out = new DataOutputStream(fout);
    out.writeDouble(98.6);
    out.writeInt(1000);
    out.writeBoolean(true);
    out.close();
    FileInputStream fin = new FileInputStream("Test.txt");
    DataInputStream in = new DataInputStream(fin);
    double d = in.readDouble();
    int i = in.readInt();
    boolean b = in.readBoolean();
    System.out.println("Here are the values: " + d + " " + i + " " + b);
    in.close();
  }
}
```
* One more:
```java
import java.io.*;

/**
 * file3
 */
public class file3 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("output.txt"));
    String str;
    if ((str = br.readLine()) != null) {
      System.out.println(str);
    }
    br.close();
    return;
  }
}
```
## `final` keyword in Java
***

|       Type        |                                  Description                                  |
| :---------------: | :---------------------------------------------------------------------------: |
| Final<br>Variable | Variable with `final` keyword ==cannot be assigned again==, like `const` in C |
|  Final<br>Method  |      Method with `final` keyword cannot be overriden by it's subclasses       |
|  Final<br>Class   | Class with `final` keyword cannot be extended or inherited from other classes |

## Java Inheritance
***
### 01 (Method overriding)
```java
// Parent class (Shape)
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Child class (Circle) that extends the parent class (Shape)
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Child class (Rectangle) that extends the parent class (Shape)
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class inheritance {
    public static void main(String[] args) {
        // Create objects of the child classes
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        // Use polymorphism to call the draw method on these objects
        Shape shape1 = circle;
        Shape shape2 = rectangle;

        shape1.draw();  // Output: Drawing a circle
        shape2.draw();  // Output: Drawing a rectangle
    }
}

```
### 02
```java
// Parent class (Vehicle)
class Vehicle {
    void start() {
        System.out.println("Starting a vehicle");
    }
}

// Child class (Car) that extends the parent class (Vehicle)
class Car extends Vehicle {
    void accelerate() {
        System.out.println("Accelerating a car");
    }
}

// Child class (Motorcycle) that extends the parent class (Vehicle)
class Motorcycle extends Vehicle {
    void revEngine() {
        System.out.println("Revving a motorcycle engine");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects of the child classes
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        // Use polymorphism to call the start method on these objects
        Vehicle vehicle1 = car;
        Vehicle vehicle2 = motorcycle;

        vehicle1.start();  // Output: Starting a vehicle
        vehicle2.start();  // Output: Starting a vehicle
    }
}
```
## `super` keyword
***
* Unable to find your parents ?
```java
class Animal {
    void sound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        super.sound();
        System.out.println("Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  // Output: The animal makes a sound, Woof!
    }
}
```
## `this` keyword
***
_Wanna abuse current object?_
* A sample code without `this` keyword :
```java
class Complex {
  int a, b;

  public Complex(int real, int imaginary) {
    a = real;
    b = imaginary;
  }

  void print() {
    System.out.println(a + " + " + b + "i");
  }

  Complex add(Complex num2) {
    Complex newnum = new Complex(a + num2.a, b + num2.b);
    return newnum;
  }
}

public class this1 {
  public static void main(String[] args) {
    Complex num1 = new Complex(11, 15);
    Complex num2 = new Complex(11, 15);
    num1.print();
    Complex res = num1.add(num2);
    res.print();
    return;
  }
}


```
* Let's use `this` keyword,
```java
class Complex {
  int a, b;

  public Complex(int a, int b) {
    this.a = a;
    this.b = b;
  }

  void print() {
    System.out.println(a + " + " + b + "i");
  }

  Complex add(Complex num2) {
    Complex newnum = new Complex(a + num2.a, b + num2.b);
    return newnum;
  }
}

public class this1 {
  public static void main(String[] args) {
    Complex num1 = new Complex(11, 15);
    Complex num2 = new Complex(11, 15);
    num1.print();
    Complex res = num1.add(num2);
    res.print();
    return;
  }
}
```

### What's the differece between `this` and `super`

|                                              `this`                                               |                                                   `super`                                                   |
| :-----------------------------------------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------: |
|      `this` is an implicit reference variable<br>keyword used to represent the current class      |       `super` is an implicit reference variable keyword used to represent the immediate parent class        |
|                         `this` is to invoke methods of the current class                          |                       `super` is used to invoke methods of the immediate parent class                       |
|                    `this` is used to invoke a constructor of the current class                    |                    `super` is used to invoke a constructor of the immediate parent class                    |
|            `this` refers to the instance and static variables of the current class<br>            |              `super` refers to the instance and static variables of the immediate parent class              |
| `this` can be used to return and pass as an argument in the context<br>of a currentt class object | `super` can be used to return and pass as an<br>argument in the context of an immediate parent class object |

## Constructors : Abusing `class`
***
### 01
```java
class Innerconstructors {
  int a, b;

  public Innerconstructors() {
    a = 4;
    b = 7;
  }

  void print() {
    System.out.println(a + b);
  }

}

/**
 * constructors
 */

public class constructors {

  public static void main(String[] args) {
    Innerconstructors num1 = new Innerconstructors();
    num1.print();
    return;
  }
}

// OUTPUT: 11
```
### 02
```java
class Innerconstructors {
  int a, b;

  public Innerconstructors() {
    a = 4;
    b = 7;
    System.out.println("New object created !");
  }

  void print() {
    System.out.println(a + b);
  }

}

public class constructors {

  public static void main(String[] args) {
    Innerconstructors num1 = new Innerconstructors();
    // num1.print();
    return;
  }
}
//OUTPUT: New object created!
```
### 03
```java
class Innerconstructors {
  int a, b;
  public Innerconstructors(int real, int imaginary) {
    a = real;
    b = imaginary;
  }
  void print() {
    System.out.println(a + b);
  }

}

public class constructors {

  public static void main(String[] args) {
    Innerconstructors num1 = new Innerconstructors(11, 15);
    return;
  }
}

```
### 04
```java
class Innerconstructors {
  int a, b;

  public Innerconstructors(int real, int imaginary) {
    a = real;
    b = imaginary;
  }

  void print() {
    System.out.println(a + ' ' + b + 'i');
  }

}

public class constructors {

  public static void main(String[] args) {
    Innerconstructors num1 = new Innerconstructors(11, 15);
    num1.print();
    return;
  }
}

```

## Method Overloading
***
```java
public class methodOverloading {
  void greetings() {
    System.out.println("Hello, Good Morning! ");
  }

  void greetings(String name) {
    System.out.println("Hello" + name + ", Good Morning! ");
  }
}

```
## Possible ways to iterate `🏃`
***
```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.ListSelectionModel;

/**
 * iterateInMap
 */
public class iterateInMap {
  public static void main(String[] args) {
    System.out.println("Ways to iterateInMap: ");
    // TreeMap<String, Integer> tm = new TreeMap<>();
    // HashMap<String, Integer> hm = new HashMap<>();
    Map<String, Integer> tm = Map.of(
        "one", 1,
        "two", 2,
        "three", 3);
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("Hello");

    arrayList.forEach(it -> System.out.println(it));

    // tm.put("one", 1);
    // tm.put("two", 2);
    // tm.put("three", 3);
    // tm.put("one", 1);
    // tm.put("two", 2);
    // tm.put("three", 3);

    // Method I
    for (Map.Entry<String, Integer> entry : tm.entrySet()) {
      System.out.println(entry.getKey() + " -> " + entry.getValue());
    }

    // Method II
    for (String key : tm.keySet()) {
      System.out.println(key + " -> " + tm.get(key));
    }

    // Method III
    for (Integer val : tm.values()) {
      System.out.println("Value: " + val);
    }

    // Method IV
    tm.forEach((key, value) -> System.out.println(key + " + " + value));
    return;
  }
}

```
## String Builders
***
```java
import cse.utils.*;

public class StringBuilders {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    sb.append("Hello");
    sb.append(", ");
    sb.append("World");
    spec.println(sb.charAt(0));
    // sb.setCharAt(0, '4');
    spec.print(sb);
    for (int i = 0; i < sb.length(); i++) {
      sb.setCharAt(i, (char) (sb.charAt(i) + 1));
    }
    spec.print(sb);
  }
}
```
## The `Map` framework
***
### Tree Map
```java
import java.util.*;

public class treeMap1 {
  public static void main(String[] args) {
    TreeMap<String, Integer> hp = new TreeMap<>();
    hp.put("Bus", 2);
    hp.put("Car", 1);
    hp.put("Zeep", 1);
    hp.put("Plane", 1);
    System.out.println(hp);
    if (hp.containsKey("Bus")) {
      hp.putIfAbsent("Bus", 2);
    }
    if (hp.containsValue(2)) {
      System.out.println("Duo");
      System.out.println();
    }
    for (HashMap.Entry<String, Integer> e : hp.entrySet()) {
      System.out.println(e);
    }
    System.out.println();
    for (String Key : hp.keySet()) {
      System.out.println(Key);
    }
    return;
  }
}

```
### Hash Map
```java
import java.util.*;

public class hashMap1 {
  public static void main(String[] args) {
    HashMap<String, Integer> hp = new HashMap<>();
    hp.put("Bus", 2);
    hp.put("Car", 1);
    hp.put("Zeep", 1);
    hp.put("Plane", 1);
    System.out.println(hp);
    if (hp.containsKey("Bus")) {
      hp.putIfAbsent("Bus", 2);
    }
    if (hp.containsValue(2)) {
      System.out.println("Duo");
      System.out.println();
    }
    for (HashMap.Entry<String, Integer> e : hp.entrySet()) {
      System.out.println(e);
    }
    System.out.println();
    for (String Key : hp.keySet()) {
      System.out.println(Key);
    }
    return;
  }
}

```
## OMG `ArrayList`
***
```java
import java.util.ArrayList;

public class ArrayList1 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(0, 30);
    for (Integer i : list) {
      System.out.println(i);
    }
    // list.remove(1);
    // list.remove(Integer.valueOf(30));
    // list.remove(10);
    if (list.contains(10)) {

      System.out.println(list.toString());
    }
    return;
  }
}

```
### Binary Search
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
 * binarySearch1
 */

public class binarySearch1 {
  public static void main(String[] args) {
    ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 2, 1, 9, 8, 7, 2));
    Collections.sort(num);
    int target = 7;
    System.out.println("The target 7 found at index: " + Collections.binarySearch(num, target));
    System.out.println("Max : " + Collections.min(num));
    System.out.println("Min : " + Collections.max(num));
    Collections.sort(num, Comparator.reverseOrder());
    return;
  }
}


```
## Hot `Set`
***
### HashSet
```java
import java.util.HashSet;

public class hashSet {
  public static void main(String[] args) {
    HashSet<Integer> s = new HashSet<>();
    s.add(4);
    s.add(1);
    s.add(1);
    s.add(2);
    s.add(3);
    System.out.println(s);
    System.out.println(s.contains(3));
    s.clear();
    System.out.println(s);
    return;
  }
}

```
### TreeSet
```java
import java.util.TreeSet;

/**
 * treeset
 */
public class treeset {
  public static void main(String[] args) {
    TreeSet<Integer> set = new TreeSet<>();
    set.add(3);
    set.add(1);
    set.add(5);
    set.add(9);
    System.out.println(set);
    return;
  }
}

```
### Linked Hash Set
```java
import java.util.LinkedHashSet;
import java.util.*;

public class linkedhashset {
  public static void main(String[] args) {
    LinkedHashSet<Integer> s = new LinkedHashSet<>();
    s.add(4);
    s.add(2);
    s.add(1);
    System.out.println(s);
    Iterator<Integer> it = s.Iterator();
    return;
  }
}

```
## It's me bro :) `Stack`
***
```java
import java.util.Stack;

public class stack1 {
  public static void main(String[] args) {
    Stack<String> animals = new Stack<>();
    animals.push("Lion");
    animals.push("Dog");
    animals.push("Cat");
    animals.push("Rat");
    animals.push("Bat");
    System.out.println(animals);
    System.out.println(animals.peek()); // LIFO
    animals.pop();
    System.out.println(animals.toString());
    return;
  }
}

```
## I'd like to be dynamic! `Heap`
***
### Queue
```java
import java.util.LinkedList;

public class queue1 {
  public static void main(String[] args) {
    LinkedList<Integer> queue = new LinkedList<>();
    queue.offer(12); // I can use add() here.
    queue.offer(24); // But It's dangerous
    queue.offer(36); // As it can throw exception
    System.out.println(queue);
    System.out.println(queue.peek()); // I can use element() here. But It's prohavited
    System.out.println(queue.element());
    queue.poll(); // we can definitely use the remove() but It throws exception
    System.out.println(queue);
  }
}

```
### Dequeue
```java
import java.util.ArrayDeque;

/**
 * Deque
 */
public class Deque {
  public static void main(String[] args) {
    ArrayDeque<Integer> adq = new ArrayDeque<>();
    adq.offer(1);
    adq.offer(2);
    adq.offer(3);
    adq.offer(5);
    System.out.println(adq.peekFirst());
    System.out.println(adq.peekLast());
    System.out.println(adq);
    adq.poll();
    System.out.println(adq);
    adq.pollFirst();
    System.out.println(adq);
    adq.pollLast();
    System.out.println(adq);
    return;
  }
}

```
### Priority Queue
```java
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.offer(40);
    pq.offer(30);
    pq.offer(10);
    pq.offer(20);
    // PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
    // pq2 = pq;
    System.out.println(pq);
    System.out.println(pq2);
    System.out.println(pq.peek());
    System.out.println(pq.peek());
  }
}

```

#### Thanks for reading! 🤠