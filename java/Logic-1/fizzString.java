public String fizzString(String str) {
  String newString = "";
  if(str.substring(0,1).equals("f") && str.substring(str.length()-1).equals("b"))
  {
    newString = "FizzBuzz";
    return newString;
  }
  if(str.substring(0,1).equals("f"))
  {
    newString = "Fizz";
    return newString;
  }
  if(str.substring(str.length()-1).equals("b"))
  {
    newString = "Buzz";
    return newString;
  }
  
  return str;
}
