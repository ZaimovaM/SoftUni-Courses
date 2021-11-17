package logger.interfaces;

import logger.enums.ReportLevel;

public interface Layout {
    String format(String time, ReportLevel reportLevel, String message);

}
