Q1.. Create a superclass called Animal with a method makeSound() that prints the sound made by the animal. Implement subclasses Dog, Cat, and Cow that inherit from the Animal class. 
  Implement the makeSound() method in each subclass to print the sound made by a dog, cat, and cow, respectively.

  class Animal {
    public void makeSound() {
        // Placeholder method that will be overridden in the subclasses
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog: Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat: Meow!");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cow: Moo!");
    }
}

// Example usage:
Animal dog = new Dog();
dog.makeSound();  // Output: Dog: Woof!

Animal cat = new Cat();
cat.makeSound();  // Output: Cat: Meow!

Animal cow = new Cow();
cow.makeSound();  // Output: Cow: Moo!

###############################################################################################################################################################################
  Q2.. Create a superclass called Shape with an abstract method calculateArea() that returns the area of the shape. 
  Implement subclasses Rectangle, Circle, and Triangle that inherit from the Shape class.
  Implement the calculateArea() method in each subclass to calculate and return the area of a rectangle, circle, and triangle, respectively.
  Then, create a class called ShapeCalculator with a method printArea(Shape shape) that accepts an object of type Shape and prints its area.
  Demonstrate polymorphism by passing instances of different subclasses to the printArea() method.

    abstract class Shape {
    public abstract double calculateArea();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class ShapeCalculator {
    public void printArea(Shape shape) {
        double area = shape.calculateArea();
        System.out.println("Area: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        Shape rectangle = new Rectangle(5, 3);
        calculator.printArea(rectangle);  // Output: Area: 15.0

        Shape circle = new Circle(2.5);
        calculator.printArea(circle);  // Output: Area: 19.634954084936208

        Shape triangle = new Triangle(4, 6);
        calculator.printArea(triangle);  // Output: Area: 12.0
    }
}

#############################################################################################################################################################################
  Q3.Create a class called Person with private properties like name, age, and address. Provide public getter and setter methods for these properties.
  Write a program that creates an instance of the Person class, sets values for its properties using the setter methods, and displays the values using the getter methods.

    class Person {
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("John Doe");
        person.setAge(30);
        person.setAddress("123 Main Street");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}

###############################################################################################################################################################################
  Q4 Create an interface called Drawable with a method draw() that has no implementation. Implement this interface in classes Circle and Rectangle.
  Write a program that creates objects of Circle and Rectangle and calls the draw() method on each object.

    interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        circle.draw();  // Output: Drawing a Circle

        Drawable rectangle = new Rectangle();
        rectangle.draw();  // Output: Drawing a Rectangle
    }
}
