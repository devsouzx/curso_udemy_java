package sections.section13.exercise2;

import sections.section13.exercise2.entities.Comment;
import sections.section13.exercise2.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
  public static void main(String[] args) throws ParseException {
    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    Comment c1 = new Comment("Have a nice trip");
    Comment c2 = new Comment("Wow that's awesome!");
    Post p1 = new Post(
            sdf1.parse("21/06/2018 13:05:44"),
            "Traveling to New Zealand",
            "I'm going to visit this wonderful country!",
            12);
    p1.addComment(c1);
    p1.addComment(c2);
    System.out.println(p1);
  }
}
