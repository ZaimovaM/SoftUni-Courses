package logger;

import java.util.Scanner;

public class InputParser {

    public String readLoggerInfo(Scanner scanner){
        int appenderCount = Integer.parseInt(scanner.nextLine());
        StringBuilder sb = new StringBuilder();

        while (appenderCount-- > 0){
            sb.append(scanner.nextLine()).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
