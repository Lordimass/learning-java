public class Main { // All java files must contain a class which matches the name of the file
    public static void main(String[] args) { // They will also contain a main method, which is run on launch
        for (int i=1; i<=100; i++) {
            String output = "";
            if (i%3==0) {
                output += "Fizz";
            }
            if (i%5==0) {
                output += "Buzz";
            }
            if (output==""){
                output = Integer.toString(i);
            }
            System.out.println(output);
        }
    }
}
