package defconbot;
public class Session {
    String speaker = "x";
    String location  =  "x";
    String time      = "x";
    String title     = "x";
    public void setSpeaker(String speaker){
        this.speaker = speaker;
    }  
    public String getSpeaker(){
        return speaker;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return location;
    }
    public void setTime(String time){
        this.time = time;
    }
    public String getTime(){
        return time;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
}
