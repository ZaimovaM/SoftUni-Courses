import java.util.Scanner;

public class ComputerRoomExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mount = scanner.nextLine();
        int hour = Integer.parseInt(scanner.nextLine());
        int countPeople = Integer.parseInt(scanner.nextLine());
        String timeDay = scanner.nextLine();
        double sum = 0;
        double pricePerPerson = 0;

        if (mount.equals("march")) {
            if (timeDay.equals("day")) {
                pricePerPerson = 10.50;
                if (countPeople >= 4) {
                    pricePerPerson = pricePerPerson - (pricePerPerson * 0.10);

                }
                if (hour >= 5) {
                    pricePerPerson = pricePerPerson - (pricePerPerson * 0.50);
                }
                sum = pricePerPerson * countPeople * hour;

            } else if (timeDay.equals("night")) {
                pricePerPerson = 8.40;
                if (countPeople >= 4) {
                    pricePerPerson = pricePerPerson - (pricePerPerson * 0.10);

                }
                if (hour >= 5) {
                    pricePerPerson = pricePerPerson - (pricePerPerson * 0.50);
                }
                sum = pricePerPerson * countPeople * hour;
            }
        } else if (mount.equals("april")) {
            if (timeDay.equals("day")) {
                pricePerPerson = 10.50;
                if (countPeople >= 4) {
                    pricePerPerson = pricePerPerson - (pricePerPerson * 0.10);

                }
                if (hour >= 5) {
                    pricePerPerson = pricePerPerson - (pricePerPerson * 0.50);
                }
                sum = pricePerPerson * countPeople * hour;
            } else if (timeDay.equals("night")) {
                pricePerPerson = 8.40;
                if (countPeople >= 4) {
                    pricePerPerson = pricePerPerson - (pricePerPerson * 0.10);

                }
                if (hour >= 5) {
                    pricePerPerson = pricePerPerson - (pricePerPerson * 0.50);
                }
                sum = pricePerPerson * countPeople * hour;
            }
        } else if (mount.equals("may")) {
            if (timeDay.equals("day")) {
                pricePerPerson = 10.50;
                if (countPeople >= 4) {
                    pricePerPerson = pricePerPerson - (pricePerPerson * 0.10);
                }
                if (hour >= 5) {
                    pricePerPerson = pricePerPerson - (pricePerPerson * 0.50);
                }
                sum = pricePerPerson * countPeople * hour;

            } else if (timeDay.equals("night")) {
                pricePerPerson = 8.40;
                if (countPeople >= 4) {
                    pricePerPerson = pricePerPerson - (pricePerPerson * 0.10);

                }
                if (hour >= 5) {
                    pricePerPerson = pricePerPerson - (pricePerPerson * 0.50);
                }
                sum = pricePerPerson * countPeople * hour;
            }
        } else if (mount.equals("june")) {
            if (timeDay.equals("day")) {
                pricePerPerson = 12.60;
                if (countPeople >= 4) {
                    pricePerPerson = pricePerPerson - (pricePerPerson * 0.10);

                }
                if (hour >= 5) {
                    pricePerPerson = pricePerPerson - (pricePerPerson * 0.50);
                }
                sum = pricePerPerson * countPeople * hour;
            } else if (timeDay.equals("night")) {
                pricePerPerson = 10.20;
                if (countPeople >= 4) {
                    pricePerPerson = pricePerPerson - (pricePerPerson * 0.10);

                }
                if (hour >= 5) {
                    pricePerPerson = pricePerPerson - (pricePerPerson * 0.50);
                }
                sum = pricePerPerson * countPeople * hour;
            }
        } else if (mount.equals("july")) {
            if (timeDay.equals("day")) {
                pricePerPerson = 12.60;
                if (countPeople >= 4) {
                    pricePerPerson = pricePerPerson - (pricePerPerson * 0.10);
                }
                if (hour >= 5) {
                    pricePerPerson = pricePerPerson - (pricePerPerson * 0.50);
                }

                sum = pricePerPerson * countPeople * hour;

            } else if (timeDay.equals("night")) {
                pricePerPerson = 10.20;
                if (countPeople >= 4) {
                    pricePerPerson = pricePerPerson - (pricePerPerson * 0.10);

                }
                if (hour >= 5) {
                    pricePerPerson = pricePerPerson - (pricePerPerson * 0.50);
                }
                sum = pricePerPerson * countPeople * hour;
            }
        } else if (mount.equals("august")) {
            if (timeDay.equals("day")) {
                pricePerPerson = 12.60;
                if (countPeople >= 4) {
                    pricePerPerson = pricePerPerson - (pricePerPerson * 0.10);

                }
                if (hour >= 5) {
                    pricePerPerson = pricePerPerson - (pricePerPerson * 0.50);
                }
                sum = pricePerPerson * countPeople * hour;
            } else if (timeDay.equals("night")) {
                pricePerPerson = 10.20;
                if (countPeople >= 4) {
                    pricePerPerson = pricePerPerson - (pricePerPerson * 0.10);

                }
                if (hour >= 5) {
                    pricePerPerson = pricePerPerson - (pricePerPerson * 0.50);
                }
                sum = pricePerPerson * countPeople * hour;
            }
        }
        System.out.printf("Price per person for one hour: %.2f%n", pricePerPerson);
        System.out.printf("Total cost of the visit: %.2f", sum);
        }

    }

