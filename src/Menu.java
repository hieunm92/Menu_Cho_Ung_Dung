import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Ve hinh Tam Giac ");
        System.out.println("2. Ve hinh vuong");
        System.out.println("3. Ve hinh chu nhat ");
        System.out.println("0. Exit");
        System.out.println("Nhap hinh muon ve");
        while (true){
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Ve hinh Tam Giac");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Ve hinh vuong");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Ve hinh chu nhat");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Khong ve");
            }
        }
    }
}
