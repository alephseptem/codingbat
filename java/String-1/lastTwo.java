public String lastTwo(String str) {
  int n = str.length();
  if (n > 1)
  {
    return str.substring(0,str.length()-2) + str.charAt(n-1) + str.charAt(n-2);
  }
  else
  {
    return str;
  }
}
