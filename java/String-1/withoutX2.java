public String withoutX2(String str) {
//xabc
//axbc
//xxbc
//xaxb

  if (str.equals("x") || str.equals("xx") || str.equals(""))
  {
    return "";
  }
  if (str.charAt(0) == 'x' && str.charAt(1) == 'x')
  {
    str = str.substring(2);
  }
  if (str.charAt(0) == 'x')
  {
    return str.substring(1);
  }
  if (str.charAt(1) == 'x')
  {
    str = str.substring(0,1) + str.substring(2);
  }
  return str;
}
