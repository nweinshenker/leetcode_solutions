class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        max_sum_of_min_pair = sum( [ x for x in sorted(nums)[::+2] ] )
            
        return max_sum_of_min_pair