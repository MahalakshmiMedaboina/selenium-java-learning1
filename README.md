# Selenium Intro (Java)

A tiny Java project that demonstrates launching a browser with Selenium WebDriver and performing a few basic interactions (open URL, print title, close browser).

This repository contains a simple example class: `seleBasics.SelIntro` which creates a WebDriver instance, navigates to a URL, prints the page title and current URL, then closes the browser.

---

## Quick checklist (what you can do right now)
- Build the project with Maven: `mvn compile` (runs on Windows `cmd.exe`).
- Run the example from an IDE (recommended for beginners): run the `SelIntro` Java application.
- Run from the command line with Maven: `mvn -Dexec.mainClass=seleBasics.SelIntro exec:java` (Maven will download the exec plugin automatically).

---

## Requirements
- Java 17+ (this project was developed with modern JDKs; Java 21 is known to work).
- Maven (optional but recommended to manage dependencies and run from the command line).
- A Chromium-based browser (Chrome or Edge) or Firefox installed.

Note: Selenium 4 includes Selenium Manager which usually downloads the correct browser driver binary for you at runtime, so you do not normally need to manually download chromedriver/geckodriver/msedgedriver.

---

## Build
From the project root (Windows cmd):

    mvn compile

This will download dependencies and compile the classes into `target/classes`.

---

## Run
Recommended: run from your IDE (Eclipse/IntelliJ/VS Code) by running the `seleBasics.SelIntro` main class.

From the command line (Maven exec plugin):

    mvn -Dexec.mainClass=seleBasics.SelIntro exec:java

This runs the program with Maven managing the classpath (downloads the exec plugin if needed).

If you prefer to run the compiled class directly with `java`, make sure all dependency JARs are on the classpath. A convenient way is to use the Maven exec approach above.

---

## Which browser does the example use?
Open `src/seleBasics/SelIntro.java`.
- The current example instantiates an EdgeDriver (and sets `webdriver.edge.driver` to a local path). If you want Selenium Manager to manage the driver automatically, remove the explicit System.setProperty line and create the driver instance directly.

Examples:
- Use Selenium Manager (recommended):

    WebDriver driver = new ChromeDriver();
    // or
    WebDriver driver = new EdgeDriver();

- Manually point to a driver binary (Windows example):

    System.setProperty("webdriver.edge.driver", "C:\\path\\to\\msedgedriver.exe");
    WebDriver driver = new EdgeDriver();

Replace the path with the actual location of `msedgedriver.exe`, `chromedriver.exe`, or `geckodriver.exe` if you manage drivers yourself.

---

## Troubleshooting
- Browser does not start / driver fails to launch:
  - If you set a driver system property, verify the path and that the binary is for your browser/version.
  - Remove the explicit System.setProperty line and rely on Selenium Manager (recommended) so Selenium can fetch the correct driver automatically.
  - Make sure the browser (Chrome/Edge/Firefox) is installed and up to date.
- Class not found when running with `java` directly: ensure dependencies are on the classpath. Use the Maven exec approach to avoid classpath issues.
- Permission issues on driver binary: on Windows, ensure the .exe is not blocked by antivirus and is executable.

---

## Project layout (relevant files)
- `src/seleBasics/SelIntro.java` — main example that opens a browser and prints title/URL.
- `pom.xml` — Maven project file that declares Selenium and test dependencies.
- `target/` — compiled classes and build artifacts (created after `mvn compile`).

---

## Next steps / improvements
- Add an `exec-maven-plugin` config to `pom.xml` for a convenient `mvn exec:java` setup.
- Add a small TestNG/JUnit test that runs headless browser checks (useful for CI).
- Convert the example to use WebDriverManager or keep relying on Selenium Manager for simplicity.

If you want, I can: wire up `exec-maven-plugin` in `pom.xml`, add a short example test, or update `SelIntro.java` to use Selenium Manager instead of a hard-coded driver path—tell me which and I will make the change.

---

## Topics covered (structured revision notes with answers & differences)

Below is a compact, interview-friendly layout of the topics covered in this repo. Each entry contains: a short definition, key points/subtypes, a one-line sample interview question, a concise answer, and a short 'main differences' note where relevant.

### **1) Object-Oriented Programming (OOP)**

- **Inheritance**

  - Definition: A mechanism where a class (child/subclass) derives from another class (parent/superclass) to reuse and extend behavior.

  - Key points: `extends` keyword, single class inheritance in Java, `super` to access parent members.

  - Quick question: What is the difference between class inheritance and interface implementation?

  - Answer: Inheritance (`extends`) shares implementation and state from one parent class; implementing an interface (`implements`) means agreeing to provide method implementations but does not share state.

  - Main differences: Inheritance reuses code/state; interfaces define a contract and allow multiple types.

