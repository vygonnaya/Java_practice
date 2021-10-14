public class StringTask {

    public static void splitStringWithDelimiter(String str, String delimiter) {
        String [] stringArr = str.split(delimiter);
        for (String word : stringArr) {
            System.out.println(word);
        }
    }

}
