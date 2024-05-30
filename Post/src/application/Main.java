package application;

import entities.Comment;
import entities.Post;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Post p1 = new Post(LocalDateTime.parse("26/02/2013 13:05:44", fmt), "Traveling to the Brazil", "I'm going to visit this country!", 12);
        Post p2 = new Post(LocalDateTime.parse("27/07/2018 13:05:44", fmt), "Good night guys", "See you tomorrow!", 5);

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome");
        Comment c3 = new Comment("Good Night");
        Comment c4 = new Comment("may the force be with you");

        p1.addComment(c1);
        p1.addComment(c2);

        p2.addComment(c3);
        p2.addComment(c4);

        // Output
        System.out.println(p1);
        System.out.println(p2);




    }
}