public class Match {

    private boolean match;
    private Card host_card;
    private Card guest_card;
    private int id;


    public Match(Card host_card, Card guest_card, boolean match, int id)
    { 
	this.match = match;
	this.host_card = host_card; 
	this.guest_card = guest_card; 
	this.id = id; 
    }
    
    public Card get_host_card()
    { 
	return host_card; 
    }
    
    public Card get_guest_card()
    { 
	return guest_card; 
    }
    
    public int get_id() 
    { 
	return id; 
    }
    
    public void set_host_card()
    { 
	this.host_card = host_card; 
    }
    
    public void set_guest_card()
    { 
	this.guest_card = guest_card;
    }
    
    public void set_id(int id) 
    { 
	this.id = id; 
    }     
    
}
