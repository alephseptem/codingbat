public int sumLimit(int a, int b) {
  int sum = a + b;
  String a_string = String.valueOf(a);
  String sum_string = String.valueOf(sum);
  int a_digits = a_string.length();
  int sum_digits = sum_string.length();
  if(sum_digits > a_digits)
  {
    return a;
  }
  return sum;
}
