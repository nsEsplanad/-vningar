import java.util.Scanner;

public class Uppgift4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String svar;
        int result=0;

        do {
            System.out.print("Ange två tal: ");
            int tal1=sc.nextInt();
            int tal2=sc.nextInt();
            System.out.println("Vilken operation? ");
            char op = sc.next().charAt(0);
            switch (op){
                case '+':
                    result=tal1+tal2;
                    break;
                case '-':
                    result=tal1-tal2;
                    break;
                case '*':
                    result=tal1*tal2;
                    break;
                case '/':
                    if (tal2!=0)
                    result=tal1/tal2;
                    break;
            }
            System.out.print("vad blir "+tal1+ op +tal2+"  ? ");
            int ans=sc.nextInt();
            sc.nextLine();
            if(result==ans){
                System.out.println("Rätt svar! ");
            }

            else {
                System.out.println("Fel svar -  det rätt svaret är "+result);
            }
            System.out.print("Vill du förtsätta? ");
            svar=sc.nextLine();
        }
        while (!svar.equals("nej"));
    }
}
