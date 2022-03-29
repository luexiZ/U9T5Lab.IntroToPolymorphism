import java.util.ArrayList;

public class Comedian extends Performer
{
  private ArrayList<String> jokes;
  
  public Comedian(String name, int age, Agent agent)
  {
    super(name, age, agent);
    jokes = new ArrayList<String>();
  }
  
  public void writeJoke(String joke)
  {
    jokes.add(joke);
  }
  
  @Override
  public void callAgent()
  {
    System.out.println("Let me run this new joke past my agent! Siri, dial " + getAgent().getCellPhoneNum());
  }

  @Override
  public void perform()
  {
    super.perform();
    for (String joke : jokes)
    {
      System.out.println(joke);
    }
  }

  @Override
  public void printInfo()
  {
    super.printInfo();
    System.out.println("I will make you laugh!");
  }
  
  public void rehearse(boolean performAfter)
  {
    rehearse();
    
    if (performAfter)
    {
      this.perform();
    }
  }
}