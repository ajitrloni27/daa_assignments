# Assignment 4: Floyd-Warshall – Airline Fare Distance Mapping

## Problem Statement
An airline company wants to compute the **minimum travel costs between all cities** in its network. This program implements the **Floyd-Warshall Algorithm** on a given city graph and outputs the shortest distance matrix along with the time complexity.

## Algorithm Explanation
The Floyd-Warshall algorithm works by:
1. Starting with the direct edge costs between cities as the initial distance matrix
2. For each intermediate city `k`, checking if the path through `k` is cheaper: `dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])`
3. Repeating for all combinations of `i`, `j`, and `k`
4. After all iterations, `dist[i][j]` holds the minimum cost from city `i` to city `j`

## Input Format
- Enter number of cities `n`
- Enter `n x n` cost matrix row by row
- Use `9999` to indicate no direct flight between two cities

## Time Complexity
- **All Cases:** O(n³) — three nested loops over `n` cities

## How to Run
```bash
javac FloydWarshall.java
java FloydWarshall
```

## Sample Input / Output
**Input:**
```
Enter number of cities: 4
0    3    9999 7
8    0    2    9999
5    9999 0    1
2    9999 9999 0
```

**Output:**
```
Shortest Distance Matrix:
0   3   5   6
5   0   2   3
3   6   0   1
2   5   7   0

Time Complexity = O(n^3)
```
