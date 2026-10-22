# Week 4 · Tutorial 04 — Test and Debug a Search Method

**Source:** supplementary practice based on the 19-week roadmap; the individual Week 4 Notion page contains no lesson content.

## Practical challenge

A binary-search implementation passes ordinary middle-value tests but fails on an empty array and may repeat an interval for an absent target. Turn the behavior contract into tests, then use a trace or debugger to locate the defect.

**Contract:** ascending input; return any valid matching index or `-1`; do not mutate the array.

## Implementation milestones

1. Write test cases before changing the method: empty, one-element hit/miss, first/last element, absent value, and duplicates.
2. For each test, record input, target, expected behavior, and actual behavior.
3. Trace `left`, `right`, and `mid` immediately before every array access. Identify the state that repeats or makes an invalid access.
4. Fix the boundary or loop condition. Rerun the same tests and add a regression case for the defect.
5. If JUnit 5 is already configured, express a few cases as tests with assertions using the [Lab 01 test starter](../../Labs/Lab01/BinarySearchTest.java). Otherwise keep the same cases as a manual test table; do not install dependencies for this tutorial.

## Concept discovery

**Concept note (Chinese):** 测试先验证公开行为，而不是依赖方法内部变量。边界测试能暴露空数组和单元素问题；重复区间的手动追踪能定位循环不收缩的原因。JUnit 测试通常包含准备输入、调用方法、断言结果三步。若运行环境没有 JUnit，手工测试表仍然能清楚记录预期和实际结果。

The following fragment contains a boundary-update defect. Trace it before editing:

```java
if (values[mid] < target) {
    left = mid;
} else {
    right = mid;
}
```

## Apply and verify

- Keep the test for the original failure after fixing the code.
- For duplicate values, assert the returned index is valid and points to the target; do not require the first index unless that is the contract.
- Add a test that confirms the input is unchanged.
- Review midpoint arithmetic for overflow when `left` and `right` are large nonnegative values; explain a safe expression.
- Separate a compile-time error, runtime exception, and wrong-result logic bug using one example of each from your work.

## Explain after coding

1. Which test exposed the defect first, and why?
2. What loop invariant should remain true before every midpoint access?
3. What evidence showed that the interval now shrinks?
4. Which tests would you keep if the implementation later changed?

## Independent transfer

Write tests for an insertion-sort method: empty, one item, sorted, reverse sorted, duplicates, and negative values. Use one trace to diagnose a failing pass, then preserve the test that caught it.

**Acceptance criteria:** tests match the public contract; a failing case becomes a regression test; array input is unchanged by search; JUnit is optional and no installation is required.

## Completion checklist

- [ ] I wrote boundary tests from the method contract.
- [ ] I used a trace or debugger to find a defect.
- [ ] I preserved a regression case.
- [ ] I can explain the role of JUnit assertions or a manual test table.
