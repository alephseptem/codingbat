public String middleTwo(String str) {
  int n = str.length();
  // string firsthalf = "";
  // string secondhalf = "";
  if (str.length() > 2)
  {
    return str.substring((n/2)-1,str.length()-((n/2)-1));
  }
  return str;
}
