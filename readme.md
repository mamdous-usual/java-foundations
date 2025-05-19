# Java

## Basic Syntax

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## Data Types

```java
int myNum = 5;
double myDouble = 5.99;
char myLetter = 'D';
boolean isJavaFun = true;
String myText = "Hello";
```

## Variables & Constants

```java
int x = 10;
final int CONSTANT = 100;
```

## Operators

| Operator | Description       |
|----------|-------------------|
| + - * / % | Arithmetic        |
| == != > < >= <= | Comparison |
|  && ||| !!  | Logical           |

## Control Flow

### Conditional Statements

```java
if (a > b) {
    // code
} else if (a == b) {
    // code
} else {
    // code
}
```

### Switch Case

```java
switch (day) {
    case 1:
        // code
        break;
    default:
        // code
}
```

### Loops

```java
for (int i = 0; i < 5; i++) { }
while (i < 5) { i++; }
do { i++; } while (i < 5);
```

## Object-Oriented Programming

### Classes and Objects

```java
class Car {
    String color = "red";
}

Car myCar = new Car();
```

### Constructors

```java
class Car {
    String model;

    Car() {
        this.model = "Default";
    }

    Car(String model) {
        this.model = model;
    }
}
```

### Getters and Setters

```java
class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

### Inheritance

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}
```

### Polymorphism

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

Animal myDog = new Dog();
myDog.sound();  // Outputs: Bark
```

### Abstraction

```java
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}
```

### Interface

```java
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}
```

## Exception Handling

```java
try {
    // code that may throw exception
} catch (Exception e) {
    e.printStackTrace();
} finally {
    // always executed
}
```

## Common Classes

### Strings

```java
String s = "Hello";
s.length(); s.charAt(0); s.equals("test"); s.substring(0, 2);
```

### Arrays

```java
int[] arr = {1, 2, 3};
System.out.println(arr.length);
```

### ArrayList

```java
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.get(0);
```

## Input/Output

### Scanner

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
String s = sc.nextLine();
```

### File I/O

```java
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

File myFile = new File("filename.txt");
Scanner reader = new Scanner(myFile);

FileWriter writer = new FileWriter("output.txt");
writer.write("Hello");
writer.close();
```

## Points to ponder

- `this` refers to the current object.
- `super` refers to the parent class.
- Use `final` to declare constants.
- `static` means class-level member.