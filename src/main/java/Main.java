import org.apache.commons.io.IOUtils;

import java.io.IOException;

public class Main {

    public String readRawDataToString() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static void main(String[] args) throws Exception {
        Parser parser = new Parser();

        String output = (new Main()).readRawDataToString();
        String[] outputArray = output.split("##");
//   parser.arrayToString(outputArray);
        String splitList = parser.splitAndListArray(outputArray);
        System.out.println(splitList);
    }

}
