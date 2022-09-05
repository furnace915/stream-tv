package stream.tv;

public class Streamer {
    public String play(Content content) {

           if(content.getSubclassification() == "Rerun"){
               return new StringBuilder()
                       .append("playing ")
                       .append(content.getClassification())
                       .append(": ")
                       .append(content.getSubclassification())
                       .append(" - ")
                       .append(content.getName()).toString();
           }else {
               return "upgrade your plan to access this content";
           }


    }
}
