import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello, %s, it is nice to see you!", name);
    }

    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. It is lovely to see you", dayPeriod, name);
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "The date is " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        //if the index doesn't equal -1 than that means it does in fact exist
        if (conversation.indexOf("Alexis") != -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.indexOf("Alfred") != -1) {
            return "At your service. As you wish, naturally";
        } else {
            return "Right. And with that, I shall retire";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

