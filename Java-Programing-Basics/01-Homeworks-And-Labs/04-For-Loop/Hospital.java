import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int countExaminedPatient = 0;
        int countUnExPat = 0;
        int doctors = 7;

        for (int i = 1; i <= days; i++) {
            int patient = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0 && countUnExPat > countExaminedPatient) {
                doctors++;
            }
            if (patient <= doctors){
                countExaminedPatient += patient;
            } else {
                countExaminedPatient += doctors;
                countUnExPat += patient - doctors;
            }

        }


            System.out.printf("Treated patients: %d.%n",countExaminedPatient);
            System.out.printf("Untreated patients: %d.",countUnExPat );

        }
    }

