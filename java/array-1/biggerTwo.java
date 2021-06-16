public int[] biggerTwo(int[] a, int[] b) {
  int a_sum = a[0] + a[1];
  int b_sum = b[0] + b[1];
  int[] largest = new int[2];
  if(a.length == 2 && b.length == 2)
  {
    if(a_sum > b_sum)
    {
      largest = a;
    }
    if(b_sum > a_sum)
    {
      largest = b;
    }
    if(a_sum == b_sum)
    {
      largest = a;
    }
  }
  return largest;
}
