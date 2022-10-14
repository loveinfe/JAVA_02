import java.util.Scanner;
public class BMI{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("請輸入身高(M):");
        float x = s.nextFloat();
        System.out.println("您的身高為："+x);
        System.out.println("請輸入體重(KG):");
        float y = s.nextFloat();
        System.out.println("您的體重為："+y);
        float z = y/(x*x);
        System.out.println("您的BMI指數："+z);

        
    }

    private static Scanner y(float f) {
        return null;
    }

    private static Scanner nextFloat() {
        return null;
    }
}