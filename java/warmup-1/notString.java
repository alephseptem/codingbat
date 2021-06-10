public String notString(String str) {
  String not = "not ";
  if (str.length() >= 3)
  {
    if (str.substring(0,3).equals("not"))
    {
      return str;
    }
  }
  return not + str;
}
