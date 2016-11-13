import java.io.PrintWriter;

public class Report{

    private Report()
    {
        return;
    }
    public static void printToFile(Queue<Card> q)
    {
        try
        {
            PrintWriter print = new PrintWriter("Unmatched.csv", "UTF-8");
            print.println("ID,HOST NAME,GUEST NAME,HOST PID,GUEST PID,HOST SSN,GUEST SSN,MEAL,DATE,DINNING HALL,CLUB");
            int len = q.size();
            for(int i = 0; i < len; i++)
            {
                print.println(printSetup(q.dequeue()));
            }
            print.close();


        } catch (Exception e) {

        }

    }
    private static String printSetup(Card card)
    {
        String ret = card.get_id() + "," + card.get_dining_Name() +
            "," + card.get_club_Name() + "," + card.get_dining_PID()
            + "," + card.get_club_PID() + "," + card.get_dining_SSN()
            + ","+ card.get_club_SSN() + "," + card.get_meal() + "," + card.get_date() +
            "," + card.get_dining_location() + "," +  card.get_club_location();
        return(ret);
    }
    public static void main(String[] args)
    {
        Queue<Card> q = new Queue<Card>();
        Date date = new Date(1,2,2016);
        Date date1 = new Date(1,4,2016);
        Date date2 = new Date(1,4,2016);
        Card card = new Card(1,1,"host","guest",25,21,23,43,'b', date, "Sdf", "FFFFF");
        Card card1 = new Card(2,2,"host","g",26,24,22,44,'c', date1, "yeet", "Dfsdfcccc");
         Card card2 = new Card(2,2,"host","g",26,24,22,44,'c', date2, "yeet", "Dfsdgcccc");
        q.enqueue(card);
        q.enqueue(card1);
        q.enqueue(card2);
        printToFile(q);
    }
}
