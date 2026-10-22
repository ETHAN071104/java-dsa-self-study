# Week 3 · Tutorial 02 — Validate Nested Delimiters

**Source:** supplementary practice based on the Week 3 roadmap; the Week 3 Notion lesson page is empty.

## Practical challenge

Write a method that checks whether `()`, `[]`, and `{}` are properly nested in a string. Every closing delimiter must match the most recent unmatched opening delimiter.

**Expected behavior:** `{[()]}` is valid; `([)]`, `)(`, and `{[}` are invalid; the empty string is valid.

## Implementation milestones

1. Before coding, write a stack trace for `{[()]}` and `([)]`.
2. Scan characters from left to right. Push opening delimiters onto a stack.
3. When a closing delimiter appears, handle an empty stack, remove the most recent opener, and compare the pair.
4. After scanning, accept only if no unmatched opener remains.
5. Add a helper that maps each closing delimiter to its matching opener, or use a small conditional. Keep the input unchanged.

## Concept discovery

**Concept note (Chinese):** 嵌套结构必须先关闭最近打开的符号，因此需要后进先出的访问方式。栈顶记录当前最内层的未匹配符号。仅检查最后栈是否为空不够：还必须处理“没有可匹配的开括号”以及括号类型不相同的情况。

Use this trace table in your notes; complete it yourself before writing the method:

| Character read | Stack before | Action | Stack after |
| --- | --- | --- | --- |
| `{` | empty | push opener | your trace |
| `[` | your trace | push opener | your trace |
| `]` | your trace | compare with top | your trace |

## Apply and verify

Test each required string plus `((`, `]`, `[]{}()`, and `[{()}]`. Add a long valid string and an immediate mismatch. Record which condition each test exercises.

## Explain after coding

1. Why must a closer match the top opener rather than any opener in the stack?
2. Which invalid input can cause an attempted pop from an empty stack?
3. Why does a non-empty final stack mean the input is incomplete?
4. What is the time and auxiliary-space complexity in terms of string length `n`?

## Independent transfer

Validate a string containing only `<` and `>` delimiters. Add a maximum nesting depth rule and reject any string that exceeds it.

**Acceptance criteria:** handles empty input, unmatched openers/closers, proper nesting, and the depth limit; does not use a counter alone to accept crossed delimiters.

## Completion checklist

- [ ] I implemented a stack-based scan.
- [ ] I tested empty, mismatched, incomplete, and valid nesting.
- [ ] I can state the invariant after each character.
- [ ] I can justify O(n) time and worst-case O(n) extra space.