- **Abstraction (abstract classes & interfaces)**

  - Definition: Abstraction hides implementation details and exposes only relevant operations. In Java, abstraction can be provided either via **abstract classes** or **interfaces**.

  - **Abstract classes**

    - What: A class declared with the `abstract` keyword that can contain abstract methods (no body) and concrete methods/fields.

    - Access: An abstract class may be declared `public` or left package-private (no modifier). Declare it `public` if it must be visible across packages.

    - Use when: You want to share common implementation or state (fields/constructors) and force subclasses to implement specific abstract methods.

    - Quick question: Should an abstract class always be `public`?

    - Answer: No — it can be package-private. Make it `public` only when you need it to be accessed from other packages.

    - Tiny example: an abstract base with one abstract method and one concrete helper method (conceptual).

  - **Interfaces**

    - What: A contract that specifies method signatures (and since Java 8, also default and static methods with bodies). Historically interfaces contained only abstract methods (no body).

    - Method bodies: By default, interface methods are abstract (no body) and implicitly `public` (older Java rules). Since Java 8 interfaces may include `default` and `static` methods that have implementations; more recent Java versions also allow `private` methods inside interfaces for reuse.

    - Access: Like classes, an interface may be declared `public` or package-private. If you want the interface to be usable from other packages, declare it `public`.

    - Use when: You need to define a capability/contract that multiple unrelated classes can implement (allows multiple inheritance of type).

    - Quick question: Must interface methods have no body and be declared `public`?

    - Answer: Historically yes (abstract, implicitly public), but modern interfaces can include `default`/`static` methods with bodies; methods without modifiers are implicitly `public` for compatibility. The interface itself need not be `public` unless required across packages.

    - Tiny example: an interface with an abstract method (no body) and an optional `default` method (small example concept).

  - Main differences (abstract class vs interface)

    - Abstract class: can have fields, constructors, and concrete methods; a class extends only one abstract class.

    - Interface: primarily method signatures (contract); allows multiple interface implementations; since Java 8 can have default/static implementations.

    - Visibility: both can be `public` or package-private; choose `public` when cross-package use is required.

- **Interfaces**

  - Definition: A contract that classes implement; can contain abstract methods, default and static methods (since Java 8+), and private methods (since later versions).

  - Key points: `implements` keyword, multiple interfaces allowed.

  - Quick question: Can a class implement multiple interfaces? How does that differ from class inheritance?

  - Answer: Yes, a class can implement multiple interfaces, allowing multiple behaviors without the single-parent restriction of classes.

  - Main differences: Use interfaces to compose capabilities; inheritance is for an "is-a" relationship with shared implementation.

- **Polymorphism**

  - Definition: The ability to treat objects of different types through a common interface/type reference.

  - Two main forms in Java:

    - **Compile-time polymorphism (Method Overloading)**

      - Definition: Same method name with different parameter lists in the same class.

      - Quick question: How does the compiler pick which overloaded method to call?

      - Answer: The compiler picks the best match based on argument types at compile time (method resolution).

      - Main differences: Overloading is compile-time; signatures differ by parameter list.

    - **Runtime polymorphism (Method Overriding)**

      - Definition: Subclass provides a specific implementation for a method declared in the parent class.

      - Quick question: How does Java decide which overridden method to call at runtime?

      - Answer: Java uses the actual object's class at runtime (dynamic dispatch) to pick the overridden method.

      - Main differences: Overriding uses the same signature and is resolved at runtime.

- **Encapsulation**

  - Definition: Hiding internal state and exposing behavior via accessors (getters/setters) and access modifiers.

  - Key points: `private` fields, `public`/`protected` accessors, preserve invariants.

  - Quick question: Why is encapsulation important for maintainability?

  - Answer: Encapsulation protects internal state and allows implementation to change without affecting users of the class.

  - Tiny note: Immutable objects (no setters) are a strong encapsulation pattern.


### **2) Core Java essentials**

- **Variables & Data Types**

  - Definition: Named storage with a type; primitives (int, boolean, double, char) vs reference types (String, objects).

  - Quick question: What is the default value of an uninitialized instance variable of type `int`?

  - Answer: `0` for `int` instance variables.

- **Methods (Function basics)**

  - Definition: Reusable blocks of code; can accept parameters and return values.

  - Quick question: What does it mean for a method to be `static`?

  - Answer: `static` methods belong to the class, not instances; call them via `ClassName.method()` without creating an object.

- **Strings & String Pooling**

  - Definition: `String` is immutable; string literals are interned in the string pool, while `new String()` always creates a new object on the heap.

  - Quick question: What is the difference between `String s = "x";` and `String s = new String("x");`? When would `==` be true vs `equals()`?

  - Answer: `"x"` uses the pooled literal (shared reference); `new String("x")` makes a new object. `==` checks reference identity (true only for same object or pooled literal), while `equals()` checks content and returns true if the text matches.

  - Main differences: Use literals for shared references; use `equals()` for content comparison. `intern()` can be used to get the pooled reference.

  - Creation approaches & intern/example (kept brief):

    - Literal: `String s1 = "hello";` (pooled)

    - new: `String s2 = new String("hello");` (heap)

    - `s2.intern()` returns pooled reference.

