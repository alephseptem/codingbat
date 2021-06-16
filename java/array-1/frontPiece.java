public int[] frontPiece(int[] nums) {
  int[] newarray = new int[2];
  if(nums.length > 2)
  {
    newarray[0] = nums[0];
    newarray[1] = nums[1];
    return newarray;
  }
  return nums;
}
