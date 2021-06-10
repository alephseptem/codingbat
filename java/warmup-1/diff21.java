public int diff21(int n) {
  int ans;
  if (21 - n > 0)
  {
    ans = 21 - n;
    return ans;
  }
  if (n > 21)
  {
    ans = -2 * (21 - n);
    return ans;
  }
  if (21 - n == 0)
  {
    ans = 21 - n;
    return ans;
  }

  return 0;
}
