import java.util.ArrayList;

public class Main
{
  public static void main(String[] args)
  {
    // setting up
    Agent stacey = new Agent("Stacey", "718-715-9345");
   
    Performer penny = new Performer("Penny", 20, stacey);
    Comedian derrick = new Comedian("Derrick", 17, stacey);
    Dancer carol = new Dancer("Carol", 19, stacey, 10);
    Performer jesse = new Performer("Jesse", 25, stacey);
    Comedian jack = new Comedian("Jack", 21, stacey);
    Dancer tony = new Dancer("Tony", 16, stacey, 8);

    //------ TESTING constructor ------
    System.out.println("----- TESTING constructor -----");
    Cabaret studio54 = new Cabaret("Studio 54");
    System.out.println(studio54.getName());
    System.out.println(studio54.getPerformers().size());


    //------ TESTING addPerformer method ------
    System.out.println("----- TESTING addPerformer method -----");
    System.out.println(studio54.addPerformer(penny));   // should print true
    System.out.println(studio54.addPerformer(derrick)); // should print true
    System.out.println(studio54.addPerformer(carol));   // should print true
    System.out.println(studio54.addPerformer(jesse));   // should print true
    System.out.println(studio54.addPerformer(jack));    // should print true
    System.out.println(studio54.addPerformer(tony));   // should print true
    System.out.println(studio54.addPerformer(tony));   // adding tony again; should print FALSE
   
    ArrayList<Performer> list = studio54.getPerformers();
    System.out.println(list.size());                    // should print 6
    System.out.println(list.get(2).getName());          // should print "Carol is a Dancer!"
    System.out.println(list.get(3).getName());          // should print "Jesse"


    //------ TESTING removePerformer method ------
    System.out.println("----- TESTING removePerformer method -----");
    System.out.println(studio54.removePerformer(jesse));// should print true
    System.out.println(list.size());                    // should print 5
    System.out.println(list.get(3).getName());          // should print "Jack"
    Comedian mark = new Comedian("Mark", 23, stacey);
    System.out.println(studio54.removePerformer(mark));// should print FALSE (because mark hasn't been added)


    //------ TESTING averagePerformerAge method ------
    System.out.println("----- TESTING averagePerformerAge method -----");
    double averageAge = studio54.averagePerformerAge();
    System.out.println(averageAge);                   // should print 18.6


    //------ TESTING performersOverAge method ------
    System.out.println("----- TESTING performersOverAge method -----");
    ArrayList<Performer> returned = studio54.performersOverAge(19);
    System.out.println(returned.size());              // should print 3
    System.out.println(returned.get(0).getName());    // should print Penny
    System.out.println(returned.get(1).getName());    // should print Carol is a dancer!
    System.out.println(returned.get(2).getName());    // should print Jack


    //------ TESTING groupRehearsal method ------
    System.out.println("----- TESTING groupRehearsal method -----");
    derrick.writeJoke("What do you give to a sick lemon? Lemon aid!");
    jack.writeJoke("What do you call a farm that makes bad jokes? Corny!");
    studio54.groupRehearsal();   // see Exploration for expected output


    //------ TESTING cabaretShow method ------
    System.out.println("----- TESTING cabaretShow method -----");
    studio54.cabaretShow();   // see Exploration for expected output

  }
}