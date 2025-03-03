public class ErrorLogProcessor extends LoggingProcessor{
    public ErrorLogProcessor(LoggingProcessor nextLoggingProcessor) {
        super(nextLoggingProcessor);
    }
    public void log(int logLevel, String message){
        if(logLevel==ERROR)
        {
            System.out.println("Error level"+message);
        }
        else {
            super.log(logLevel,message);
        }
    }
}
