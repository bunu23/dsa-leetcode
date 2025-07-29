## 🔗 Quick Links

- [📖 What is Linked List?](#linked-list)
- [🔹 Singly Linked List](#singly-linked-list)

---

# Linked List
A linked list is a linear data structure consisting of a sequence of nodes. Each node contains data and one or more pointers to the next (and possibly previous) nodes in the sequence.

## [Singly Linked List](basic)
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

---


  
