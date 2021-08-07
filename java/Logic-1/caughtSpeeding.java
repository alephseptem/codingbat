public int caughtSpeeding(int speed, boolean isBirthday) {
  int result = 0;
  if(isBirthday == false)
  {
    if(speed <= 60)
    {
      result = 0;
    }
    if(speed >= 61 && speed <= 80)
    {
      result = 1;
    }
    if(speed >= 81)
    {
      result = 2;
    }
  }
  if(isBirthday == true)
  {
    if(speed <= 65)
    {
      result = 0;
    }
    if(speed >= 66 && speed <= 86)
    {
      result = 1;
    }
    if(speed >= 86)
    {
      result = 2;
    }
  }
  
  return result;
}
