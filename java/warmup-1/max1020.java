public int max1020(int a, int b) {
  int largernumber;
  int smallernumber;
  if (a > b)
  {
    largernumber = a;
    smallernumber = b;
  }
  else
  {
    largernumber = b;
    smallernumber = a;
  }
  if (largernumber >= 10 && largernumber <=20)
  {
    return largernumber;
  }
  if (smallernumber >= 10 && smallernumber <= 20)
  {
    return smallernumber;
  }
  return 0;
}
