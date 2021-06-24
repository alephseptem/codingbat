public String withoutX(String str){
if (str.equals("x"))
{
  return "";
}
if (str.length() > 1)
  {
    if (str.substring(0,1).equals("x"))
    {
      str = str.substring(1,str.length());
    }
    if (str.charAt(str.length()-1) == 'x')
    {
      str = str.substring(0,str.length()-1);
    }
  }
  return str;
}
