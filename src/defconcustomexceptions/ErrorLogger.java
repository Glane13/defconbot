package defconcustomexceptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ErrorLogger {

    final static Logger logger = LogManager.getLogManager().getLogger(ErrorLogger.class.getName());

    public void writeError(String error) {

        try {
            File myFile = new File("myErrorLog.log");
            FileWriter logFile = new FileWriter(myFile);
            logFile.write(error);
            logFile.close();
        }catch (IOException e) {
            logger.severe(ErrorLogger.class.getName()+" ERROR: File cannot be opened.");
        }
    }

}
