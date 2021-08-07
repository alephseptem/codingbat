public int redTicket(int a, int b, int c) {
  int result = 0;
  if(a == b && b == c & c == a)
  {
    result = 5;
  }
  if(a == 2 && b == 2 && c == 2)
  {
    result = 10;
  }
  if(a != b && a != c)
  {
    result = 1;
  }
  
  return result;
}
