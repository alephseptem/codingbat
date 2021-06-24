public String lastChars(String a, String b) {
  // 
  // 
  String firsthalf = "";
  String secondhalf = "";
  if (a.length() < 1)
  {
    firsthalf = "@";
  }
  else
  {
    firsthalf = a.substring(0,1);
  }
  if (b.length() < 1)
  {
    secondhalf = "@";
  }
  else
  {
    secondhalf = b.substring(b.length()-1);
  }
  return firsthalf + secondhalf;
}
