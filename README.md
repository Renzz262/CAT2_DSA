# Q1:  Big O Notation in Algorithm Analysis

The Big O notation is a way to measure the efficicency of an algorithm by describing the maximum time it might take, depending on input size. Essentially, it gives an idea of how well an algorithm handles larger datasets and how its performance changes as the input grows.

# Examples & Rules 

1. Abstracting Constants:
   When evaluating the efficiency of an algorithm, the constant factors are left out since they do not impact how quickly an algorithm's performance grows with larger inputs. For example, if an algorithm takes 3n steps, it is simplified to O(n) since the constant multiplier 3 does not afect the overall growth pattern. 

2. Dropping Lower Order Terms:
   When analyzing algorithms, only the term with the fastest growth rate matters. The lower ordered items are ignored due to them becoming insignificant as the input size increases. For instance, if an algorithm has a runtime of n² + n, it is simplified to O(n²) since n² grows much faster than n with larger inputs.
3. Worst-Case Analysis:
   Worst-case analysis with Big O notation focuses on the most challenging situations an algorithm might face. This ensures its performance remains reliable under maximum demand.An example is in a linear search, when the best case is O(1) when the target is at the start, the worst case is O(n) when the target is at the end.
   
4. Comparison of Algorithms:
   The big O notation assists us in comparing algorithms by simplifying things, ignoring details like constants. For example, an algorithm that works in  O(n log n) time is generally more efficient and faster than one in O(n²) time when dealing with significantly large inputs

5. Simplification and Focus on Asymptotic Behaviour:
The Big O notation simplifies the comparison of algorithm efficiencies by focusing on how performance scales with input size, rather than precise operation counts.
   > This abstraction helps in understanding algorithm performance regardless of hardware or implementation differences.


# Q2: Differences Between Arrays and Linked Lists

Arrays and linked lists differ in several key ways. Ho they manage memory, how efficiently/smoothly they perform and how they handle adding or removing elements. Arrays use a fixed memory block and are faster when accessing elements. On the other hand, linked lists grown dynamically and are better suited for insertions and deletions.

# 1. Memory Allocation

Arrays allocate memory in a single, continuous block and have a fixed size when created. Dynamic arrays in some programming languages can resize, but they achieve this by creating a new array and copying over data.

In contrast, linked lists allocate memory dynamically for each individual node. These nodes are dispersed across memory and are connected by pointers or references to the next node.

# 2. Performance

Arrays:
  i)Access Time: Provides constant time O(1) access to elements using an index.

 ii) Insertion/Deletion: Inserting or deleting elements (especially in the middle) requires shifting subsequent elements, leading to a worst-case performance of O(n).
  
Linked Lists:
 i) Access Time: Requires traversal from the head to the desired node, resulting in O(n) time for random access.

 ii) Insertion/Deletion: Generally more efficient for operations at the beginning or when the node reference is known, as these can be done in O(1) time by updating pointers. However, finding the insertion point might still take O(n) time if a search is needed.

# 3. Insertion and Deletion Operations

Arrays:
 i) Insertion: Adding an element (especially in the middle) involves shifting elements to accommodate the new value.

 ii) Deletion: Removing an element also requires shifting elements to fill the gap.
 
  These operations are less efficient compared to linked lists when frequent modifications are required.
  
Linked Lists:
 i) Insertion: Can be performed at the beginning in constant time O(1) if you have a pointer to the head. Inserting at other positions requires locating the previous node, which is O(n) in the worst case.

 ii) Deletion: Removing the first node is O(1). Deleting a node from the middle or end also requires finding the preceding node, so it might take O(n) time.
  
To conclude, arrays offer quick random access due to neighbouring memory allocation. Linked lists on the other hand offer more insertions and deltions at the begginning or when working with dynamic data where frequent modifications are needed.   
