public boolean lastDigit(int a, int b) {
  if (a % 10 == b || b % 10 == a)
  {
    return true;
  }
  return false;
}
