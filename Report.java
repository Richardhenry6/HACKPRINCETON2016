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
            PrintWriter print = new PrintWriter("Unmatched.txt", "UTF-8");
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
        String ret = "ID: " + card.get_id() + " Host: " + card.get_host_Name() +
            " Guest: " + card.get_guest_Name() + " Host PID: " + card.get_host_PID()
            + " Guest PID: " + card.get_guest_PID() + " Host SSN: " + card.get_host_SSN()
            + " Guest Host SSN: "+ card.get_guest_SSN() + " Date: " + card.get_date() +
            " Meal Type: " + card.get_meal();
        return(ret);
    }
    public static void main(String[] args)
    {
        Queue<Card> q = new Queue<Card>();
        Date date = new Date(1,2,2016);
        Date date1 = new Date(1,4,2016);
        Card card = new Card(1,1,"host","guest",25,21,23,43,'b', date, null, null);
        Card card1 = new Card(2,2,"host","g",26,24,22,44,'c', date1, null, null);
        q.enqueue(card);
        q.enqueue(card1);
        printToFile(q);
    }
}
