public int[] reverse3(int[] nums) {
  int[] nums_modified = {0,0,0};
  nums_modified[0] = nums[2];
  nums_modified[1] = nums[1];
  nums_modified[2] = nums[0];
  return nums_modified;
}
