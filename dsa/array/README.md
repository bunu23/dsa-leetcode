# What is an Array?
- An array is a linear data structure where each elements are stored in contiguous memory location.
- Each value is stored at a specific **index**, starting from `0`.

**Description:**

- <u>**Structure**:</u> Linear, fixed-size, elements stored in contiguous memory.
- <u>**Access**:</u> Directly by index.
- <u>**Traversal**:</u> Sequential from start to end.
- <u>**Use Cases**:</u> Suitable for simple, ordered collections where direct access is needed.

### Example

 ```
| Index | 0   | 1   | 2   | 3   | 4   |
|-------|-----|-----|-----|-----|-----|
| Value | 10  | 20  | 30  | 40  | 50  |

```

```java
int[] numbers = {10, 20, 30, 40, 50};
System.out.println(numbers[0]); // Output: 10
```

---

# Types of Array

## 1. Single Dimensional Array (1D Array)

A **1D Array** is the simplest form of an array. It is a linear structure that holds elements in a single row or column.

### 🔹 Key Concepts

#### 	📝 Declaration

Declaring an array means telling the program that a variable will store multiple values.

We can declare arrays in several valid ways:

```
dataType arrayName[];
dataType[] arrayName[]; 
```

**Example**

```java
int[] a;     // Preferred
int []a;
int a[];     // Also valid
```

✅ Multiple Declarations:

```java
int[] a, b;     // both a and b are arrays
int a[], b;     // a is an array, b is a normal variable
int[] a; int[] b; // recommended style
```

#### 🛠️ Creation
Creating an array means allocating memory using the `new` keyword.
We use the `new` keyword to create an array and define its size.

```java
a = new int[5];         // Creates array of size 5
int[] a = new int[5];   // Declaration + Creation
```

📌 Cases:

```java
int[] a = new int[0];    // Compiles and runs
int[] a = new int[-3];   // Compiles but throws runtime error:
                         // java.lang.NegativeArraySizeException
```

#### ⚙️ Initialization

Initialization means assigning actual values to the array elements.

Assign values using index positions:

```java
int[] a = new int[3];
a[0] = 10;
a[1] = 20;
a[2] = 30;
```

⚠️ Invalid Index:

```java
a[3] = 100;  // ❌ ArrayIndexOutOfBoundsException
a[-1] = 50;  // ❌ ArrayIndexOutOfBoundsException
```

✅ One-line Initialization:

```java
int[] a = {10, 20, 30};  // Declare, create, and initialize
```


#### 🔁 Retrieving Values

Use a loop to read array elements:

```java
for (int i = 0; i < a.length; i++) {
    System.out.println(a[i]);
}
```

Or with enhanced for-loop:

```java
for (int value : a) {
    System.out.println(value);
}
```


#### 📌 Note

* Arrays are **objects** in Java.
  - This means: Arrays are not primitive types — they are actual **objects**.
  - Even if you create an array like `int[] a = new int[5];`, the array itself is an object in memory.
  - They are **dynamically created** (usually with a constructor or built-in syntax). Meaning arrays are created at runtime, not hardcoded in memory at compile time.You can use variables to determine      size or even change the content dynamically.
  - Arrays **inherit properties and methods** from base object classes, depending on the language. This means that arrays are not just raw data structures—they are instances of object classes.              Therefore, they come with built-in methods or properties, depending on the language.
* Arrays are stored in **Heap Area**
* Default values:
  * `int[]` → 0
  * `boolean[]` → false
  * `String[]` → null
  * `float[]` -> 0.0


---
