import java.util.Scanner;
import java.io.*;

public class CountOcc
{
    public static void main(String[ ]  args)throws IOException
    {
        int count = 0;
        Scanner infile;
        String line;
        char searchChar;
        if(args.length != 2)
        {
            System.out.println("Proper usage is  CountOcc filename character");
        }
        else
        {
            infile = new Scanner(new File(args[0]));
            searchChar = args[1].charAt(0);

            while(infile.hasNext())
            {
                line = infile.nextLine( );
                for(int i = 0; i < line.length( ); i++)
                {
                    if(line.charAt(i) == searchChar)
                    {
                        count++;
                    }
                }
            }
            System.out.println("The character " + searchChar + " occurs " + count + " times " + " in " + args[0]);

            infile.close( );
        }
    }
}




