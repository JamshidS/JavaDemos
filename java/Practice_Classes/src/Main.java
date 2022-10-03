import java.io.*;


public class Main {

    public static void main(String[] args) {
/*
        BufferedReader reader = null;
        int total = 0;

        try {
            reader = new BufferedReader(new FileReader("F:\\NewTry\\src\\numbers"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                total += Integer.valueOf(line);
            }
            System.out.println("Total of the numbers: " + total);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println(e);
            }*/

        AccountManager am = new AccountManager();
        am.deposit(100);
        System.out.println("Hesap Bakiyesi: " + am.getBalance());
        try{
            am.withdraw(90);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            am.withdraw(90);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Hesap bakiyesi: "+ am.getBalance());



    }

}
