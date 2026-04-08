# Java & Selenium Learning Repository

A comprehensive Java learning project that covers core Java concepts, Object-Oriented Programming (OOP), and Selenium WebDriver automation fundamentals. This repository demonstrates launching a browser with Selenium, performing basic interactions, and exploring fundamental Java concepts through practical examples.

---

## 📋 Quick Start

### **Build the project**
```
mvn compile
```
This downloads dependencies and compiles classes into `target/classes`.

### **Run the Selenium example**
From IDE: Run `seleBasics.SelIntro` main class directly.

From command line:
```
mvn -Dexec.mainClass=seleBasics.SelIntro exec:java
```

### **Run any other Java class**
```
mvn -Dexec.mainClass=<package.ClassName> exec:java
```
Example: `mvn -Dexec.mainClass=coreJavaBrushUp1.VariableDatatypes exec:java`

---

## 📦 Requirements

- **Java 17+** (Java 21 recommended for best compatibility)
- **Maven** (optional but recommended for building and running)
- **Browser**: Chrome, Edge, or Firefox (for Selenium examples)

**Note**: Selenium 4 includes Selenium Manager which auto-downloads the correct driver binary, so manual driver setup is usually not needed.

---

## 📁 Project Structure

```
src/
├── seleBasics/              → Selenium WebDriver basics
│   └── SelIntro.java
├── coreJavaBrushUp1/        → Core Java fundamentals
│   ├── VariableDatatypes.java
│   ├── ArrayConcept.java
│   ├── MethodDemo.java
│   ├── MethodDemo2.java
│   ├── ForLoopOnArrays.java
│   ├── ForLoopArrayList.java
│   ├── FoorLoopArrayConditional.java
│   └── literalStringNewString.java
├── coreJava/                → Advanced core Java
│   ├── ConstructorDemo.java
│   ├── DateDemo.java
│   └── CalendarDemo.java
├── arraysConcept/           → Arrays and multidimensional arrays
│   ├── ArraysDemo1.java
│   ├── ArraysDemo2.java
│   ├── MultiDimentionalArray.java
│   └── MiniNumMultiD.java
├── loops/                   → Loop structures
│   ├── ForLoopArrays.java
│   ├── WhileDemo.java
│   ├── DoWhileDemo.java
│   └── NestedForLoop.java
├── InheritanceConcept/      → Class inheritance
│   ├── ParentClassDemo.java
│   └── ChildClassDemo.java
├── abstractConcept/         → Abstract classes and methods
│   ├── ParentAirCraft.java
│   └── ChildEmirates.java
├── polymorphismConcept/     → Method overloading & overriding
│   ├── MethodOverloading.java
│   ├── OverridingParentClass.java
│   └── OverridingChildClass.java
└── InterfaceConcept/        → Interfaces and implementation
    ├── continentalTraffic.java
    ├── centralTraffic.java
    └── IndianTraffic.java

pom.xml                       → Maven dependencies
```

---

## 🎓 Topics Covered

This section provides a structured breakdown of all Java concepts covered in this repository, organized by category with clear explanations and real-world examples.

---

## 🏛️ **CORE JAVA FUNDAMENTALS**

---

### **1️⃣ Variables & Data Types**

**Definition**: Named storage locations with a specific type. Java has two categories: primitive types and reference types.

**Primitive Types**: `int`, `double`, `float`, `boolean`, `char`, `byte`, `short`, `long`

**Reference Types**: Objects, Strings, Arrays, Collections

| Concept | Example | Notes |
|---------|---------|-------|
| Default int value | `int x;` → `0` | Instance variables default to `0` |
| String reference | `String s = "hello";` | Reference to object in memory |
| Type conversion | `int i = (int) 10.5;` | Explicit casting required for precision loss |

**Related files**: `src/coreJavaBrushUp1/VariableDatatypes.java`

---

### **2️⃣ Methods**

**Definition**: Reusable blocks of code that perform specific tasks, can accept parameters, and return values.

**Key Points**:
- Methods belong to classes
- `static` methods can be called on the class itself without creating an instance
- Instance methods require an object instance
- Return type can be `void` (no return) or any data type

**Interview Q**: What does `static` mean in a method?

**Answer**: A `static` method belongs to the class, not to instances. You call it via `ClassName.methodName()` without needing to create an object.

**Related files**: `src/coreJavaBrushUp1/MethodDemo.java`, `src/coreJavaBrushUp1/MethodDemo2.java`

---

### **3️⃣ Strings & String Pooling**

**Definition**: `String` is an immutable class. String literals are interned in the string pool; `new String()` creates a separate object on the heap.

