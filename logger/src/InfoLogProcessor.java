public class InfoLogProcessor extends LoggingProcessor{

    public InfoLogProcessor(LoggingProcessor nextLoggingProcessor) {
    super(nextLoggingProcessor);
    }
    public void log(int logLevel, String message){
        if(logLevel==INFO)
        {
            System.out.println("Info level"+message);
        }
        else {
            super.log(logLevel,message);
        }
    }
}
