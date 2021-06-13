public int[] makeLast(int[] nums) {
  int twiceLength = nums.length * 2;
  int[] newarray = new int[twiceLength];
  newarray[newarray.length-1] = nums[nums.length-1];
  
  return newarray;
}
