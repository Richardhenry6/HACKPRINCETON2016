import java.io.PrintWriter;

public class Report{

    void getthisout(Queue<Card> q)
    {
        try
        {
            PrintWriter print = new PrintWriter("Unmatched.txt", "UTF-8");
            int len = q.size(); 
            for(int i = 0; i < len; i++)
            {
                print.println(setitup(q.dequeue()));
            }
            print.close();
            
        } catch (Exception e) {
   
        }
    
    }
    String setitup(Card card)
    {
        String ret = "ID: " + card.id + " Host: " + card.host_Name + " Guest: " +
            card.guest_Name + " Host PID: " + card.host_PID + " Guest PID: " + 
            card.guest_PID + " Host SSN: " + card.host_SSN + " Guest Host SSN: "+ 
            card.guest_SSN + " Date: " + card.date;
        return(ret);
    }
    public static void main(String[] args) 
    {
        
        
    }
}