**Key Differences**:

| Approach | Storage | Reference | Use Case |
|----------|---------|-----------|----------|
| Literal: `"hello"` | String pool | Shared | Frequently used strings |
| new: `new String("hello")` | Heap | New object each time | When you need a distinct object |
| `.equals()` | Compares content | Always use for content check | Comparing two strings |
| `==` | Compares reference | Only true for same object | Usually not recommended for strings |

**Example**:
```java
String s1 = "hello";      // Pooled
String s2 = new String("hello");  // Heap
s1 == s2;     // false (different references)
s1.equals(s2);  // true (same content)
```

**Related files**: `src/coreJavaBrushUp1/literalStringNewString.java`

---

### **4️⃣ Constructors**

**Definition**: Special methods that initialize objects when they are created. They have the same name as the class and no return type.

**Key Points**:
- Called automatically when an object is instantiated with `new`
- Used to initialize fields and set up the object state
- If no constructor is defined, Java provides a default (implicit) constructor
- Can be overloaded (multiple constructors with different parameters)

**When constructor is called**:
```java
ConstructorDemo obj = new ConstructorDemo();  // Constructor runs here
```

**Interview Q**: What happens if you don't define any constructor in your class?

**Answer**: Java automatically provides a default (no-argument) constructor that does nothing but allows object creation.

**Related files**: `src/coreJava/ConstructorDemo.java`

---

### **5️⃣ Arrays**

**Definition**: Fixed-size container that stores multiple values of the same data type.

**Key Characteristics**:
- Fixed size once created (cannot grow or shrink)
- Zero-indexed (first element at index 0)
- Can be single-dimensional or multi-dimensional
- Access via index: `array[0]`, `array[1]`, etc.
- Length accessible via `.length` property

**Array Declaration & Initialization**:
```java
// Method 1: Declare and allocate
int[] arr = new int[5];  // Array of size 5, default values 0
arr[0] = 10;
arr[1] = 20;

// Method 2: Direct initialization
int[] arr2 = {1, 2, 3, 4, 5};

// Accessing
for(int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

**Multi-dimensional Arrays**:
```java
int[][] matrix = new int[3][3];  // 3x3 matrix
matrix[0][0] = 1;
```

**Related files**: 
- `src/arraysConcept/ArraysDemo1.java`
- `src/arraysConcept/ArraysDemo2.java`
- `src/arraysConcept/MultiDimentionalArray.java`
- `src/arraysConcept/MiniNumMultiD.java`

---

### **6️⃣ ArrayList (Collections)**

**Definition**: Resizable list from `java.util` package that dynamically grows or shrinks.

**Array vs ArrayList**:

| Feature | Array | ArrayList |
|---------|-------|-----------|
| Size | Fixed (immutable) | Dynamic (resizable) |
| Size method | `.length` (property) | `.size()` (method) |
| Primitives | Stores directly | Stores wrapper objects |
| Syntax | `int[]` | `ArrayList<Integer>` |

**Basic Operations**:
```java
ArrayList<Integer> list = new ArrayList<>();
list.add(10);       // Add element
list.add(20);
list.remove(0);     // Remove by index
list.size();        // Get size
list.get(0);        // Get element
```

**Related files**: `src/coreJavaBrushUp1/ForLoopArrayList.java`

---

### **7️⃣ Loops**

**Definition**: Control structures for repeating code blocks based on conditions or iteration counts.

**Loop Types**:

| Loop Type | Best For | Example |
|-----------|----------|---------|
| `for` | Known iteration count | `for(int i=0; i<10; i++)` |
| `for-each` | Iterating all elements | `for(int x : array)` |
| `while` | Condition-based | `while(x > 0)` |
| `do-while` | Run at least once | `do { } while(condition)` |
| Nested | Multiple levels | `for() { for() {...} }` |

**Key Points**:
- `for-each` is safer (no index out of bounds) but doesn't give you the index
- `while` checks condition before entering loop
- `do-while` executes at least once regardless of condition
- Nested loops for multi-dimensional traversal

**Related files**:
- `src/loops/WhileDemo.java`
- `src/loops/DoWhileDemo.java`
- `src/loops/NestedForLoop.java`
- `src/coreJavaBrushUp1/ForLoopOnArrays.java`
- `src/coreJavaBrushUp1/FoorLoopArrayConditional.java`

---

### **8️⃣ Date & Time**

**Definition**: Classes for working with dates, times, and calendars.

**Basic Classes**:
- `java.util.Date` - Represents a specific point in time
- `java.util.Calendar` - More flexible date/time operations

**Related files**: 
- `src/coreJava/DateDemo.java`
- `src/coreJava/CalendarDemo.java`

---

## 🔷 **OBJECT-ORIENTED PROGRAMMING (OOP)**

---

### **1️⃣ Inheritance**

**Definition**: A mechanism where a class (child/subclass) derives from another class (parent/superclass) to reuse and extend behavior.

**Key Points**:
- Uses `extends` keyword
- Java supports **single class inheritance** only (a class extends one parent)
- Child class inherits all public and protected members
- `super` keyword accesses parent class members

**Example**:
```java
class Parent { 
    public void method() { } 
}
class Child extends Parent { 
    // Inherits method() from Parent
}
```

**Interview Q**: What is the difference between inheritance and interface implementation?

**Answer**: Inheritance (`extends`) allows a class to inherit implementation and state from one parent class. Interface implementation (`implements`) means implementing method signatures from an interface without inheriting state (multiple interfaces allowed).

**Related files**:
- `src/InheritanceConcept/ParentClassDemo.java`
- `src/InheritanceConcept/ChildClassDemo.java`

---

### **2️⃣ Abstraction**

**Definition**: Hides implementation details and exposes only relevant operations. Two ways in Java: abstract classes and interfaces.

**Abstract Classes**:
- Declared with `abstract` keyword
- Can contain abstract methods (no body) and concrete methods
- Cannot be instantiated
- Can have fields and constructors
- Use when sharing implementation and state

**Example**:
```java
abstract class Animal {
    abstract void sound();      // Must be implemented by child
    public void sleep() { }     // Concrete method
}
```

**Interview Q**: Can an abstract class be `public` or package-private?

**Answer**: Both. Make it `public` only when it needs to be accessed from other packages. By default (no modifier), it's package-private.

**Related files**:
- `src/abstractConcept/ParentAirCraft.java`
- `src/abstractConcept/ChildEmirates.java`

---

### **3️⃣ Interfaces**

**Definition**: A contract specifying method signatures that classes must implement. Since Java 8, interfaces can also have `default` and `static` methods.

**Key Points**:
- Uses `implements` keyword
- **Multiple interface implementation allowed** (unlike single class inheritance)
- Historically contained only abstract methods
- Since Java 8: can include `default` and `static` methods with implementations
- Methods are implicitly `public`

**Example**:
```java
interface Traffic {
    void slowDown();  // Abstract method
    
