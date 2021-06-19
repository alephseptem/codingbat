public int[] makeMiddle(int[] nums) {
  int end = nums.length / 2;
  int beginning = end-1;
  if (nums.length > 2)
  {
    int[] newarray = {nums[beginning], nums[end]};
    return newarray;
  }
  return nums;
}
