public String endUp(String str) {
  int n = str.length();
  String capital;
  if (n >=3)
  {
    capital = str.substring(n-3,n);
    return str.substring(0,n-3) + capital.toUpperCase();
  }
  return str.toUpperCase();
}
