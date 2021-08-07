public int teaParty(int tea, int candy) {
  int outcome = 0;
  if(tea >= 5 && candy >= 5)
  {
    outcome = 1;
  }
  if(tea >= 2 * candy || candy >= 2 * tea)
  {
    outcome = 2;
  }
  if(tea < 5 || candy < 5)
  {
    outcome = 0;
  }
  return outcome;
}
