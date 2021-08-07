public int greenTicket(int a, int b, int c) {
  int result = 0;
  if(a == b && b == c)
  {
    return 20;
  }
  if(a == b || a == c || b == c)
  {
    return 10;
  }
  return result;
}
