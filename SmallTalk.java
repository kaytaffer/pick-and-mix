import java.util.Random;
import java.util.Scanner;

public class SmallTalk 
{

    public static void main(String[] args)
    {
        Random random = new Random(5);
        Scanner input = new Scanner(System.in);
        int answer;
        String close = "";

        while(!close.equals("0"))
        {
            answer = random.nextInt(5);
            switch(answer)
            {
                case 0: System.out.println("Visst, om man har en såhär mörkblå, eller navyblå klänning... Kan man ha guldsmycken?");
                break;
                case 1: System.out.println("Vad är din mest värdelösa talang?");
                break;
                case 2: System.out.println("Answer 3");
                break;
                case 3: System.out.println("Answer 4");
                break;
                case 4: System.out.println("Answer 5");
                break;
            }
            System.out.println("\n");

            System.out.print("ENTER 0 TO END, ANYTHING ELSE FOR NEW TOPIC: ");
            close = input.nextLine();
            System.out.println("\n");
        }
        input.close();
    }    
}
