public String minCat(String a, String b) {
  int difference = 0;
  if (a.length() > b.length())
  {
    difference = a.length() - b.length();
    a = a.substring(difference);
  }
  else
  {
    difference = b.length() - a.length();
    b = b.substring(difference);
  }
  return a + b;
}
