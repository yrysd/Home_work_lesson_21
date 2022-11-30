import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        fileAlphabet();


        fileReader();
    }

    private static void fileReader() {
        try(FileReader fileReader = new FileReader("txt.txt")){
            Scanner scanner = new Scanner(fileReader);
            int counter = 0;
            while (scanner.hasNextLine()){
               counter++;
                System.out.println(counter+": "+scanner.nextLine());
            }
        }catch (IOException e){
            System.err.println("No such file!!");
        }
    }

    private static void fileAlphabet() {
        try(FileWriter fileWriter = new FileWriter("txt.txt")){
            fileWriter.write("Aa");
            fileWriter.write("\nBb");
            fileWriter.write("\nCc");
            fileWriter.write("\nDd");
            fileWriter.write("\nEe");
            fileWriter.write("\nFf");
            fileWriter.write("\nGg");
            fileWriter.write("\nHh");
            fileWriter.write("\nIi");
            fileWriter.write("\nJj");
            fileWriter.write("\nKk");
            fileWriter.write("\nLl");
            fileWriter.write("\nMm");
            fileWriter.write("\nNn");
            fileWriter.write("\nOo");
            fileWriter.write("\nPp");
            fileWriter.write("\nQq");
            fileWriter.write("\nRr");
            fileWriter.write("\nSs");
            fileWriter.write("\nTt");
            fileWriter.write("\nUu");
            fileWriter.write("\nVv");
            fileWriter.write("\nWw");
            fileWriter.write("\nXx");
            fileWriter.write("\nYy");
            fileWriter.write("\nZz");
            fileWriter.write("\n0");
            fileWriter.write("\n1");
            fileWriter.write("\n2");
            fileWriter.write("\n3");
            fileWriter.write("\n4");
            fileWriter.write("\n5");
            fileWriter.write("\n6");
            fileWriter.write("\n7");
            fileWriter.write("\n8");
            fileWriter.write("\n9");



        }catch (IOException e){
            e.printStackTrace();
        }
    }
}