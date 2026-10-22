# Week 3 · Tutorial 01 — Run a Service Desk

**Source:** supplementary practice based on the Week 3 roadmap. The individual Week 3 Notion page contains no lesson content; this is not official WIX1002 work.

## Practical challenge

Build a small service desk that processes customer requests in arrival order and supports undoing the most recent administrative action. It must accept a request, process the next waiting request, undo the newest action, and report whether each structure has work remaining.

**Check:** requests are handled FIFO, undo is LIFO, an empty desk does not crash, and each structure reports its own pending state.

## Implementation milestones

1. Run [TaskFirstExample.java](TaskFirstExample.java) and write the queue contents after each removal.
2. Create a `Queue<String>` for request names. Add three names, process one at a time, and display the one being handled.
3. Define the empty-queue behavior before removing. Choose an operation whose return behavior fits that contract.
4. Add a separate `Deque<String>` for the most recent undo actions. Push and undo actions from the same end.
5. Trace the same inputs with FIFO and LIFO rules and compare which request/action is returned first.
6. After the code, compare an array-backed list and a linked list for index access, insertion at a known position, and extra per-element storage. State when the position must first be found.

## Concept discovery

**Expected output for the worked example:**

```text
Processing first
Processing second
Processing third
Desk empty: true
```

**Concept note (Chinese):** 队列按先进先出处理，适合等待中的请求；栈按后进先出处理，适合撤销最近操作。`Deque` 可以从两端添加或移除，也能明确表达栈和队列行为。先定义空结构时的行为，再选择 `remove()`、`poll()` 等操作，避免空取出时出现未处理异常。

## Apply and verify

- Process three requests in arrival order.
- Test no requests, one request, and several requests.
- Add and undo two actions; confirm the newest action is undone first.
- State the time and extra space as the number of queued or stacked items grows.
- Complete this comparison table from your own traces and structure assumptions: indexed read, add/remove at a known end, and extra storage for an array-backed list versus a linked list; stack versus queue removal order.

## Explain after coding

1. What makes the service desk a queue rather than a stack?
2. Why can a deque represent both patterns?
3. What behavior does your empty-removal operation provide?

## Independent transfer

Build a print queue that accepts document names and prints them in arrival order. Add a separate “undo last added document” action using a stack; do not use one structure for both behaviors.

**Acceptance criteria:** FIFO printing; LIFO undo; explicit empty behavior; tests for empty, one-item, and multi-item states.

## Completion checklist

- [ ] I implemented and tested FIFO processing.
- [ ] I used a stack for last-action-first undo.
- [ ] I can explain how a deque supports both ends.
- [ ] I handled empty structures deliberately.
