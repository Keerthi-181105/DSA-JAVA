# Java Coding Practice

A collection of standalone Java solutions organized by topic. Every Java file contains a reusable static method and a small `main` method demonstrating it.

## Topics

- `01-Arrays`: array traversal, searching, prefix sums, subarrays, and array manipulation
- `02-Number-Programs`: digit operations, number properties, arithmetic, and sequences
- `03-String-Programs`: string transformations, frequency counting, matching, and conversions
- `04-Searching`: linear and binary search
- `05-Sorting`: insertion, quick, merge, bubble, and selection sort
- `06-Stack-and-Parentheses`: delimiter validation with a stack
- `07-Mathematical-and-Pattern`: common interview algorithms and pattern generation
- `07-Mathematical-and-Pattern/C-Patterns`: equivalent C pattern examples

## Compile and run one Java program

From the repository root in PowerShell:

```powershell
javac .\01-Arrays\SumOfArray.java
java -cp .\01-Arrays SumOfArray
```

Each topic can also be compiled as a group:

```powershell
javac (Get-ChildItem .\01-Arrays -Filter *.java).FullName
```

The Java classes intentionally have no package declarations so each exercise can be compiled and run independently.

## Compile and run the C patterns

With GCC installed:

```powershell
gcc .\07-Mathematical-and-Pattern\C-Patterns\PatternPrograms.c -o .\07-Mathematical-and-Pattern\C-Patterns\PatternPrograms.exe
.\07-Mathematical-and-Pattern\C-Patterns\PatternPrograms.exe
```
