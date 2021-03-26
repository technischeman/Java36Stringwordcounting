package CountingWords;

public class countTheWordsInString {
    public static void main(String[] args) {
        strCounter("selamun aleyküm ve aleyküm selam");


    }

    public static void strCounter(String a) {
        char[] strarr = a.toCharArray();
        int counter = 0;
        for (int i = 0; i < strarr.length; i++) {
            if (strarr[i] == ' ') {
                counter++;
            }
        }
        System.out.println("the number of words of String is :" + (counter + 1));
    }


}



