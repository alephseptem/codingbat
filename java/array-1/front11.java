public int[] front11(int[] a, int[] b) {
  int[] newarray = new int[2];
  int[] newarray2 = new int[1];
  if(a.length >= 1 && b.length >= 1)
  {
    newarray[0] = a[0];
    newarray[1] = b[0];
    return newarray;
  }
  if(a.length == 0 && b.length >= 1)
  {
    newarray2[0] = b[0];
    return newarray2;
  }
  if(b.length == 0 && a.length >= 1)
  {
    newarray2[0] = a[0];
    return newarray2;
  }
  return a;
}
