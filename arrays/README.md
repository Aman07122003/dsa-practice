# 📘 Arrays - Complete Interview Handbook

> A comprehensive guide to mastering Arrays for coding interviews. This handbook covers **theory, patterns, algorithms, complexity analysis, templates, interview questions, and problem roadmaps**.

---

# 📑 Table of Contents

- Introduction
- Time Complexity Cheat Sheet
- Memory Representation
- Arrays vs ArrayList vs LinkedList
- Pattern Roadmap
- Pattern Recognition Guide
- Pattern Templates
- Complete Pattern Library
- Complexity Comparison
- Common Interview Questions
- Common Mistakes
- Interview Roadmap
- Must Solve Problems
- Revision Checklist

---

# 📌 What is an Array?

An **Array** is a linear data structure that stores elements of the **same data type** in **contiguous memory locations**.

Example

```text
Index   0   1   2   3   4
Value  10  20  30  40  50
```

---

# Characteristics

- Fixed Size
- Stores homogeneous elements
- Random Access
- Contiguous Memory
- Cache Friendly
- Index starts from 0

---

# Memory Representation

```text
Address

1000 -> 10
1004 -> 20
1008 -> 30
1012 -> 40
1016 -> 50
```

Each integer occupies 4 bytes.

Address Formula

```text
Address = Base + (Index × SizeOfElement)
```

---

# Advantages

- O(1) Random Access
- Cache Friendly
- Easy Traversal
- Low Memory Overhead
- Simple Implementation

---

# Disadvantages

- Fixed Size
- Expensive Insertions
- Expensive Deletions
- Wasted Memory
- Cannot Grow Dynamically

---

# Time Complexity Cheat Sheet

| Operation | Complexity |
|------------|------------|
| Access | O(1) |
| Search | O(n) |
| Update | O(1) |
| Insert at End | O(1)* |
| Insert at Beginning | O(n) |
| Insert in Middle | O(n) |
| Delete | O(n) |
| Traversal | O(n) |

\* Only if space is available.

---

# Arrays vs ArrayList vs LinkedList

| Feature | Array | ArrayList | LinkedList |
|----------|--------|------------|------------|
| Size | Fixed | Dynamic | Dynamic |
| Random Access | O(1) | O(1) | O(n) |
| Insert Beginning | O(n) | O(n) | O(1) |
| Delete Beginning | O(n) | O(n) | O(1) |
| Memory | Less | Moderate | More |
| Cache Friendly | Yes | Yes | No |

---

# Frequently Asked Interview Questions

## Why is Array Access O(1)?

Because the memory address is calculated directly.

```text
Address = Base + Index × Size
```

No traversal is required.

---

## Why is Insertion O(n)?

```text
Before

10 20 40 50

Insert 30

↓

10 20 30 40 50
```

Elements after index must shift.

---

## Why are Arrays Faster than Linked Lists?

Arrays are stored in contiguous memory.

CPU cache loads adjacent elements together.

Linked Lists are scattered in memory.

---

## Why can't Array Size Change?

Memory is allocated during creation.

Increasing the size would require allocating a new block and copying elements.

---

# Pattern Roadmap

```text
Arrays

│

├── Traversal

├── Frequency Counting

├── Two Pointer

├── Sliding Window

├── Prefix Sum

├── Hashing

├── Binary Search

├── Sorting

├── Kadane

├── Cyclic Sort

├── Matrix

├── Greedy

└── Miscellaneous
```

---

# Pattern Recognition Guide

| If the Question Mentions | Think About |
|--------------------------|-------------|
| Sorted Array | Binary Search / Two Pointer |
| Pair Sum | HashMap / Two Pointer |
| Window Size K | Sliding Window |
| Consecutive | HashSet |
| Frequency | HashMap |
| Missing Number | Cyclic Sort |
| Duplicate | HashMap / Cyclic Sort |
| Maximum Sum | Kadane |
| Subarray Sum | Prefix Sum |
| Matrix | Matrix Traversal |
| Merge | Sorting |

---

# Pattern Templates

---

# 1. Traversal

### When to Use

- Find maximum
- Find minimum
- Count elements
- Sum
- Reverse

Template

```java
for(int i=0;i<arr.length;i++){

}
```

Complexity

| Time | Space |
|------|-------|
| O(n) | O(1) |

Problems

- Largest Element
- Smallest Element
- Second Largest
- Reverse Array
- Check Sorted
- Count Even/Odd

---

# 2. Frequency Counting

### When to Use

Whenever counting occurrences.

Template

```java
HashMap<Integer,Integer> map=new HashMap<>();

for(int num:arr){
    map.put(num,map.getOrDefault(num,0)+1);
}
```

Complexity

| Time | Space |
|------|-------|
| O(n) | O(n) |

Problems

- Frequency Count
- Duplicates
- Majority Element
- Top K Frequent
- First Non-Repeating

---

# 3. Two Pointer

### Recognition

Questions containing

- Sorted
- Pair
- Reverse
- Partition
- Move

Template

```java
int left=0;
int right=arr.length-1;

while(left<right){

}
```

Complexity

| Time | Space |
|------|-------|
| O(n) | O(1) |

Problems

- Two Sum
- Reverse Array
- Remove Duplicates
- Move Zeroes
- Merge Arrays
- Container With Most Water

---

# 4. Sliding Window

Recognition

- Window
- Continuous
- Fixed Size
- Longest
- Shortest

Fixed Window

