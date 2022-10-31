package ntou.cs.java;

public class SightTest {
    public static void main(String[] args) {
        com.example.demo.KeelungSightsCrawler crawler = new com.example.demo.KeelungSightsCrawler();
        com.example.demo.Sight[] sights = crawler.getItems("");
        for (com.example.demo.Sight s: sights) {
            System.out.println(s);
        }
    }
}
