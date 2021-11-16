package haseeb;
public class Main {
    public static void main(String args[])    {
        String[ ] s="Have$a$Nice$Day".split("$",2);
        for(int i=0;i<s.length;i++)
            System.out.print(s[i]+ " ");
    }
}