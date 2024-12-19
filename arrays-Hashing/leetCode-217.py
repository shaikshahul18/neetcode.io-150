#Contains Duplicate

"""
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Ex : nums = [1,2,3,1]
output : True
"""


class Solution:
    def containsDuplicate(self, nums):
        elements = set()
        for number in nums:
            if number not in elements:
                elements.add(number)
            else:
                return True
        return False

s = Solution()
print(s.containsDuplicate([1,2,3,1]))