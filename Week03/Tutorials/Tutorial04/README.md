# Week 3 · Tutorial 04 — Visit a Graph with BFS

**Source:** supplementary practice based on the Week 3 roadmap; the individual Week 3 Notion lesson page has no content.

## Practical challenge

Given a directed graph and a starting vertex, print each reachable vertex once in breadth-first order. Process neighbors in the order listed.

Use this graph: `0: [1, 2]`, `1: [2]`, `2: [3]`, `3: [1]`. Start at `0`. Vertex `4` exists but is disconnected.

**Check:** output each reachable vertex once; never enqueue a vertex twice; do not visit the disconnected vertex from this start.

## Implementation milestones

1. Trace the queue and visited set by hand before coding. Mark a vertex visited when it is enqueued.
2. Store each vertex's neighbors in an adjacency list.
3. Enqueue the start vertex, then repeatedly remove the front and inspect its neighbors.
4. Enqueue only unseen neighbors. Print or collect a vertex when it is removed.
5. Test a self-loop, a cycle, an isolated start, a disconnected vertex, and an empty graph. Define what an invalid start does.

## Concept discovery

**Concept note (Chinese):** BFS 使用队列逐层处理“前沿”。顶点入队时就标记访问，可以避免多个邻居重复加入。邻接表让算法只检查实际存在的边；遍历所有可达顶点和相关边的时间为 O(V + E)，队列与访问标记最多占 O(V) 额外空间。

## Apply and verify

For the supplied graph, write the expected order before running your program. Add a second edge order and show how it changes which same-level vertex is visited first. Confirm that every vertex is emitted at most once.

## Explain after coding

1. Why is the queue FIFO in breadth-first search?
2. Why is the visited mark set when a vertex is enqueued rather than later?
3. Which vertices and edges are counted in O(V + E)?
4. How would a stack change the traversal behavior?

## Independent transfer

Model a small campus map as rooms and one-way corridors. From a chosen room, report all reachable rooms by number of steps, keeping each room once. Use only the graph and queue techniques from this tutorial.

**Acceptance criteria:** correct reachable set and level order; start and disconnected cases handled; neighbor order is documented; time and auxiliary space are explained.

## Completion checklist

- [ ] I implemented BFS using a queue and visited set.
- [ ] I tested cycles, repeated edges, isolated vertices, and disconnection.
- [ ] I can explain the role of the adjacency list and FIFO order.
- [ ] I stated O(V + E) time and O(V) auxiliary space.
