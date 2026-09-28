#include <stdlib.h>
#include <limits.h>

// Comparison function for qsort
int cmp(const void *a, const void *b) {
    return *(int*)a - *(int*)b;
}

int threeSumClosest(int* nums, int numsSize, int target) {
    // Sort the array to use two-pointer technique
    qsort(nums, numsSize, sizeof(int), cmp);

    int closestSum = nums[0] + nums[1] + nums[2];  // Initial sum

    for (int i = 0; i < numsSize - 2; i++) {
        int left = i + 1;
        int right = numsSize - 1;

        while (left < right) {
            int currentSum = nums[i] + nums[left] + nums[right];

            // Update closest sum if the current one is closer
            if (abs(currentSum - target) < abs(closestSum - target)) {
                closestSum = currentSum;
            }

            if (currentSum < target) {
                left++;
            } else if (currentSum > target) {
                right--;
            } else {
                // Exact match found
                return currentSum;
            }
        }
    }

    return closestSum;
}