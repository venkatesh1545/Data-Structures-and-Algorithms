/*
Problem Statement: Count Elements in an Array

Given an array of integers, write a function to count the occurrences of each element in the array and print the counts.

Input: [1, 2, 3, 2, 1, 3, 4, 5, 4]
Output:
Element 1 occurs 2 times.
Element 2 occurs 2 times.
Element 3 occurs 2 times.
Element 4 occurs 2 times.
Element 5 occurs 1 times.

*/
#include <iostream>
#include <unordered_map>
#include <vector>

void countElements(const std::vector<int>& arr) {
    std::unordered_map<int, int> countMap;

    // Iterate through the array and update counts in the unordered_map
    for (int num : arr) {
        countMap[num]++;
    }

    // Print the counts of elements
    for (auto pair : countMap) {
        std::cout << "Element " << pair.first << " occurs " << pair.second << " times.\n";
    }
}

int main() {
    std::vector<int> arr = {1, 2, 3, 2, 1, 3, 4, 5, 4};
    countElements(arr);

    return 0;
}
