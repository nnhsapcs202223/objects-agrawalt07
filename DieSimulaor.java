import java.util.Random; 

public class DieSimulaor {
    static void dieSimulator(){
        Random dice = new Random();
        for (int i = 1; i<=6; i++){
            System.out.println(dice.nextInt(6)+1);
        }
    }

    public static void main(String[] args){
        dieSimulator();
        dieSimulator();

    }

}

/*
 *          Random dice = new Random();
for (int i = 1; i<=6; i++){
System.out.println(dice.nextInt(6)+1);
 */
