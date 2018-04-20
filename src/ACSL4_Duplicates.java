import org.dalton.Assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


@Assignment(assignment = "ACSL4-Duplicates")
public class ACSL4_Duplicates {

    /**
     * solve for a specific input
     * @param s the input
     * @return the output
     */
    static String solve(String s) {
        return s;
    }

    public static void main(String[] args) throws IOException {
        //declarations:
        String filein = "c_4_duplicates_sr_sample.txt";
        String fileout = "testdata-answers";
        Scanner scanin, scanout=null;

        try{
            scanin = new Scanner(new BufferedReader(new FileReader(filein)));
            scanout = new Scanner(new BufferedReader(new FileReader(fileout)));
        } catch(FileNotFoundException e) {
            //switch to regular terminal input
            scanin = new Scanner(System.in);
        }

        //main loop:
        while(scanin.hasNext()) {
            String answer;
            try {
                answer = solve(scanin.nextLine());
            } catch (Exception e) {
                answer = "error: " + e.getStackTrace();
            }
            System.out.print(answer);
            System.out.print(scanout!=null && scanout.hasNext()?(answer.equals(scanout.nextLine())?" CORRECT":" INCORRECT"):"");
            System.out.println();
        }

        scanin.close();
        if(scanout!=null) scanout.close();
    }
}