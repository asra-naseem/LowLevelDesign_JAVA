//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    LoggingProcessor objLog = new InfoLogProcessor(new ErrorLogProcessor(new DebugLogProcessor(null)));
    objLog.log(LoggingProcessor.DEBUG,"we need to debug");
    objLog.log(LoggingProcessor.INFO,"Just for info");
    objLog.log(LoggingProcessor.ERROR,"throws exception");
    objLog.log(9,"new logging");
    }
}