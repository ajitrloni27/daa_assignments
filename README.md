# Algorithm Design Assignments

This repository contains Java implementations for two algorithm assignments.

---

## Assignment 3: DNA Sequence Matching

### Problem Statement
In bioinformatics, researchers look for a specific gene sequence (pattern) within a longer DNA strand (text). This program applies the **Naive String Matching Algorithm** to find all positions where a short DNA pattern appears.

- **DNA Text:** `ATGCGATACGTAGCTAGCTAA`
- **Pattern:** `GCTA`

### Algorithm: Naive String Matching
The Naive String Matching algorithm slides the pattern over the text one character at a time and checks for a match at each position.

### Time Complexity
| Case | Complexity |
|------|------------|
| Worst Case | O(n × m) |
| Best Case | O(n) |

> Where `n` = length of text, `m` = length of pattern

### How to Run
```bash
cd dna-sequence-matching
javac DNASequenceMatching.java
java DNASequenceMatching
```

### Sample Output
```
DNA Text    : ATGCGATACGTAGCTAGCTAA
Pattern     : GCTA

Pattern found at position 9
Pattern found at position 14

Time Complexity = O(n * m)
```

---

## Assignment 4: Floyd-Warshall – Airline Fare Distance Mapping

### Problem Statement
An airline company wants to compute the **minimum travel costs between all cities** in its network. This program implements the **Floyd-Warshall Algorithm** for a given city graph and also outputs the time complexity.

### Algorithm: Floyd-Warshall
Floyd-Warshall is a dynamic programming algorithm that finds shortest paths between every pair of vertices in a weighted graph.

- Uses a 2D cost matrix as input
- `9999` represents no direct path (infinity)
- Iterates through all intermediate vertices `k` to relax edges

### Time Complexity
| Case | Complexity |
|------|------------|
| All Cases | O(n³) |

> Where `n` = number of cities (vertices)

### How to Run
```bash
cd floyd-warshall
javac FloydWarshall.java
java FloydWarshall
```

### Sample Input
```
Enter number of cities: 4
Enter cost matrix (use 9999 for no path):
0    3    9999 7
8    0    2    9999
5    9999 0    1
2    9999 9999 0
```

### Sample Output
```
Shortest Distance Matrix:
0   3   5   6
5   0   2   3
3   6   0   1
2   5   7   0

Time Complexity = O(n^3)
```

---

## Repository Structure
```
├── README.md
├── dna-sequence-matching/
│   ├── DNASequenceMatching.java
│   └── README.md
└── floyd-warshall/
    ├── FloydWarshall.java
    └── README.md
```

## Technologies Used
- **Language:** Java
- **Concepts:** String Matching, Dynamic Programming, Graph Algorithms
