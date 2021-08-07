public boolean less20(int n) {
  int mod = n % 20;
  if(20 - mod == 1 || 20 - mod == 2)
  {
    return true;
  }
  return false;
}
