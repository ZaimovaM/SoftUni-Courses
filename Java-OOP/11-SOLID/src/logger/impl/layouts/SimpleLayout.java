package logger.impl.layouts;

import logger.enums.ReportLevel;
import logger.interfaces.Layout;

public class SimpleLayout implements Layout {

    @Override
    public String format(String time, ReportLevel reportLevel, String message) {
        return String.format("%s - %s - %s", time, reportLevel, message);
    }
}
