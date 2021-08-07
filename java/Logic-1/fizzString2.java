public String fizzString2(int n) {
  String convertnum = String.valueOf(n);
  if(n % 3 == 0)
  {
    convertnum = "Fizz";
  }
  if(n % 5 == 0)
  {
    convertnum = "Buzz";
  }
  if(n % 3 == 0 && n % 5 == 0)
  {
    convertnum = "FizzBuzz";
  }
  return convertnum + "!";
}
