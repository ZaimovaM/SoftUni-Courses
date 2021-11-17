package logger.impl.appenders;

import logger.enums.ReportLevel;
import logger.interfaces.File;
import logger.interfaces.Layout;

public class FileAppender extends BaseAppender {
    private File file;

    public FileAppender(Layout layout) {
        super(layout);
        this.file = new LogFile();

    }

    public FileAppender(Layout layout, String fileName) {
        this(layout);
        this.file = new LogFile(fileName);

    }

    @Override
    public void append(String time, ReportLevel reportLevel, String message) {
        if (canAppend(reportLevel)) {
            String output = this.layout.format(time, reportLevel, message);
            increaseMessageCount();
            file.append(output);
        }
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return super.toString() + " , File size: " + this.file.getSize();
    }
}
