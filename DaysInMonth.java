import java.util.Scanner;;
public class DaysInMonth {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int month=sc.nextInt();
        System.out.print("Enter the year: ");
        int year=sc.nextInt();

        int DaysInMonth;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                DaysInMonth=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                DaysInMonth=30;
                break;
            case 2:
                if ((year%4==0 && year%100 !=0)||(year%400==0)){
                    DaysInMonth=29;
                }else{
                    DaysInMonth=28;

                }
                break;
            default:
                System.out.println("Invalid input");
                return;
        }

        System.out.println("No. of days in month "+month+" and year "+year+" is "+DaysInMonth);




    }

}