```java
int sum=0;

for(int i=0;i<k;i++)
    sum+=arr[i];

for(int i=k;i<arr.length;i++){

    sum+=arr[i];
    sum-=arr[i-k];
}
```

Variable Window

```java
int left=0;

for(int right=0;right<arr.length;right++){

}
```

Problems

- Maximum Sum K
- Maximum Average
- Longest Ones
- Fruit Into Baskets
- Minimum Window

---

# 5. Prefix Sum

Recognition

- Subarray Sum
- Range Query
- Continuous Sum

Template

```java
prefix[0]=arr[0];

for(int i=1;i<n;i++){

    prefix[i]=prefix[i-1]+arr[i];
}
```

Problems

- Subarray Sum Equals K
- Count Subarrays
- Pivot Index
- Range Sum Query

---

# 6. Binary Search

Recognition

- Sorted
- Search
- Minimum
- Peak

Template

```java
while(low<=high){

    int mid=low+(high-low)/2;

}
```

Problems

- Binary Search
- Search Insert
- Peak Element
- Rotated Array
- Lower Bound
- Upper Bound

---

# 7. Hashing

Recognition

- Pair
- Frequency
- Distinct
- Duplicate

Template

```java
HashSet<Integer> set=new HashSet<>();
HashMap<Integer,Integer> map=new HashMap<>();
```

Problems

- Two Sum
- Contains Duplicate
- Longest Consecutive
- Count Pair Difference
- Count Pair Sum
- Missing Numbers

---

# 8. Kadane's Algorithm

Recognition

- Maximum Sum
- Continuous Subarray

Template

```java
current=Math.max(arr[i],current+arr[i]);
max=Math.max(max,current);
```

Problems

- Maximum Subarray
- Maximum Circular Sum
- Stock Buy Sell

---

# 9. Cyclic Sort

Recognition

Numbers are in range

```text
1...N
```

Template

```java
while(i<n){

    int correct=arr[i]-1;

}
```

Problems

- Missing Number
- Missing Numbers
- Duplicate Number
- Set Mismatch
- First Missing Positive

---

# 10. Matrix

Problems

- Rotate Matrix
- Spiral Matrix
- Set Matrix Zeroes
- Search Matrix
- Transpose
- Flood Fill

---

# Complexity Comparison

| Pattern | Time | Space |
|----------|------|--------|
| Traversal | O(n) | O(1) |
| Frequency | O(n) | O(n) |
| Two Pointer | O(n) | O(1) |
| Sliding Window | O(n) | O(1) |
| Prefix Sum | O(n) | O(n) |
| Binary Search | O(log n) | O(1) |
| Hashing | O(n) | O(n) |
| Kadane | O(n) | O(1) |
| Cyclic Sort | O(n) | O(1) |

---

# Common Interview Mistakes

## Binary Search

❌

```java
mid=(low+high)/2;
```

✅

```java
mid=low+(high-low)/2;
```

---

## HashMap

❌

```java
containsValue()
```

When checking keys.

Use

```java
containsKey()
```

---

## Prefix Sum

Always initialize

```java
map.put(0,1);
```

when solving Subarray Sum Equals K.

---

## Sliding Window

Always remove the left element before expanding.

---

## Two Pointer

Update pointers correctly.

Otherwise, infinite loops may occur.

---

# Decision Tree

```text
Question

│

├── Sorted?

│      │

│      ├── Search → Binary Search

│      └── Pair → Two Pointer

│

├── Frequency?

│      │

│      └── HashMap

│

├── Continuous?

│      │

│      ├── Fixed → Sliding Window

│      └── Sum → Prefix Sum

│

├── Missing Number?

│      │

│      ├── 1...N → Cyclic Sort

│      └── Others → HashSet

│

└── Maximum Sum?

       │

       └── Kadane
```

---

# ⭐ Must Solve Problems

## Easy

- Largest Element
- Second Largest
- Reverse Array
- Move Zeroes
- Two Sum
- Remove Duplicates
- Contains Duplicate
- Missing Number
- Majority Element
- Merge Sorted Arrays

---

## Medium

- Product Except Self
- Maximum Subarray
- Rotate Array
- Longest Consecutive Sequence
- Count Pair Difference
- Count Pair Sum
- Subarray Sum Equals K
- Longest Subarray Sum K
- Merge Intervals
- Sort Colors

---

## Hard

- Trapping Rain Water
- First Missing Positive
- Sliding Window Maximum
- Median of Two Sorted Arrays
- Largest Rectangle
- Maximum Rectangle

---

# Revision Checklist

- ✅ Array Basics
- ✅ Complexity Analysis
- ✅ Traversal
- ✅ Frequency Counting
- ✅ Two Pointer
- ✅ Sliding Window
- ✅ Prefix Sum
- ✅ Binary Search
- ✅ Hashing
- ✅ Kadane
- ✅ Cyclic Sort
- ✅ Matrix
- ✅ Common Mistakes
- ✅ Pattern Recognition
- ✅ Top Interview Questions

---

## 📚 Recommended Learning Order

```text
Traversal
      ↓
Frequency Counting
      ↓
Hashing
      ↓
Two Pointer
      ↓
Sliding Window
      ↓
Prefix Sum
      ↓
Binary Search
      ↓
Kadane
      ↓
Cyclic Sort
      ↓
Matrix
      ↓
Advanced Problems
```

> 💡 **Pro Tip:** In interviews, don't memorize solutions. Learn to identify the underlying pattern. Most array problems are variations of the same 8–10 core techniques.