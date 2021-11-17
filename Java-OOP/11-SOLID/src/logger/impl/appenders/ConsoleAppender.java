package logger.impl.appenders;

import logger.enums.ReportLevel;
import logger.interfaces.Layout;

public class ConsoleAppender extends BaseAppender {

    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void append(String time, ReportLevel reportLevel, String message) {
        if (canAppend(reportLevel)) {
            String formattedMessage = this.layout.format(time, reportLevel, message);
            increaseMessageCount();
            System.out.println(formattedMessage);

        }
    }

}
