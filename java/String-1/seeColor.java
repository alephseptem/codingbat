public String seeColor(String str) {
  if (str.length() > 3)
  {
    if (str.substring(0,3).equals("red"))
    {
      return str.substring(0,3);
    }
    if (str.substring(0,4).equals("blue"))
    {
      return str.substring(0,4);
    }
  }
  else if (str.equals("red"))
  {
    return str;
  }
  return "";
}
