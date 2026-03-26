package enums;

 enum AcctType {
  SAVINGS("AC01"),CURRENT("AC02");

  private String acode;

  private AcctType(String acode) {
    this.acode = acode;
}

  public String getAcode() {
    return acode;
}
 
}