    default void followRules() { }  // Default implementation (Java 8+)
    
    static void alert() { }  // Static method (Java 8+)
}

class IndianTraffic implements Traffic {
    public void slowDown() { 
        System.out.println("Slowing down...");
    }
}
```

**Interview Q**: Can a class implement multiple interfaces? Why is this useful?

**Answer**: Yes! A class can implement multiple interfaces. This allows composing multiple behaviors without the single-parent restriction of class inheritance. It's like saying "this class behaves as multiple types."

**Related files**:
- `src/InterfaceConcept/continentalTraffic.java`
- `src/InterfaceConcept/centralTraffic.java`
- `src/InterfaceConcept/IndianTraffic.java`

---

### **4️⃣ Polymorphism**

**Definition**: The ability to treat objects of different types through a common interface or reference. Two forms in Java:

**A) Compile-time Polymorphism (Method Overloading)**

Same method name, different parameter lists in the **same class**.

**Example**:
```java
class Calculator {
    public int add(int a, int b) { return a + b; }
    public double add(double a, double b) { return a + b; }  // Different parameters
    public int add(int a, int b, int c) { return a + b + c; }
}
```

**How it works**: Compiler picks the best matching method based on argument types.

**Interview Q**: How does the compiler pick which overloaded method to call?

**Answer**: At compile time, it matches the argument types and count to find the best fitting method signature.

**Related files**: `src/polymorphismConcept/MethodOverloading.java`

---

**B) Runtime Polymorphism (Method Overriding)**

Subclass provides a different implementation for a method declared in the **parent class** or interface.

**Example**:
```java
class Animal {
    public void sound() { System.out.println("Generic sound"); }
}

class Dog extends Animal {
    @Override
    public void sound() { System.out.println("Bark!"); }  // Override with specific behavior
}

