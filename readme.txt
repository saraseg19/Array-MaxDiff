Author: Sarai Segura
Date: 9/28/22

Description: Chapter 1, Question 33 

My inputs are int arrays, with lengths of multiples of 2. My output for each array is two subarrays, each subarray sums, and the differences between them. I used mergesort to sort the arrays, and then split an array once it was sorted. One subarray would contain the lower value integers, and the other would contain the higher value integers. Their sums would create the lowest possible sum and highest possible sum, and their difference would be the maximized. 

Time complexity: O(n log n)

Example:

The array is: [134, 38, 18, 155, 84, 88]
Our sublists are: [18, 38, 84] and [88, 134, 155]
The sum of [18, 38, 84] is: 140
The sum of [88, 134, 155] is: 377
Their difference is: 237

