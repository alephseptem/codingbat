public String middleThree(String str) {
  int i = str.length() - 3;
  int x = i / 2;
  if (str.length() > 3)
  {
    return str.substring(x,str.length()-x);
  }
  return str;
}
