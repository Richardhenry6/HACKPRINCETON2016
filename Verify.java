public class Verify 
{
    
    private Verify()
    {
        return;
    }
       
//SeparateChainingHashST<int, Queue<Card>)
public static void verify(SeparateChainingHashST<Integer, Match> q, Queue<Match> mat, Queue<Match> unmat)
{
    for (int num : q.keys())
    {   
        Match match = q.get(num);
        if(match.isMatch())
        {
            mat.enqueue(q.get(num));
        }
        else
        {
            unmat.enqueue(q.get(num));
        }
    }
}
/*public static void main(String[] args) 
    {
       Queue<Match> mat = new Queue<Match>();
       Queue<Match> unmat = new Queue<Match>();
       Date date = new Date(1,2,2016);
        Date date1 = new Date(1,5,2016);
        Date date2 = new Date(1,6,2016);
        Date date3 = new Date(1,7,2016);
       SeparateChainingHashST<Integer,Match>  q = new SeparateChainingHashST<Integer,Match> (4);
      Card card = new Card(1,1,"host","guest",25,21,23,43,'b', date);
       Card card1 = new Card(1,2,"host","g",26,24,22,44,'c', date1);
       Card card2 = new Card(2,1,"host","guest",25,21,23,43,'b', date);
       Card card3 = new Card(2,2,"host","g",26,24,22,44,'c', date1);
      Match match1 = new Match(card1, card2, true, 1);
       Match match2 = new Match(card2, card3, true, 2);
       q.put(1,match1);
       q.put(2,match2);
       verify(q, mat, unmat);
       System.out.println(mat.size());
       System.out.println(unmat.size());
    }*/
}
