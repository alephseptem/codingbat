public boolean posNeg(int a, int b, boolean negative) {
  if (a < 0 && b >= 0 && negative == false || b < 0 && a >= 0 && negative == false)
  {
    return true;
  }
  if (a < 0 && b < 0 && negative == true)
  {
    return true;
  }
  return false;
}
