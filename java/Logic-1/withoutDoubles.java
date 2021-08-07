public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  int sum = die1 + die2;
  if(noDoubles == true && die1 == die2)
  {
    sum = die1 + die2 + 1;
  }
  if(noDoubles == true && die1 == 6 && die2 == 6)
  {
    sum = 7;
  }
  return sum;
}
