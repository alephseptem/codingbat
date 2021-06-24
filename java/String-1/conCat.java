public String conCat(String a, String b) {
  String combined = a + b;
  if (a.length() > 0 && b.length() > 0)
  {
    String last = a.substring(a.length()-1);
    String first = b.substring(0,1);
    if (last.equals(first))
    {
      combined = a + b.substring(1);
    }
  }
  
  return combined;
}
