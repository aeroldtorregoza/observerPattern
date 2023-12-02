public class News {
    public static void main(String[] args) {
        NewsAgency NewsAgency = new NewsAgency();

        Subscriber fan1 = (Subscriber) new Client("Football Fan 1");
        Subscriber fan2 = (Subscriber) new Client("Basketball Fan 2");

        NewsAgency.subscribe(fan1);
        NewsAgency.subscribe(fan2);

        NewsAgency.publishNews("Soccer team secures a historic victory!");

        NewsAgency.unsubscribe(fan2);

        NewsAgency.publishNews("Basketball league introduces new scoring system!");
    }
}
