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
        String letter = text









    }
}