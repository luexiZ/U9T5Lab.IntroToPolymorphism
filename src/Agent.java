public class Agent
{
  private String name;
  private String cellPhoneNum;
  
  public Agent(String name, String cellPhoneNum)
  {
    this.name = name;
    this.cellPhoneNum = cellPhoneNum;
  }
  
  public String getName()
  {
    return name;
  }
  
  public String getCellPhoneNum()
  {
    return cellPhoneNum;
  }
}