# Java, DSA & Applied AI Roadmap

**18 October 2026 → 28 February 2027**

> **Goal:** build a Java/DSA foundation, use Python for AI evaluation, and finish one reproducible project you can explain independently.

## Is this plan realistic?

**With 15+ focused hours per week, this is a reasonable but ambitious working plan.** Aim for practical foundations and one working project by February. This assumes intermediate Python is already in place; use the checkpoints to confirm the pace.

| Keep | Adjust |
| --- | --- |
| Java/DSA first; intermediate Python next | Give dense topics extra time when needed |
| Learn through questions, code, and labs | Start the AI project in Week 6; improve it each week |
| Continue Java/DSA alongside AI | Keep two short Java/DSA sessions each week from Week 5 |
| Protect university work and CGPA | Reduce optional topics first during busy weeks |
| Weekly mastery checkpoints | Use Weeks 9 and 14 partly for catch-up |

## My weekly budget · 15 hours

| Activity | Weeks 1–4 | Weeks 5–19 |
| --- | --- | --- |
| Learn + tutorial questions | 4 h · Java/DSA | 4 h · Python/AI/engineering |
| Build + test | 6 h · Java labs | 6 h · Evaluation Lab and weekly exercises |
| Java/DSA practice | 3 h | 3 h · two sessions |
| Review + catch-up | 2 h | 2 h |
| **Total** | **15 h** | **15 h** |

Treat this as a starting split. In Week 17, shift the main build block to Java/DSA consolidation. Extra available hours go to weak areas first; protect university work and rest.

## Study materials

| Week | Tutorials & labs |
| --- | --- |
| [01](Week01/README.md) | Java OOP, arrays & strings |
| [02](Week02/README.md) | Collections & hashing |
| [03](Week03/README.md) | Linear data structures |
| [04](Week04/README.md) | Search, sort & recursion |

Weeks 5–19 below are planned work; their tutorial and lab folders are not yet created.

## The 19-week plan

<details open>
<summary><strong>Weeks 1–4 · Java + DSA foundation</strong></summary>

| Week · dates (2026) | Focus | Done when I can… |
| --- | --- | --- |
| 01 · 18–24 Oct | OOP, exceptions, references, equality; arrays, strings, Big-O | Build a small multi-class program, validate input, and explain its loops |
| 02 · 25–31 Oct | Collections, generics, hashing, ordering; two pointers, windows | Choose a structure, solve basic counting/pair/window tasks, and explain costs |
| 03 · 1–7 Nov | Stacks, queues, linked lists, fast/slow pointers, BFS basics | Use each structure correctly and check empty, boundary, and cyclic cases |
| 04 · 8–14 Nov | Binary search, sorting costs, recursion, trees; lambdas, streams, tests | Implement and test binary search, and explain a recursive tree trace |

**Gate →** Before adding AI, complete a small Java task using collections, test it, and explain its time/space cost without copying a solution. If this fails, consolidate first and reduce later optional scope.

</details>

<details>
<summary><strong>Weeks 5–8 · Python + AI foundations</strong></summary>

| Week · dates (2026) | Focus | Done when I can… |
| --- | --- | --- |
| 05 · 15–21 Nov | Python modules, types, exceptions, JSON/CSV, environments, pytest | Load, validate, transform, and export data with tested functions |
| 06 · 22–28 Nov | NumPy/pandas, statistics, charts, datasets and baselines | Analyse a small results file; create the project's first 10 cases |
| 07 · 29 Nov–5 Dec | LLM concepts, prompts, structured output, API calls and validation | Run one prompt, parse its response, and handle failures |
| 08 · 6–12 Dec | Rubrics, scoring, precision/recall/F1, repeatable evaluation | Score a batch consistently and produce a summary report |

**Gate →** A small Python pipeline runs from input to report. Scores have a clear rule and failures are recorded.

</details>

<details>
<summary><strong>Weeks 9–13 · AI evaluation engineering</strong></summary>

