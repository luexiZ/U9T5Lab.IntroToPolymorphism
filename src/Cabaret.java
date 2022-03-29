import java.util.ArrayList;

public class Cabaret {

    private String name;
    private ArrayList<Performer> performers ;

    public Cabaret(String name)
    {
        this.name = name;
        performers  = new ArrayList<Performer>();
    }

    public String getName()
    {
        return name;
    }
    public ArrayList<Performer> getPerformers()
    {
        return performers;
    }

    public boolean addPerformer(Performer p)
    {
        if(performers.contains(p))
        {
            return false;
        }
        else
        {
            performers.add(p);
            return true;
        }
    }

    public boolean removePerformer(Performer p)
    {
        if(performers.contains(p))
        {
            performers.remove(p);
            return true;
        }
        else
        {
            return false;
        }
    }

    public double averagePerformerAge()
    {
        double totalAge = 0;

        for(Performer p : performers)
        {
            totalAge += p.getAge();
        }
        return totalAge/performers.size();
    }

    public ArrayList<Performer> performersOverAge(int age)
    {
        ArrayList<Performer> temp = new ArrayList<Performer>();
        for(int i = 0;  i< performers.size(); i++)
        {
            if(performers.get(i).getAge() >= age)
            {
                temp.add(performers.get(i));
            }
        }
        return temp;
    }

    public void groupRehearsal()
    {
        for(Performer p : performers)
        {
            System.out.println("REHEARSAL CALL! " + p.getName());
            if(p instanceof Comedian)
            {
                ((Comedian)p).rehearse(false);

            }
            else
            {
                p.rehearse();
            }
        }
    }

    public void cabaretShow()
    {
        for(Performer p : performers)
        {
            System.out.println("Welcome to the cabaret! Next act up..." + p.getName());
            if(p instanceof Dancer)
            {
                ((Dancer)p).pirouette(2);
            }
            p.perform();
        }
    }
}
