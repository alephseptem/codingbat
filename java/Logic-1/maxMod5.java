public int maxMod5(int a, int b) {
  int largest = 0;
  int smallest = 0;
  if(a > b)
  {
    largest = a;
    smallest = b;
  }
  if(b > a)
  {
    largest = b;
    smallest = a;
  }
  if(a % 5 == b % 5)
  {
    return smallest;
  }
  if(a == b)
  {
    return 0;
  }
  return largest;
}
