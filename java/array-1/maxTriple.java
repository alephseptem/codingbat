public int maxTriple(int[] nums) {
  int offset = (nums.length - 1) / 2;
  int first = nums[0];
  int middle = nums[offset];
  int last = nums[nums.length-1];
  int largest = nums[0];
  if(first > middle && first > last)
  {
    largest = first;
  }
  if(middle > first && middle > last)
  {
    largest = middle;
  }
  if(last > middle && last > first)
  {
    largest = last;
  }
  return largest;
}
