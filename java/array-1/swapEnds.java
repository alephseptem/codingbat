public int[] swapEnds(int[] nums) {
  int[]a = nums;
  int temp = nums[0];
  if(nums.length >= 1)
  {
    nums[0] = nums[nums.length-1];
    nums[nums.length-1] = temp;
  }
  
  return nums;
}
