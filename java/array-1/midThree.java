public int[] midThree(int[] nums) {
  int[] newarray = new int[3];
  int l = nums.length;
  int index = l - 3;
  int offset = l/2;
  if (nums.length > 3)
  {
    newarray[0] = nums[offset-1];
    newarray[1] = nums[offset];
    newarray[2] = nums[offset+1];
    return newarray;
  }
  return nums;
}
