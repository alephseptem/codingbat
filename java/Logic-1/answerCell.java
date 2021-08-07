public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if(isAsleep)
  {
    return false;
  }
  if(isMorning == true && isMom == true)
  {
    return true;
  }
  if(isMorning == false && isMom == false && isAsleep == false)
  {
    return true;
  }
  if(isMorning == false && isMom == true && isAsleep == false)
  {
    return true;
  }
  
  return false;
}
