public int intMax(int a, int b, int c) {
  int ans = a;
  if (a > b && a > c)
  {
    return ans;
  }
  if (b > ans)
  {
    ans = b;
  }
  if (c > ans)
  {
    ans = c;
  }
  return ans;
}
