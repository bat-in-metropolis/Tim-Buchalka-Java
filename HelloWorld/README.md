# HelloWorld

My first ever Java program — understanding the building blocks of Java syntax.

## 🛠 Environment

| Tool | Details |
|------|---------|
| **IDE** | IntelliJ IDEA Community Edition |
| **Build System** | IntelliJ |
| **JDK** | Azul Zulu 17 (17.0.13) — aarch64 |

---

## 📝 What I Learned Here

### The Main Method
```java
public static void main(String[] args)
```
| Part | Meaning |
|------|---------|
| `public` | Access modifier — accessible from anywhere. JVM needs to call this, so it must be public. |
| `static` | Belongs to the class itself, no object creation needed to call it. |
| `void` | Return type — this method returns nothing. |
| `main` | Special method name — Java's entry point to start the program. |
| `String[] args` | Command-line arguments passed as an array of Strings. |

### Access Modifiers
| Modifier | Class | Package | Subclass | Everywhere |
|----------|:-----:|:-------:|:--------:|:----------:|
| `public` | ✅ | ✅ | ✅ | ✅ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| *default* (no keyword) | ✅ | ✅ | ❌ | ❌ |
| `private` | ✅ | ❌ | ❌ | ❌ |

### `class`
- A blueprint/container that groups related code together.
- In Java, **everything** lives inside a class.
- **Filename must match the public class name** — `FirstClass.java` for `public class FirstClass`.

### `System.out.print()`
Three things chained together:
- **`System`** — A built-in class from `java.lang` (auto-imported).
- **`out`** — A static `PrintStream` object inside System (represents the console).
- **`print()`** — Method that writes text to the console.

| Method | What it does |
|--------|-------------|
| `System.out.print()` | Prints text, cursor stays on same line |
| `System.out.println()` | Prints text + moves to next line |
| `System.out.printf()` | Formatted printing (like C's printf) |

### Comments
| Syntax | Type |
|--------|------|
| `// text` | Single-line comment |
| `/* text */` | Multi-line comment |
| `/** text */` | Javadoc comment (used for documentation) |

---

## 💡 Notes

- **"Process finished with exit code 0"** — This is an IntelliJ message, not Java syntax. Exit code `0` = program ran successfully. Non-zero = something went wrong.
- **Java is case-sensitive** — `String` and `string` are different.
- **Every statement ends with a semicolon** `;`
- **Curly braces `{ }` define code blocks** — for classes, methods, loops, etc.

---

## 📚 Course

Following: **Tim Buchalka's Java Programming Masterclass**