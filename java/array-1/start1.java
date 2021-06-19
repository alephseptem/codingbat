public int start1(int[] a, int[] b) {
  int count = 0;
  if(a.length == 0 && b.length == 0)
  {
    return count;
  }
  if(b.length == 0 && a[0] == 1 || a.length == 0 && b[0] == 1)
  {
    count = 1;
    return count;
  }
  if(a[0] == 1 && b[0] == 1)
  {
    count = 2;
    return count;
  }
  if(a.length >= 1 && b.length >= 1)
  {
    
    if(a[0] == 1 ||  b[0] == 1)
    {
      count = 1;
      return count;
    }
  }
  return count;
}
