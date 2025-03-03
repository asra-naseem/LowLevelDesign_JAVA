public abstract class LoggingProcessor {
    protected static int INFO =1;
    protected static int ERROR =2;
    protected static int DEBUG =3;
  private LoggingProcessor nextLoggingProcessor;
    public LoggingProcessor(LoggingProcessor nextLoggingProcessor) {
        this.nextLoggingProcessor=nextLoggingProcessor;
    }

    public void log(int logLevel, String message){
      if(nextLoggingProcessor!=null)
      {
          nextLoggingProcessor.log(logLevel,message);
      }
      else{
          System.out.println("Provided logging level is not available");
      }
    }
}
