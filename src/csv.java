import java.io.*;
public class csv {
    public static void main(String[] args){
        //writing csv
        String filepath = "D:\\test\\data.csv";
        try(FileWriter fw = new FileWriter(filepath)){ //this closes the filewriter automaticallly
            fw.append("name,age,city\n");
            fw.append("Bob,24,manhattan\n");
            fw.append("Alice,36,new york\n");
            fw.append("Charles,19,birmingham\n");
        }
        catch (IOException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }

        //reading csv
        try(BufferedReader br = new BufferedReader(new FileReader(filepath))){
            String s;
            while((s=br.readLine())!=null){
                String[] line = s.split(",");
                System.out.println("column 1: " + line[0] + " column 2: "+ line[1]+" column 3: "+ line[2]);
                //System.out.println(s+"\n");
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
