/*
 *  UCF COP3330 Fall 2021 Assignment 45 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package Exercise45;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Solution45
{
    public static void main( String[] args ) throws IOException
    {

        File inFile = new File("src/main/java/Exercise45/exercise45_input.txt");
        Scanner scanFile = new Scanner(inFile);
        Scanner scan = new Scanner(System.in);

        System.out.print("\nWhat would you like to name the output file? ");
        String outFile = scan.next();
        FileWriter write = new FileWriter("src/main/java/Exercise45/" + outFile);

        try
        {
            while(scanFile.hasNext())
            {
                String input = scanFile.nextLine();
                input = input.replaceAll("utilize", "use");
                write.write(input);
                write.write("\n");
            }
        } catch (IOException ex)

        {
            System.out.println("Error!");
        }

        System.out.println("\n Word Finder Completed.");
        scanFile.close();
        write.close();
    }
}