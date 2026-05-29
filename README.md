# HDFC NetBanking Daily Spend Analysis using Fenwick Tree

## Overview

This project implements a **Fenwick Tree (Binary Indexed Tree)** to efficiently analyze daily spending records in an online banking system. The Fenwick Tree supports fast prefix sum and range sum queries while allowing updates to transaction data in logarithmic time.

The case study demonstrates how financial institutions can process large volumes of transaction data efficiently without repeatedly traversing the entire dataset. By using a Fenwick Tree, cumulative spending and interval-based expenditure analysis can be performed quickly and accurately.

---

## Problem Statement

HDFC NetBanking records daily customer spending and frequently needs to answer queries such as:

* Total spending up to a specific day.
* Spending between two given dates.
* Updating transaction records when corrections occur.

A normal array requires O(n) time for range-sum calculations, which becomes inefficient for large datasets. To overcome this limitation, a Fenwick Tree is used.

---

## Features

* Fenwick Tree (Binary Indexed Tree) implementation
* Prefix Sum Query
* Range Sum Query
* Efficient Update Operations
* Banking Transaction Analysis
* Time Complexity Evaluation

---

## Input Data

Daily Spending Records:

1200, 800, 0, 2400, 1500, 600, 0, 0, 3500, 0, 1100, 950, 700, 0

---

## Output

Prefix Sum(12) = 12050

Prefix Sum(4) = 4400

Range Sum(5,12) = ₹7650

---

## Time Complexity

| Operation        | Complexity |
| ---------------- | ---------- |
| Update           | O(log n)   |
| Prefix Sum Query | O(log n)   |
| Range Sum Query  | O(log n)   |
| Space Complexity | O(n)       |

---

## Applications

* Banking Transaction Analysis
* Financial Reporting Systems
* Accounting Software
* Real-Time Analytics
* Range Query Processing

---

## Conclusion

The Fenwick Tree efficiently processes transaction data by supporting fast updates and range-sum queries. The implementation successfully calculates customer spending over selected periods while maintaining logarithmic performance. This makes Fenwick Trees highly suitable for banking, financial analytics, and transaction monitoring systems.

---

## Author

Data Structures and Algorithms Case Study

HDFC NetBanking Daily Spend Analysis using Fenwick Tree
