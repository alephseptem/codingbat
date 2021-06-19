public int[] makeEnds(int[] nums) {
  int[] newarray = new int[2];
  if(nums.length == 1)
  {
    newarray[0] = nums[0];
    newarray[1] = nums[0];
    return newarray;
  }
  if(nums.length > 2)
  {
    newarray[0] = nums[0];
    newarray[1] = nums[nums.length-1];
    return newarray;
  }

  return nums;
}
