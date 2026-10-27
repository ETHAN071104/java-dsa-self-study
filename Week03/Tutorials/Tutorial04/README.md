# Week 03 · Tutorial 04

## Graphs & breadth-first search

**Read first:** [requirement.md](requirement.md)

---

### 1. Write the declarations and statements

Use `List<List<Integer>> adjacency`: index v is a vertex and adjacency.get(v) contains its outgoing neighbors. Assume non-null lists and valid neighbor indices.

**a.** Create an integer queue and a boolean visited array with one entry per vertex.

```java


```

**b.** Reject an invalid start index with IllegalArgumentException.

```java


```

**c.** Mark a valid start as visited and enqueue it.

```java


```

**d.** Print all outgoing neighbors of vertex v.

```java


```

---

### 2. Correct the errors

**a.**

```java
// adjacency is a List<List<Integer>>.
int vertices = adjacency.length;
```

**Correction**

```java


```

**b.**

```java
// Prevent a waiting vertex from being added again.
if (!visited[neighbor]) {
    queue.offer(neighbor);
}
```

**Correction**

```java


```

**c.**

```java
// Use FIFO order. frontier is a Deque<Integer>.
frontier.push(start);
int vertex = frontier.pop();
```

**Correction**

```java


```

---

### 3. Trace BFS

Start at 0. Mark vertices when enqueued. Process neighbors in the listed order.

| Vertex | Outgoing neighbors |
| --- | --- |
| 0 | 1, 2 |
| 1 | 3 |
| 2 | 3 |
| 3 | 1 |
| 4 | none |

| Removed vertex | Newly enqueued | Queue afterwards | Output so far |
| --- | --- | --- | --- |
| 0 | | | |

Continue until the queue is empty. Repeat the output order with 0’s neighbors reversed to `[2,1]`.

**Answer**

```text


```

---

### 4. Complete the neighbor loop

A vertex has just been removed from the queue and recorded in the output.

```java
for (int neighbor : adjacency.get(vertex)) {
    if (/* condition */) {
        // Mark and enqueue the neighbor.
    }
}
```

What happens for a self-loop or repeated edge?

**Solution**

```java


```

---

### 5. Count outgoing edges

Write `static int outgoingEdgeCount(List<List<Integer>> adjacency)`. Sum the sizes of the neighbor lists without changing them. Count self-loops and repeated entries separately. Test the graph in Q3 and a single vertex with no edges.

**Solution**

```java


```

---

### 6. Check boundaries and complexity

For the graph in Q3, complete the table.

| Case | Output / exception |
| --- | --- |
| Start at 4 | |
| Start at -1 | |
| Start at 5 | |
| Empty graph, start at 0 | |

State time and space in terms of V vertices and E adjacency entries. Include visited-array initialization, the queue, and the returned list.

**Answer**

```text


```
