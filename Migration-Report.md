# Week 1 Migration Report

## Source Notion pages inspected

The Week 1 tree is under Hilti Intern Preparation → WEEK1 Java OOP + complexity.

- Hilti Intern Preparation — confirms the Week 1 page under Phase 1.
- WEEK1 Java OOP + complexity — learning objectives and linked tutorials, labs, and optional checkpoint.
- Tutorial1 — six questions with attempted answers/code.
- Tutoria2 — six questions; all answer blocks empty.
- Tutorial3 — six questions; all answer callouts empty.
- Tutorial4 — six Big-O/time/space/string questions; answer callouts empty.
- Lab1 — four project prompts; the first includes an incomplete Student attempt.
- Lab2 — four array/string LeetCode practice prompts; no attempts.
- Optional Checkpoint — three optional project/problem prompts; no attempts.
- Hilti Technical Learning Roadmap — 19 Weeks — consulted only for the complete Week 1 mastery checkpoint omitted from the Week 1 page's source text.

The similarly named Study_Concepts_Weeks1-13 page is in the separate WIX1002 FOP university coursework tree, not Hilti Prepare; it was excluded to avoid migrating unrelated material. Weekly to-do list links the roadmap but contains no Week 1 tracker or reflection.

## Migration map and files

- Root: README.md, .gitignore, this report.
- Week overview/objectives and source map: Week01/README.md.
- Tutorial 1: Week01/Tutorials/Tutorial01/README.md and Student.java.
- Tutorials 2–4: each source page's questions in that folder's README.md.
- Lab 1: full requirements in Week01/Labs/Lab01/README.md, existing attempt in Student.java.
- Lab 2: all four problem statements and links in Week01/Labs/Lab02/README.md.
- Optional projects: Week01/OptionalCheckpoint/README.md.

## Topics accounted for

Java classes/objects, constructors, encapsulation, inheritance, overloading/overriding, polymorphism, abstract classes/interfaces, reference semantics, == vs equals(), hashCode(), HashSet, exceptions/debugging, Big-O/time and auxiliary space, loops, string concatenation, arrays and strings practice (Two Sum, Contains Duplicate, Valid Anagram, Best Time to Buy and Sell Stock), and optional Student/Shape/Maximum Subarray checkpoints.

## Preservation and review notes

- Original answer snippets and Java attempts were kept as written; TODO notes point out issues without repairing the attempts.
- Tutorial 1 Q3's answer (Bob) and its shared-reference diagram are preserved in Markdown.
- The Week 1 page's mastery checkpoint ends after “build a small multi-class Java”; the complete sentence is available in the matching roadmap Week 1 entry and is identified as such in Week01/README.md.
- Tutorial 2's original Notion title is Tutoria2; the destination folder uses the consistent Tutorial02 name.
- Empty answer blocks were recorded as unanswered, not filled with generated solutions.
- No separate Week 1 reflection or progress tracker was found.

## Java syntax and environment

- Tutorial 1 Q1 contains malformed Java (puclic, incomplete declaration, malformed class declaration, and multiple public classes) and remains in Markdown with a TODO.
- Tutorial 1 Q5 is not expected to compile: getStudentId() and getCgpa() are called but do not exist in the preserved attempt.
- Lab 1 Student.java calls undefined setOrUpdateCgpa; it also does not validate CGPA or print the three objects.
- The machine reports “Unable to locate a Java Runtime” for both java and javac; no compilation or execution could be run. No software was installed.

## Workspace and GitHub status

- The requested local folder had only the empty Week01/Tutorials/Tutorial01–04 and Week01/Labs/Lab01–02 directories; no files or existing local changes were found.
- The local folder was not a Git repository and had no remote configuration.
- GitHub reports ETHAN071104/java-dsa-self-study as public, empty (size: 0), default branch main, with push permission available to the connected account. The contents endpoint returned 404 because the repository has no commit yet.
- The reviewed migration files are committed locally. The push was rejected by the automatic approval review because the preserved Tutorial 1 Java file contains the student's name and student ID and the destination repository is public. No push was made.

## Items requiring user review

- Review the original Java mistakes in Tutorial 1 Q5 and Lab 1 before editing them as learning exercises.
- Decide whether to publish the preserved name and student ID in the public GitHub repository, or provide an instruction to redact them in the public copy while keeping the local attempt intact.
- Decide whether to migrate the separate WIX1002 FOP university study guide as a separate task.
