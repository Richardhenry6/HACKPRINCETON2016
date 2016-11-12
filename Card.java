public class Card {
private int id;  //the meal card ID (located in upper right corner of image)
private int type; //-1 if a guest card; 1 if a host card
private String host_Name; //host name (the one )
private String guest_Name;
private int host_PID;
private int guest_PID;
private int host_SSN;
private int guest_SSN;
private char meal; // I don’t think this is necessary... if it is, this is wrong
private Date date; // (Date.java)
//Image picture; <- what class is this?

//Default Constructor
public Card() {

    int id = 0;
    int type = 0;
    String host_Name = null;
    String guest_Name = null;
    int host_PID = 0;
    int guest_PID = 0;
    int host_SSN = 0;
    int guest_SSN = 0;
    char meal = '\0';
    Date date = null;
}

//Complete Constructors
//for all ints
public Card(int id, int type, int host_PID, int guest_PID, int host_SSN, int guest_SSN){

    this.id = id;
    this.type = type;
    this.host_PID = host_PID;
    this.guest_PID = guest_PID;
    this.host_SSN = host_SSN;
    this.guest_SSN = guest_SSN;
}

//Strings, Meal, and Date constructor
public Card(String host_Name, String guest_Name, char meal, Date date) {
    this.host_Name = host_Name;
    this.guest_Name = guest_Name;
    this.meal = meal;
    this.date = date;
}

//Accessors
public int get_id() { return id; }
public int get_type(){ return type; }
public int get_host_PID(){ return host_PID; }
public int get_guest_PID(){ return guest_PID; }
public int get_host_SSN(){ return host_SSN; }
public int get_guest_SSN(){ return guest_SSN; }
public String get_host_Name(){ return host_Name; }
public String get_guest_Name(){ return guest_Name; }
public Date get_date(){ return date; }
public char get_meal(){ return meal; }

//Mutators
public void set_id(int id) { this.id = id; }
public void set_type(int type) { this.type = type; }
public void set_host_PID(int pid ) { host_PID = pid; }
public void set_guest_PID(int pid ) { guest_PID = pid; }
public void set_host_SSN(int num) { host_SSN = num; }
public void set_guest_SSN(int num) { guest_SSN = num; }
public void set_host_Name(String name) { host_Name = name; }
public void set_guest_Name(String name) { guest_Name = name; }
public void set_date(Date date) { this.date = date; }
public void set_meal(char meal) { this.meal = meal; }

//Sorting
/*Compares this card to the specified date (work in progress...)

public boolean equals(Other other) {
    if (other == this) return true;
    if (other == null) return false;
    if (other.getClass() != this.getClass()) return false;
    Card that = (Card) other;
    return (this.id == that.id);
}
*/

//based off of ID
public int compareTo(Card that) {
        if (this.id  < that.id)  return -1;
        if (this.id  > that.id)  return +1;
        return 0;
    }
}
