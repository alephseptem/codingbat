public String comboString(String a, String b) {
  String shorter = "";
  String longer = "";
  if (a.length() > b.length())
  {
    longer = longer + a;
    shorter = shorter + b;
  }
  else
  {
    longer = longer + b;
    shorter = shorter + a;
  }
  return shorter + longer + shorter;
}
