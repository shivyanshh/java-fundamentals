import java.io.*;
public class FileIo {
    public static void main(String[] args){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\test\\output.txt"));
            bw.write("helena\n");
            bw.write("oddyseus\n");
            bw.write("atredius\n");
            bw.close();

            //copying file by reading from another
            BufferedWriter tool = new BufferedWriter(new FileWriter("D:\\test\\output-copy.txt"));
            BufferedReader scanner = new BufferedReader(new FileReader("D:\\test\\output.txt"));

            BufferedReader br = new BufferedReader(new FileReader("D:\\test\\output.txt"));
            String s;
            while((s=br.readLine())!=null){
                tool.write(s + "\n");
                System.out.println(s);
            }
            br.close();
            tool.close();
            scanner.close();
        }
        catch(FileNotFoundException e){
            System.out.println("problem : "+ e);
        } catch (Exception e) {
            System.out.println("problem : "+ e);
        }
    }
}
