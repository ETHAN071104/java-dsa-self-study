# Before Week 03 · Tutorial 04

**You will learn:** represent a graph and trace breadth-first search using a queue.

**Already know:** FIFO operations from [Tutorial 01](../Tutorial01/requirement.md), list indexing, and boolean arrays.

## Graph vocabulary

| Term / expression | Meaning |
| --- | --- |
| Vertex / edge | A graph location / a connection to another vertex |
| Directed edge | A connection with a direction; 0→1 does not automatically mean 1→0 |
| Adjacency list | A neighbor list for each vertex |
| `List<List<Integer>>` | A list whose elements are lists of integer vertex IDs |
| `adjacency.get(v)` | The outgoing neighbors of vertex v |
| `adjacency.size()` | Number of vertices |
| `new boolean[V]` | V flags initially false |
| `visited[v] = true` | Record that vertex v has been discovered |
| Reachable | Can be reached by following edges from the starting vertex |
| BFS | Breadth-first search: explore by increasing number of edges from the start |

## Small example

```java
import java.util.ArrayList;
import java.util.List;
// Inside main:
List<List<Integer>> graph = new ArrayList<>();
graph.add(new ArrayList<>()); // vertex 0
graph.add(new ArrayList<>()); // vertex 1
graph.get(0).add(1);          // edge 0 → 1
```

An empty neighbor list is a valid vertex with no outgoing edges. For the queue, import java.util.Queue and java.util.ArrayDeque.

## Traversal rules

The queue holds discovered vertices waiting to be processed. Mark on enqueue so two paths do not add the same waiting vertex twice. A self-loop points back to the current vertex; a repeated edge lists the same neighbor again.

Neighbor order determines the order among same-level vertices. A disconnected vertex may never appear when starting elsewhere.

Start indices must be within `0..adjacency.size()-1`; an empty graph has no valid start. In these exercises, all listed neighbor indices are valid. V counts vertices and E counts stored neighbor entries; distinguish array initialization, edge scanning, queue space, and returned output.

## Ready to start?

- [ ] I can read a list of neighbor lists and identify outgoing edges.
- [ ] I know the difference between discovered, waiting in the queue, and processed.

[Start the tutorial →](README.md)
