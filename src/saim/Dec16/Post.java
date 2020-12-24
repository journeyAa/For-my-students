package saim.Dec16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {

    private String body;
    private final String dateTime;

    public Post(String body){
        this.body = body;

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a");
        this.dateTime = dateTime.format(formatter);

    }

    public String getDateTime(){
        return dateTime;
    }

    public String getBody(){
        return body;
    }

    public void setBody(String body){
        this.body = body;
    }








}
