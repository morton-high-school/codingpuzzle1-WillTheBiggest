import java.util.Scanner;
import java.io.File;

// welcome to your first coding puzzle of the course your second
// task and first keyword are located in the one hundred and twenty
// three characters after the tenth giraffe

// armadillo your next task and keyword are located in the one hundred and five characters after the longest
// string of the same consecutive character

public class PuzzleKiller{
    public static void main(String[] args)throws Exception{
        File info = new File("puzzle.txt");
        Scanner reader = new Scanner(info);
        String text = reader.nextLine();
        String cutText = text;
        
        for(int i = 0; i<10;i++){
            cutText = cutText.substring(cutText.indexOf("giraffe") + 7);
        }
        System.out.println(cutText);

        // Task two
        String letter = text;
        int count = 0;
        int maxCount =0;
        String word = "";
        String max ="";
        for(int i = 0; i<text.length(); i++){
            if(text.substring(i).equals(text.substring(i+1))){
                count++;
                word = text.substring(i);
            }else if(count>maxCount){
                maxCount = count;
                max = word;
                count = 0;
                word = "";
                letter = letter.substring(i,i + maxCount);
            }else {
                count = 0;
                word = "";
                
            }
        }
        System.out.println("The max charecter in a row is: " + max + "And the max number of repitions is: " + maxCount);
        System.out.println(text.substring(text.indexOf(letter) + 105));










    }
}