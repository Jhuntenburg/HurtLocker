import org.apache.commons.io.IOUtils;

public class Parser {

    public String readRawDataToString() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public String arrayToString(String[] input) {
        StringBuilder split = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            split.append(input[i])
                    ;
        }
//        System.out.println(split);
        return split.toString();
    }
//    public String splitAndListArray(String[] input){
//        StringBuilder splitWords = new StringBuilder();
//        for (String singleItem : input) {
//            String[] singleArray = singleItem.split("[^A-Za-z0-9.:/]");
//            splitWords.append( arrayToString(singleArray))
//                    .append("\n");
//
//        }
//        System.out.println(splitWords);
//        return splitWords.toString();
//    }
public String splitAndListArray(String[] input){
    StringBuilder splitWords = new StringBuilder();
    for (String singleItem : input) {
        String[] singleArray = singleItem.split("type");
        splitWords.append( arrayToString(singleArray))
                .append("\n");

    }
    System.out.println(splitWords);
    return splitWords.toString();
}

}
