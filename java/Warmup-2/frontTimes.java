public String frontTimes(String str, int n) {
  String result = "";
  if(str.length() >= 3)
  {
    String front = str.substring(0,3);
    for(int i = 0; i < n; i++)
    {
      result = result + front;
    }
  }
  else
  {
    for(int i = 0; i < n; i++)
    {
      result = result + str;
    }
  }
  return result;
}
