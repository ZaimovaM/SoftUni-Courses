package logger.interfaces;

import logger.enums.ReportLevel;

public interface Appender {
    void append(String time, ReportLevel reportLevel, String message);
    void setReportLevel(ReportLevel reportLevel);
}
