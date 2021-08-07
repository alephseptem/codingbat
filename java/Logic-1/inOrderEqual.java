public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  if(c > b && b > a || equalOk == true && a == b && c > a || equalOk == true && b == c && a < c || equalOk == true && a == b && a == c)
  {
    return true;
  }
  
  return false;
}
