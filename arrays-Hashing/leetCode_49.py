"""
Given an array of strings strs, group the 
anagrams
 together. You can return the answer in any order.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
"""

class Solution:
    def groupAnagrams(self,strings):
        hashMap = {}
        for string in strings:
            key = "".join(sorted(string))
            if key in hashMap:
                hashMap[key].append(string)
            else:
                hashMap[key] = [string]
        return hashMap.values()

s = Solution()
print(s.groupAnagrams(["eat","tea","tan","ate","nat","bat"]))