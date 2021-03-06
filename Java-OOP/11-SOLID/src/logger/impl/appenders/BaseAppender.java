package logger.impl.appenders;
import logger.enums.ReportLevel;
import logger.interfaces.Appender;
import logger.interfaces.Layout;

public abstract class BaseAppender implements Appender {
    private static final ReportLevel DEFAULT_REPORT_LEVEL = ReportLevel.INFO;
    Layout layout;
    private ReportLevel reportLevel;
    private int messagesCount = 0;

    public BaseAppender(Layout layout) {
       this(layout, DEFAULT_REPORT_LEVEL);
    }

    public BaseAppender(Layout layout, ReportLevel reportLevel) {
        this.layout = layout;
        this.reportLevel = reportLevel;
        this.messagesCount = 0;
    }

    public boolean canAppend(ReportLevel reportLevel){
        return this.reportLevel.ordinal() <= reportLevel.ordinal();
    }

    @Override
    public void setReportLevel(ReportLevel reportLevel) {
        this.reportLevel = reportLevel;
    }

    public void increaseMessageCount(){
        messagesCount++;
    }

    @Override
    public String toString() {
        return String.format("Appender type: %s, Layout type: %s, Report level: %s, Messages appended: %s",
                this.getClass().getSimpleName(), this.layout.getClass().getSimpleName(), this.reportLevel, this.messagesCount);
    }
}
