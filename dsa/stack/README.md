
# Stack

A **stack** is a linear data structure that follows a specific order for operations.
It is based on the Last In, First Out (LIFO) principle, meaning that the last element added to the stack is the first one to be removed. It is an ordered list in which insertion and deletion are done in one end i.e top.

### Key Features

1. **LIFO Structure**:

   - The last element pushed onto the stack is the first one to be popped off.
   - Visualizing it as a stack of plates, you can only add or remove the top plate.

2. **Dynamic Size**:

   - Stacks can grow and shrink as needed, making them flexible in terms of memory usage.

3. **Access**:
   - Elements can only be accessed from the top of the stack.

### Basic Operations

1. **Push**:

   - Adds an element to the top of the stack.
   - Example:
     ```java
     stack.push(10);
     stack.push(20);
     ```

2. **Pop**:

   - Removes the top element from the stack and returns it.
   - Example:
     ```java
     int topElement = stack.pop(); // returns 20
     ```

3. **Peek (or Top)**:

   - Returns the top element without removing it.
   - Example:
     ```java
     int topElement = stack.peek(); // returns 10
     ```
     
### Diagram

```plaintext
      +---+
      | 3 |  <-- Top (Last In)
      +---+
      | 2 |
      +---+
      | 1 |
      +---+
      | 1 |  <-- Bottom (First In)
      +---+
```

- **Top**: The top of the stack (in this case, the number `3`) is the last element added and will be the first one to be removed when a pop operation is performed.
- **Elements**: The stack contains elements (`1`,`1`, `2`, `3`) in the order they were added, with `1` being the first element added and at the bottom of the stack.

☕ [Implementation of Stack using Linked List and Array](impl)