- **Arrays & ArrayList (Collections basics)**

  - Definition: Arrays are fixed-size containers; `ArrayList` is a resizable list from `java.util`.

  - Quick question: How do you convert an array to an `ArrayList` and vice versa?

  - Answer: Convert array -> ArrayList: `Arrays.asList(array)` (wraps fixed-size list) or `new ArrayList<>(Arrays.asList(array))` for a resizable list. ArrayList -> array: `list.toArray(new Type[0])`.

  - Main differences:

    - Size: array uses `array.length` (field), ArrayList uses `list.size()` (method).

    - Resizing: array fixed; ArrayList resizable.

    - Primitives: arrays can hold primitives directly; ArrayList holds objects (use wrappers).

- **Loops (for, while, do-while, nested)**

  - Definition: Control structures for repetition; choose based on known iteration count vs condition-driven loops.

  - Quick question: When would you prefer a `for-each` loop over a traditional indexed `for`?

  - Answer: Prefer `for-each` when you only need elements (no index) and don't need to modify the collection's structure during iteration.

  - Main differences: `for-each` is simpler and less error-prone; indexed `for` gives access to indices and allows skipping or modifying by index.

- **Exception basics**

  - Definition: Mechanism for handling runtime problems using `try`/`catch`/`finally` and `throws` declarations.

  - Quick question: Checked vs unchecked exceptions—what's the difference?

  - Answer: Checked exceptions must be declared or handled at compile time (checked by compiler), unchecked (RuntimeException and subclasses) do not need to be declared or caught.

- **Access modifiers & `static`**

  - Definition: `public`, `protected`, `private`, package-private control visibility; `static` ties members to the class rather than instances.

  - Quick question: What is a static initializer block and when is it executed?

  - Answer: A static initializer (`static { ... }`) runs once when the class is first loaded by the JVM.


### **3) Selenium & browser automation**

- **Selenium WebDriver basics**

  - Definition: API for automating browsers; create a `WebDriver` instance to control a browser and call methods like `get()`, `getTitle()`, `getCurrentUrl()`, `close()`/`quit()`.

  - Quick question: What is the difference between `driver.close()` and `driver.quit()`?

  - Answer: `driver.close()` closes the current browser window/tab; `driver.quit()` closes all browser windows and ends the WebDriver session (recommended at test end).

  - Main differences: `quit()` cleans up the session and driver processes; `close()` may leave the session running if other windows remain.

- **Browser drivers & Selenium Manager**

  - Definition: Browser-specific executables (chromedriver, geckodriver, msedgedriver) that WebDriver uses to control browsers. Selenium Manager can auto-download the correct driver for you.

  - Quick question: How does Selenium Manager simplify setup in modern Selenium versions?

  - Answer: Selenium Manager automatically locates and downloads the correct driver binary for the installed browser/version, removing manual driver management in most cases.

- **Basic automation flow**

  - Definition: Start driver -> navigate -> locate elements -> interact -> assert/check -> cleanup (close/quit).

  - Quick question: What would you assert after navigating to a login page to confirm it loaded correctly?

  - Answer: Assert page title, presence/visibility of username/password fields, or a unique element like a login button.

- **Quick note on running tests**

  - Tip: Use Maven (`mvn compile` / `mvn -Dexec.mainClass=seleBasics.SelIntro exec:java`) or run from your IDE for easier debugging.


### **4) Testing & best practices (short)**

- **Test frameworks**

  - Definition: TestNG/JUnit provide structure for writing and running tests, assertions, and test lifecycle management.

  - Quick question: When should you use `@BeforeClass` vs `@BeforeMethod` in TestNG?

  - Answer: `@BeforeClass` runs once before any tests in the class (use for expensive setup); `@BeforeMethod` runs before each test method (use for per-test setup).

- **Headless runs and CI**

  - Definition: Run browsers in headless mode for CI environments to avoid opening a UI.

  - Quick question: What are trade-offs of headless vs headed runs?

  - Answer: Headless runs are faster and CI-friendly but may behave slightly differently (rendering/visual differences); headed is closest to real user behavior and preferable for debugging.

- **Small checklist of interview-ready items**

  - Be able to explain OOP concepts with a short example (2–3 lines of code) and give a one-line answer to the sample question.

  - Memorize key differences (e.g., `array.length` vs `ArrayList.size()`, string literal vs `new String()`, `close()` vs `quit()`).

  - Describe how Selenium interacts with the browser (driver binary + WebDriver API) and the typical automation flow.

---
