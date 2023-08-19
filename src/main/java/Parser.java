import org.apache.commons.io.IOUtils;

import java.util.ArrayList;
import java.util.List;

public class Parser {

    public static String readRawDataToString() throws Exception {
        ClassLoader classLoader = Parser.class.getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static String[] parseToStringArrays() throws Exception {
        String rawData = readRawDataToString();

        return rawData.split("##");
    }

    public static List<String[]> parseArraysToList() throws Exception {
        ArrayList<String[]> listOfItems = new ArrayList<>();
        for (String s: parseToStringArrays()) {
           String[] parsed = s.split("[:;]");
          String[] needed = new String[2];
          needed[0] = parsed[1];
          needed[1] = parsed[3];
           listOfItems.add(needed);
        }
        return listOfItems;
    }




//    public String arrayToString(String[] input) {
//        StringBuilder split = new StringBuilder();
//        for (int i = 0; i < input.length; i++) {
//            split.append(input[i])
//                    ;
//        }
////        System.out.println(split);
//        return split.toString();
//    }
////    public String splitAndListArray(String[] input){
////        StringBuilder splitWords = new StringBuilder();
////        for (String singleItem : input) {
////            String[] singleArray = singleItem.split("[^A-Za-z0-9.:/]");
////            splitWords.append( arrayToString(singleArray))
////                    .append("\n");
////
////        }
////        System.out.println(splitWords);
////        return splitWords.toString();
////    }
//public String splitAndListArray(String[] input){
//    StringBuilder splitWords = new StringBuilder();
//    for (String singleItem : input) {
//        String[] singleArray = singleItem.split("type");
//        splitWords.append( arrayToString(singleArray))
//                .append("\n");
//
//    }
//    System.out.println(splitWords);
//    return splitWords.toString();
//}

//input example "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016##
// naME:BreaD;price:1.23;type:Food;expiration:1/02/2016##"
//    output example
//    name:    Milk
//    Price: 	 3.23
//parse the string down  by the ## so that each item is in its own part of an array.
//    splits it up by the item with .split("##")
//    input example will now be
//    "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016
//
//    naME:BreaD;price:1.23;type:Food;expiration:1/02/2016
//
//            "
//    get the name by finding what is after the first : and before first ;
//    get the price by finding what is after the second : and before second ;
//    .split([:;] will break out into single array spaces filled with individual words


}
