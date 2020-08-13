package phonebook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        long startTime = System.currentTimeMillis();
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\zivil\\IdeaProjects\\Phone Book\\Phone Book\\task\\src\\phonebook\\find.txt"));
        int lines = 0;
        System.out.println("Start searching...");
        while (reader.readLine() != null) lines++;
        reader.close();

        Thread.sleep(10_000);

        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        int min = (int) TimeUnit.MILLISECONDS.toMinutes(time);
        int secs = (int) TimeUnit.MILLISECONDS.toSeconds(time) - (min * 60);
        int ms = (int) time- (min * 60_000) - secs * 1000;
        System.out.println("Found " + lines + "/500 entries. Time taken: " + min + "min. " + secs + " sec. " + ms + "ms.");

        //+ min + " min. " + secs + " secs."
    }
}
