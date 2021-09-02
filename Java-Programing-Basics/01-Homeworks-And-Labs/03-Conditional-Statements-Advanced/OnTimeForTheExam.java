import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourExam = Integer.parseInt(scanner.nextLine()); //9
        int minuteExam = Integer.parseInt(scanner.nextLine()); //00
        int hourArrived = Integer.parseInt(scanner.nextLine()); //8
        int minuteArrived = Integer.parseInt(scanner.nextLine()); //30

        int allMinutesExam = (hourExam * 60) + minuteExam; //540
        int allMinutesArrived = (hourArrived * 60) + minuteArrived; //510

        int diff = allMinutesArrived - allMinutesExam; // -30
        if (diff > 0){
            System.out.println("Late");

            int hour = diff / 60;
            int minutes = diff % 60;
            if (hour < 1){
                System.out.printf("%d minutes after the start", minutes);
            }else {
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            }
        }else if (diff >= -30){
            System.out.println("On time");
            if (diff != 0){
                System.out.printf("%d minutes before the start", Math.abs(diff));
            }
        }else {
            System.out.println("Early");
            diff = Math.abs(diff);

            int hour = diff / 60;
            int minutes = diff % 60;

            if (hour < 1){
                System.out.printf("% d  minutes before the start", minutes);
            }else {
                System.out.printf("%d:%02d hours before the start", hour,minutes);
            }
        }

        }





    }

