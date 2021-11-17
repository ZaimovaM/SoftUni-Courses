package logger.impl.layouts;

import logger.enums.ReportLevel;
import logger.interfaces.Layout;

public class XmlLayout implements Layout {

    @Override
    public String format(String time, ReportLevel reportLevel, String message) {
        return String.format(
                "<log>%n   <date>%s</date>%n   <level>%s</level>%n   <message>%s</message>%n</log>"
                , time, reportLevel, message);
    }
}
