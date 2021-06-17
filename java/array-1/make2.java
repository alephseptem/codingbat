public int[] make2(int[] a, int[] b) {
  int[] newarray = new int[2];
  if(a.length >= 2)
  {
    newarray[0] = a[0];
    newarray[1] = a[1];
    return newarray;
  }
  if(b.length >= 2 && a.length == 0)
  {
    newarray[0] = b[0];
    newarray[1] = b[1];
  }
  if(a.length > 0 && b.length > 0)
  {
    newarray[0] = a[0];
    newarray[1] = b[0];
  }

  return newarray;
}

