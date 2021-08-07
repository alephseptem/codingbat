public boolean cigarParty(int cigars, boolean isWeekend) {
  if(cigars >= 40 && cigars <= 60 || isWeekend == true && cigars >= 40)
  {
    return true;
  }
  return false;
}
