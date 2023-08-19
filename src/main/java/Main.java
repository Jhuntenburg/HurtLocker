import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.util.List;

public class Main {

    public String readRawDataToString() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static void main(String[] args) throws Exception {
//        Parser parser = new Parser();
//
//        String output = (new Main()).readRawDataToString();
//        String[] outputArray = output.split("##");
////   parser.arrayToString(outputArray);
//        String splitList = parser.splitAndListArray(outputArray);
//        System.out.println(splitList);
//        String input = "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016##naME:BreaD;price:1.23;type:Food;expiration:1/02/2016##";
//
//        String[] splitted = input.split("##");
//        for(String s : splitted){
//            System.out.println(s);
//        }
//        for(String s : splitted){
//            String[] alsoSplit=  s.split("[:;]");
//            for(String t : alsoSplit){
//            System.out.println(t);
//            }
//        }
        List<String[]> listOfItems = Parser.normalizeCase();
        for (String[] itemArray : listOfItems) {
            for (String item : itemArray) {
                System.out.print(item + " ");
            }
            System.out.println();
        }

    }

}
