public boolean in3050(int a, int b) {
  boolean range1;
  boolean range2;
  if (a >= 30 && a <= 40 && b >= 30 && b <= 40)
  {
    range1 = true;
    return range1;
  }
  if (a >= 40 && a <= 50 && b >= 40 && b <=50)
  {
    range2 = true;
    return range2;
  }
  return false;
}