Animal dog = new Dog();
dog.sound();  // Prints "Bark!" (uses Dog's version, not Animal's)
```

**How it works**: Uses **dynamic dispatch** - Java checks the actual object's class at runtime, not the reference type.

**Interview Q**: How does Java decide which overridden method to call at runtime?

**Answer**: Java looks at the actual object type (not the reference type) and calls the overridden method from that class.

**Related files**:
- `src/polymorphismConcept/OverridingParentClass.java`
- `src/polymorphismConcept/OverridingChildClass.java`

**Key Difference: Overloading vs Overriding**:

| Aspect | Overloading | Overriding |
|--------|-------------|-----------|
| Scope | Same class | Parent & child classes |
| Parameters | Different | Same |
| Return type | Can differ | Must be same or compatible |
| Time | Compile time | Runtime |
| Keyword | None | `@Override` (optional annotation) |

---

### **5️⃣ Encapsulation**

**Definition**: Hiding internal implementation details and exposing behavior through controlled access (getters/setters) and access modifiers.

**Access Modifiers**:

| Modifier | Class | Package | Subclass | World |
|----------|-------|---------|----------|-------|
| `public` | ✅ | ✅ | ✅ | ✅ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| `default` (none) | ✅ | ✅ | ❌ | ❌ |
| `private` | ✅ | ❌ | ❌ | ❌ |

**Best Practice**:
```java
class Person {
    private int age;        // Hidden field
    
    public void setAge(int a) {
        if(a > 0) age = a;  // Validation
    }
    
    public int getAge() {
        return age;         // Controlled access
    }
}
```

**Interview Q**: Why is encapsulation important?

**Answer**: Encapsulation protects internal state, prevents invalid data, and allows implementation to change without affecting users of the class.

---

### **6️⃣ Static & Instance Members**

**Definition**: `static` members belong to the class itself; instance members belong to objects.

**Comparison**:

| Aspect | Static | Instance |
|--------|--------|----------|
| Created | Once per class | Once per object |
| Access | `ClassName.member` | `objectName.member` |
| Memory | Shared by all objects | Separate for each object |
| Example | `static int count` | `int age` |

**Static Initializer Block**:
```java
static {
    // Runs once when class is first loaded
    System.out.println("Class loaded!");
}
```

---

## 🌐 **SELENIUM & WEB AUTOMATION**

---

### **1️⃣ Selenium WebDriver Basics**

**Definition**: API for automating web browsers. Creates a WebDriver instance to control a browser and interact with web elements.

**Basic Flow**:
```java
// Create driver instance
WebDriver driver = new ChromeDriver();  // or EdgeDriver(), FirefoxDriver()

// Navigate to URL
driver.get("https://example.com");

// Get page information
String title = driver.getTitle();
String url = driver.getCurrentUrl();

// Close/Quit
driver.close();   // Close current window/tab
driver.quit();    // Close all windows and end session
```

**Key Methods**:
- `get(String url)` - Navigate to URL
- `getTitle()` - Get page title
- `getCurrentUrl()` - Get current URL
- `findElement()` - Locate element
- `close()` - Close current window
- `quit()` - Close all windows and end session

**Interview Q**: What is the difference between `driver.close()` and `driver.quit()`?

**Answer**: `close()` closes only the current window/tab; `quit()` closes all windows and ends the entire WebDriver session (recommended at test end).

**Related files**: `src/seleBasics/SelIntro.java`

---

### **2️⃣ Browser Drivers & Selenium Manager**

**Definition**: Browser-specific executables (chromedriver, geckodriver, msedgedriver) that WebDriver uses to control browsers.

**Selenium Manager** (Modern Approach):
- Automatically locates and downloads the correct driver for your installed browser
- No manual driver setup needed
- Recommended for all new projects

**Manual Setup** (Legacy):
```java
System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
WebDriver driver = new ChromeDriver();
```

**Interview Q**: How does Selenium Manager simplify browser automation setup?

**Answer**: It automatically downloads the correct driver version matching your installed browser, eliminating manual driver management and version conflicts.

---

## 📚 **Interview Preparation Checklist**

- [ ] Explain inheritance vs interface implementation with examples
- [ ] Describe method overloading vs method overriding
- [ ] Difference between `array.length` and `ArrayList.size()`
- [ ] Explain string pooling and when to use `==` vs `equals()`
- [ ] How `static` keyword works for classes and methods
- [ ] Selenium WebDriver basic flow and close vs quit
- [ ] Access modifiers and visibility scopes
- [ ] Constructor purpose and how it's called
- [ ] `abstract` classes vs `interface` use cases
- [ ] Polymorphism in action with real examples

---
## 📚 **Access Modifiers**
- Default: can be accessed anywhere inside that package only.
- public : can be accessed anywhere
- Private : If a variable or method is marked as private, it can be accessed only inside the same class.
- Protected: accessed in same package + child class in other package

---

**Last updated**: April 2026  
**Repository Purpose**: Learning Java fundamentals, OOP concepts, and Selenium automation  
**Target Level**: Beginners to intermediate Java developers
