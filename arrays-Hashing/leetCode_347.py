"""
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
"""

class Solution:
    def topKFrequent(self,nums,k):
        hashMap = {}
        for number in nums:
            if number in hashMap:
                hashMap[number] += 1
            else:
                hashMap[number] = 1
        ans = []
        sortedHashMap = sorted(hashMap.items(), key = lambda item : item[1], reverse=True)
        for i in range(k):
            ans.append(sortedHashMap[i][0])
        return ans

s = Solution()
print(s.topKFrequent([1,1,1,2,2,3], 2))