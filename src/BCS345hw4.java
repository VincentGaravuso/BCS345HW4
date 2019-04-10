
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;

public class BCS345hw4
{

    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        JFileChooser choose = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        choose.setFileFilter(filter);
        String fileName = null;
        int result = choose.showOpenDialog(choose);
        if (result == JFileChooser.APPROVE_OPTION) {
            File f = choose.getSelectedFile();
            fileName = f.getAbsolutePath();
        } else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("*Canceling Program*");
            System.exit(0);
        }
        Employee[] employeeArray = new Employee[50];
        try {
            BufferedReader buf = new BufferedReader(
                    new FileReader(fileName));

            String lineJustFetched = null;
            String[] employeeData;
            int count = 0;

            while (true) {
                lineJustFetched = buf.readLine();
                if (lineJustFetched == null) {
                    break;
                } else {
                    employeeData = lineJustFetched.split("\t+| ");
                    //Employee e = new Employee();
                    int id = (Integer.parseInt(employeeData[0]));
                    String fname = (employeeData[1]);
                    String lname = employeeData[2];
                    int year = Integer.parseInt(employeeData[3]);
                    int month = Integer.parseInt(employeeData[4]);
                    int day = Integer.parseInt(employeeData[5]);
                    //e.setHireDate(
                     //       Integer.parseInt(employeeData[3]),
                       //     Integer.parseInt(employeeData[4]),
                         //   Integer.parseInt(employeeData[5]));
                    employeeArray[count] = new Employee(fname,
                            lname, id, year, month, day);
                }
                count++;
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("A File not found exception was caught: " + fnfe.getMessage());
        } catch (IOException ioe) {
            System.err.println("An IO Exception was caught: " + ioe.getMessage());
        }

        for (Employee e : employeeArray) {
            if (e == null) {
                break;
            }
            System.out.println(e);
        }
        System.out.println("\n\n\n");
        processHireDate(employeeArray, 10);

    }

    /*If a date in ISO format is greater than another date in the same form,
    then the first date is the more recent of the two.*/
    public static void processHireDate(Employee[] e, int numEmp)
    {
        Employee newest = e[0];
        Employee oldest = e[0];
        for (int i = 0; i < numEmp; i++) {
            String ISOFormattedDateNewest = "" + newest.getHireDate().getYear()
                    + "" + String.format("%02d", newest.getHireDate().getMonth())
                    + "" + String.format("%02d", newest.getHireDate().getDay());
            String ISOFormattedDateOldest = "" + oldest.getHireDate().getYear()
                    + "" + String.format("%02d", oldest.getHireDate().getMonth())
                    + "" + String.format("%02d", oldest.getHireDate().getDay());
            String ISOFormattedDateCompare = "" + e[i].getHireDate().getYear()
                    + "" + String.format("%02d", e[i].getHireDate().getMonth())
                    + "" + String.format("%02d", e[i].getHireDate().getDay());
            if (Integer.parseInt(ISOFormattedDateNewest) < Integer.parseInt(ISOFormattedDateCompare)) {
                newest = e[i];
            } else if (Integer.parseInt(ISOFormattedDateOldest) > Integer.parseInt(ISOFormattedDateCompare)) {
                oldest = e[i];
            }
            //Original thought:
//            if (newest.getHireDate().getYear() < e[i].getHireDate().getYear()) 
//            {
//                newest = e[i];
//            } else if (oldest.getHireDate().getYear() > e[i].getHireDate().getYear())
//            {
//                oldest = e[i];
//            }
        }
        System.out.println("The most recent hire year is: " + newest.getHireDate().toString());
        System.out.println("The oldest hire year is: " + oldest.getHireDate().toString());
    }

}
