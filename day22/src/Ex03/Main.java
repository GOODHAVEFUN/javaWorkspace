package Ex03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      UserManager userManager = new UserManager();
      Scanner sc = new Scanner(System.in);
      
      while(true) {
      try {
         System.out.println("1. 사용자 등록");
         System.out.println("2. 사용자 로그인");
         System.out.println("3. 사용자 로그아웃");
         System.out.println("4. 프로필 수정");
         System.out.println("5. 종료");
         System.out.println("번호 입력 : ");

//         String choiceInput = sc.nextLine();
//         int choice = Integer.parseInt(choiceInput);
         int choice = sc.nextInt();
         sc.nextLine();
         
         switch(choice) {
         case 1:
            System.out.println("이름입력 : ");
            String name = sc.nextLine();
            System.out.println("비밀번호입력 : ");
            String password = sc.nextLine();
            userManager.registerUser(name, password);
            break;
         case 2:
            System.out.println("이름입력 : ");
            String loginname = sc.nextLine();
            System.out.println("비밀번호입력 : ");
            String loginpassword = sc.nextLine();
            userManager.login(loginname, loginpassword);
            break;
         case 3:
            userManager.logout();
            break;
         case 4:
            System.out.println("새로운 비밀번호 입력 : ");
            String newPassword = sc.nextLine();
            userManager.updateUser(newPassword);
            break;
         case 5:
            System.out.println("프로그램 종료");
            return;
         default:
            System.out.println("번호를 다시 입력하세요");
            break;
         } //switch 끝
//      } catch(NumberFormatException e) {
//         System.out.println("잘못된 입력입니다. 숫자를 입력하세요");
      }catch (InputMismatchException e) {
         System.out.println("잘못된 입력입니다. 숫자를 입력하세요");
         sc.nextLine();
      }catch (Exception e) {
         System.out.println("오류가 발생했습니다" + e.getMessage());
      }
      } //while 끝
   }
}
