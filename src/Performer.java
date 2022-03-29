public class Performer
{
  private String name;
  private int age;
  private int performances;
  private Agent agent;
  
  public Performer(String name, int age, Agent agent)
  {
    this.name = name;
    this.age = age;
    this.agent = agent;
    performances = 0;
  }
  
  public String getName()
  {
    return name;
  }
  
  public int getAge()
  {
    return age;
  }
  
  public int getPerformances()
  {
    return performances;
  }
  
  public Agent getAgent()
  {
    return agent;
  }
  
  public void perform()
  {
    performances++;
    System.out.println("Performing for an audience! Performance #" + performances);
  }
  
  public void rehearse()
  {
    System.out.println("Rehearsing for the big show!");
  }
  
  public void callAgent()
  {
    System.out.println("I am calling my agent! Siri, call " + agent.getName());
  }
  
  public void printInfo()
  {
    System.out.println("Hi my name is " + name);
    System.out.println("I am " + age + " years old.");
    System.out.println("I have given " + performances + " performances!");
    if (isExperienced())
    {
      System.out.println("I am experienced");
    }
    else
    {
      System.out.println("I am just getting started");
    }
  }
  
  // private helper method
  private boolean isExperienced()
  {
    return performances >= 5;
  }
}
