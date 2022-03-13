package LAB06;

public class Solution_lab6_3 {
    public static void main(String[] args) {
        String myString  = "Test123ABC890";
        String alphaString = "";
        char[] myChar = myString.toCharArray();
        for (char c : myChar) {
            if(!Character.isDigit(c)){
                alphaString = alphaString+c;
            }
        }
        System.out.println(alphaString);
    }
}
