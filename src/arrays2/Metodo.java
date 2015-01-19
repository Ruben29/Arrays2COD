package arrays2;

/**
 * @version 2.3
 * @author rfernandezgonzalez
 */

public class Metodo {

    public static void visualizar(String[] no, int[] dor) {
        System.out.println("NOME\t DORSAL");
        for (int i = 0; i < no.length; i++){
            System.out.println(no[i] + "\t\t" + dor[i]);
        System.out.printf("%-12S %-10d", no[i], dor[i]);
        
        }
    }

}
