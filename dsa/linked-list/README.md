## 🔗 Quick Links

- [📖 What is Linked List?](#linked-list)
- [🔹 Singly Linked List](#singly-linked-list)
- [🔹 Doubly Linked List](#doubly-linked-list)


---

# Linked List
A linked list is a linear data structure consisting of a sequence of nodes. Each node contains data and one or more pointers to the next (and possibly previous) nodes in the sequence.

## Singly Linked List
A singly linked list is a linear data structure used for storing a collection of nodes, where each node contains:
1. **Data** (the actual value stored).
2. **Reference to the next node** in the list.

### How Does a Singly Linked List Work?

- Each node points to the next node in the sequence. 
- The first node is referred to as the **head node** and is responsible for holding the entire list. When we initialize the singly linked list usually head points to null because at the initialization of the singly linked list there are no elements in to the list.
- The last node points to `null`, indicating the end of the list. In singly linked list whenenver we reach the last node, we only have the data but no next pointer because the next pointer points to `null` which means the singly linked list has ended.

### Properties of Singly Linked List:

1. Sequential Nodes: The nodes form a chain as each node points to the next.
2. Head Node: The head node holds the entire list.
3. Last Node: The last node points to null.

### Example of a singly linked list with 4 nodes:


```markdown
head
  ↓
+------+--------+    +------+--------+    +------+--------+    +------+--------+    null
| 5    |        | →  | 15   |        | →  | 25   |        | →  | 35   |        | →
+------+--------+    +------+--------+    +------+--------+    +------+--------+
```

[Implementation of Singly Linked List](SinglyLinkedList.java)
[Demo Code]()

---

## Doubly Linked List

### Introduction

A **Doubly Linked List** is a two way linked list where each node contains three components:

1. **Data**: The value or information the node holds.
2. **Next Pointer**: A reference (pointer) to the next node in the list.
3. **Previous Pointer**: A reference (pointer) to the previous node in the list.
   This structure allows us to traverse the list in **both forward and backward directions**.


```
null <- [1] <-> [5] <-> [10] <-> [15] -> null
         ↑                         ↑
       Head                      Tail

```

Each `[value]` is a node.

* `<->` means a two-way connection (previous and next).
* The `Head` points to the **first node**.
* The `Tail` points to the **last node**.
* `null` represents the ends of the list in both directions.

### Key Differences from Singly Linked List:

- **Singly Linked List** has only a **next pointer**, making traversal possible only in the forward direction.
- **Doubly Linked List** has both **next** and **previous pointers**, making traversal possible in both **forward** and **backward** directions.
- Since singly linked list move in forward direction so in order to break any chain or any node in between singly linked list we usually need a pointer to its previous node to delete the node after it but in doubly linked list as we have two pointers to traverse in forward and backward, therefore we don’t need any pointer to its previous node.

[Implementation of Doubly Linked List]()
[Demo Code]()

---



  
