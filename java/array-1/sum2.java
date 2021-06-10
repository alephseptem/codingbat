public int sum2(int[] nums) {
  int sum = 0;
  if(nums.length >= 2)
  {
    sum = sum + nums[0] + nums[1];
  }
  if(nums.length < 1)
  {
    return 0;
  }
  if(nums.length < 2)
  {
    sum = nums[0];
  }
  return sum;
}