| Week · dates (2026–27) | Focus | Done when I can… |
| --- | --- | --- |
| 09 · 13–19 Dec | Error analysis, rubric calibration + catch-up | Group failures, inspect the evidence, and repair the weakest pipeline step |
| 10 · 20–26 Dec | Prompt experiments, versioning, variability, reproducibility | Compare two prompts on the same cases and explain improvements/regressions |
| 11 · 27 Dec–2 Jan | Enterprise workflows, human review, privacy, Copilot roles | Sketch input → AI → validation → review → output with failure handling |
| 12 · 3–9 Jan | RAG: chunking, embeddings, retrieval, grounding | Inspect a small retrieval example and distinguish retrieval from answer failure |
| 13 · 10–16 Jan | AI Evaluation Lab v1.0 | Rerun 30–50 cases, compare two prompts, and present findings and limitations |

**Gate →** v1.0 works end to end and can be rerun. RAG remains a small experiment until the core evaluator is reliable.

</details>

<details>
<summary><strong>Weeks 14–19 · Engineering + integration</strong></summary>

| Week · dates (2027) | Focus | Done when I can… |
| --- | --- | --- |
| 14 · 17–23 Jan | Testable modules, composition, SOLID basics, refactoring + catch-up | Improve the existing project without breaking its tested behaviour |
| 15 · 24–30 Jan | HTTP/REST, SQL, keys, constraints, transactions | Handle an API failure and store/query experiment results consistently |
| 16 · 31 Jan–6 Feb | AI reliability, prompt injection, leakage, validation, fallbacks | Test malformed/untrusted outputs and demonstrate a review or fallback path |
| 17 · 7–13 Feb | Java/DSA consolidation | Solve common easy and selected medium tasks; explain edge cases and alternatives |
| 18 · 14–20 Feb | Evaluation v2: regression, coverage, quality/cost/latency | Rerun comparisons and report trade-offs with supporting evidence |
| 19 · 21–28 Feb | Integration, final repairs, demonstration | Complete a small coding task and independently present the finished project |

</details>

## One project · AI Evaluation Lab

Choose **one narrow task**, such as answering questions from a small document set. Keep that task throughout the plan.

**Cases → model outputs → validation/scoring → error analysis → report**

**W6:** first cases → **W8:** scoring → **W10:** prompt comparison → **W13:** v1 → **W18:** v2 → **W19:** demo.

Use development cases to improve prompts. Reserve a separate final set for checking the finished version; do not tune on those final cases. A 30–50-case project demonstrates your method, not broad proof of reliability. See the [data-leakage principle](https://scikit-learn.org/stable/common_pitfalls.html#data-leakage) behind this separation.

Use Git, small tests, and safe secret handling from the first relevant exercise. Week 13 packages these habits into the project; it is not their starting point.

## Weekly rule

**Questions → lab or project increment → tests → explain → review**

| My result | Next step |
| --- | --- |
| I can implement, test, and explain it | Move on |
| I understand it but still depend heavily on examples | Repair the highest-impact gap first |
| I cannot explain or apply the core idea | Repeat the essential work and reduce new scope |
| University deadlines increase | Protect coursework; postpone optional depth |

Documentation is allowed. “Independent” means I make the implementation decisions and can explain my code.

**Keep essential:** Java/DSA basics, Python data handling, testing, prompt evaluation, and one reproducible project.

**Reduce first:** custom decorators, advanced streams, deep Transformer mathematics, building retrieval infrastructure from scratch, extensive mocking/DI, and extra projects. Keep introductory RAG and Copilot workflow understanding.

If a checkpoint slips, move the dependent work and reduce optional depth. The dates are targets, not proof of progress.

## Finish line · 28 February 2027

- [ ] Solve and explain a small Java/DSA problem independently.
- [ ] Build and test a Python data/evaluation pipeline.
- [ ] Rerun the AI Evaluation Lab from its instructions.
- [ ] Explain results, design choices, failure cases, and limitations.
- [ ] Demonstrate the work while keeping university commitments on track.

Vacancy monitoring, applications, CV work, and follow-ups stay outside this learning roadmap.
