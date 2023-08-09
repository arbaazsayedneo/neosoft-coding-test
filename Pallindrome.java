package org.coding;

public class Pallindrome {

    public static void main(String[] args){

        String str = "abcdcbabcddcba";
        int nonMatchingCount = 1;

        for(int i=str.length()-1; i>=0 ; i--){
            String reverse = reverse(str);
            if(reverse.equals(str))
            {
                System.out.println("Biggest possible pallindrome: "+reverse);
                break;
            }
            else{
                nonMatchingCount++;
                str = removeLastElement(str);
                }
            }
           // System.out.println("Completed outer loop");
        }



    public static String reverse(String str){
        String reverse = "";
        for(int k=str.length()-1; k>=0; k--)
            reverse += str.charAt(k);
       // System.out.println("Reverse: "+reverse);
        return reverse;
    }

    public static String removeLastElement(String str){
        String stringAfterRemovel = "";
        for(int i=0; i < str.length() - 1; i++)
            stringAfterRemovel += str.charAt(i);

        return stringAfterRemovel;
    }
}
