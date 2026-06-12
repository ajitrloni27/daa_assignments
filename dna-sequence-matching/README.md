# Assignment 3: DNA Sequence Matching

## Problem Statement
In bioinformatics, researchers look for a specific gene sequence (pattern) within a longer DNA strand (text). This program applies the **Naive String Matching Algorithm** to find all positions where a short DNA pattern appears.

- **DNA (Text):** `ATGCGATACGTAGCTAGCTAA`
- **Pattern:** `GCTA`

## Algorithm Explanation
The Naive String Matching algorithm works by:
1. Sliding the pattern over the text one position at a time (from index `0` to `n-m`)
2. At each position `i`, comparing the pattern character by character with the substring of the text
3. If all `m` characters match, a pattern occurrence is reported at position `i`
4. If any mismatch is found, the outer loop moves to the next position

## Time Complexity
- **Worst Case:** O(n × m) — when all characters of pattern match most of the text
- **Best Case:** O(n) — when the first character of the pattern rarely matches

## How to Run
```bash
javac DNASequenceMatching.java
java DNASequenceMatching
```

## Sample Output
```
DNA Text    : ATGCGATACGTAGCTAGCTAA
Pattern     : GCTA

Pattern found at position 9
Pattern found at position 14

Time Complexity = O(n * m)
```
