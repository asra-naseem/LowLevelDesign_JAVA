public class DebugLogProcessor extends LoggingProcessor{
    public DebugLogProcessor(LoggingProcessor nextLoggingProcessor) {
        super(nextLoggingProcessor);
    }
    public void log(int logLevel, String message){
        if(logLevel==DEBUG)
        {
            System.out.println("Debug level"+message);
        }
        else {
            super.log(logLevel,message);
        }
    }
}
