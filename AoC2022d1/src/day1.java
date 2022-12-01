import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {

        int dataV;
        int value = 0;

        ArrayList<Integer> valueList = new ArrayList<Integer>(); // Create an ArrayList object

        try {

                File calFile = new File("values.txt");

                Scanner reader = new Scanner(calFile);

                while (reader.hasNextLine())
                {

                    String data = reader.nextLine();

                    if(!data.equals(""))
                    {
                        dataV = Integer.parseInt(data);
                        value += dataV;
                    }
                    else if (data.equals(""))
                    {
                        valueList.add(value);
                        value = 0;
                    }

                }

                reader.close();

            }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        Collections.sort(valueList);

        System.out.println("First Task: " + valueList.get(valueList.size() - 1));
        System.out.println("Second Task: " + (valueList.get(valueList.size() - 1) + valueList.get(valueList.size() - 2) + valueList.get(valueList.size() - 3)));

    }


}


