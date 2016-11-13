public class Card {
private int id;  //the meal card ID (located in upper right corner of image)
private int type; //-1 if a club card; 1 if a dining card
private String dining_Name; //dining name (the name of the person from the dining hall )
private String club_Name; //club name (the name of the person from the eating club )
private int dining_PID;
private int club_PID;
private int dining_SSN;
private int club_SSN;
private char meal; 
private Date date; // (Date.java)
private String dining_location;
private String club_location;
//Image picture; <- what class is this?

//Default Constructor
public Card() {

    int id = 0;
    int type = 0;
    String dining_Name = null;
    String club_Name = null;
    int dining_PID = 0;
    int club_PID = 0;
    int dining_SSN = 0;
    int club_SSN = 0;
    char meal = '\0';
    Date date = null;
    String dining_location = null;
    String club_location = null;
}

//Complete Constructors
public Card(int id, int type, String dining_Name, String club_Name, int dining_PID, int club_PID, int dining_SSN, int club_SSN,char meal, Date date, String dining_location, String club_location)
{
    this.id = id;
    this.type = type;
    this.dining_PID = dining_PID;
    this.club_PID = club_PID;
    this.dining_SSN = dining_SSN;
    this.club_SSN = club_SSN;
    this.dining_Name = dining_Name;
    this.club_Name = club_Name;
    this.meal = meal;
    this.date = date;
    this.dining_location = dining_location;
    this.club_location = club_location;
}

//Accessors
public int get_id() { return id; }
public int get_type(){ return type; }
public int get_dining_PID(){ return dining_PID; }
public int get_club_PID(){ return club_PID; }
public int get_dining_SSN(){ return dining_SSN; }
public int get_club_SSN(){ return club_SSN; }
public String get_dining_Name(){ return dining_Name; }
public String get_club_Name(){ return club_Name; }
public Date get_date(){ return date; }
public char get_meal(){ return meal; }
public String get_dining_location(){ return dining_location; }
public String get_club_location(){ return club_location; }

//Mutators
public void set_id(int id) { this.id = id; }
public void set_type(int type) { this.type = type; }
public void set_dining_PID(int pid ) { dining_PID = pid; }
public void set_club_PID(int pid ) { club_PID = pid; }
public void set_dining_SSN(int num) { dining_SSN = num; }
public void set_club_SSN(int num) { club_SSN = num; }
public void set_dining_Name(String name) { dining_Name = name; }
public void set_club_Name(String name) { club_Name = name; }
public void set_date(Date date) { this.date = date; }
public void set_meal(char meal) { this.meal = meal; }
public void set_dining_location(){ this.dining_location = dining_location; }
public void set_club_location(){ this.club_location = club_location; }

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
