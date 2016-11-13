public class MatchUnmatch 
{
    public static void main(String[] args)  
    { 
	Queue<Card> cards = new Queue<Card>(); 
	SeparateChainingHashST<Int,Match> list = new SeparateChainingHashST<Int,Match>(); 
	for(Card c: cards) 
	    {
		Match m;
		int key = c.get_id(); 
		if(!list.contains(key)) //put in new match object
		    {
			m = new Match();
			m.set_card1(c);
		    }
		else //update old match object
		    {
			m = list.get(key);
			if(!m.isMatch()) //complete match  
			    { 
				m.set_card2(c); 
			    }
			else //make new unmatch oblect
			    { 
				m = new Match(); 
				m.set_card1(c); 
			    }
		    } // 
		list.put(c.get_id(), m);
	    } 	
    } 
}
