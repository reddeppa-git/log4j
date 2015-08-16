package SampleLog4j.logss;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
      //PropertiesConfigurator is used to configure logger from properties file
        PropertyConfigurator.configure("E:\\Selenium Setup\\Workspace\\logss\\src\\main\\java\\SampleLog4j\\logss\\log4j.properties");
                //Log in console in and log file
                logger.info("Log4j appender configuration is successful !!");
    }
}
