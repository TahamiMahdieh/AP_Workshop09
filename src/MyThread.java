import java.io.FileNotFoundException;
import java.io.FileReader;

public class MyThread extends Thread{
    String threadName;
    private int wordCount;
    private String longestWord;
    private int lengthOfLongestWord;
    private String shortestWord;
    private int lengthOfShortestWord;
    private int averageLength;
    private FileReader fileReader= null;

    public MyThread(String fileName, String threadName){
        this.threadName = threadName;
        try {
            fileReader = new FileReader(fileName);
        }
        catch (FileNotFoundException f){
            f.printStackTrace();
        }
    }
    @Override
    public void run(){

    }

}
