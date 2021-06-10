public String everyNth(String str, int n) {
  String part = "";
  for (int i = 0; i < str.length(); i=i+n)
  {
    part = part + str.substring(i,i+1);
  }
  return part;
}
