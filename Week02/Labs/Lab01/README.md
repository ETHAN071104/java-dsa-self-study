# Week 2 · Lab 01 — Collection workbench

**Classification:** additional Java/DSA self-study; not official WIX1002 lab work. **Starter:** [CollectionWorkbench.java](CollectionWorkbench.java). Implement each TODO independently. The methods are intentionally incomplete.

## Problem statement

Build a small utility that summarizes a list of words without changing the caller's list. Treat words as case-sensitive strings; ignore null entries and strings that are empty after trimming. Task 02 returns a sorted copy; Task 03 uses first-seen input order when choosing a unique word.

### Task W2-L01-01 — Frequency counts

Implement `countWords(List<String> words)`.

- Return a map from each normalized word (`trim`) to its count.
- Keep case sensitive (`"Map"` and `"map"` are different).
- Return an empty map when there are no accepted words.
- Example: `["oak", " pine ", "oak", "", null]` has counts `oak → 2`, `pine → 1`. Map display order is unspecified.

### Task W2-L01-02 — Sort a copy

Implement `sortByLengthThenName(List<String> words)`.

- Return a new list of accepted, trimmed words.
- Sort first by increasing length, then case-insensitively by name.
- Do not mutate the input.
- Example: `["Pear", "fig", "plum"]` returns `["fig", "Pear", "plum"]`.

Use a `Comparator`; explain what happens when two strings tie on both keys. Do not use subtraction to compare numeric values.

### Task W2-L01-03 — First unique word

Implement `firstUniqueWord(List<String> words)` using a frequency-based approach.

- Return the first normalized word whose count is one, considering first-seen input order.
- Return `null` if there is no such word.
- Example: `["red", "blue", "red", "green"]` returns `"blue"`.

## Acceptance and tests

Test empty list, one word, duplicate words, whitespace-only strings, null entries, mixed case, and tied sort keys. Check that the input list is unchanged. Assertions may be written in `main` or as manual test cases; no testing library is required.

## Complexity and completion

For each method, state time and auxiliary space. Explain which output structures contribute to space.

- [ ] All TODOs attempted in a separate working copy or branch/file without overwriting earlier attempts.
- [ ] All listed edge cases considered.
- [ ] Sort uses a comparator and does not mutate the input.
- [ ] Complexity notes are written in my own words.
- [ ] I can explain why a hash map is suitable for counts.
