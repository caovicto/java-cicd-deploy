// Rest Controller to print various log level messages
package example.demo;
  
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.File;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class LogController {
  
    // creating a logger
    Logger logger
        = LoggerFactory.getLogger(LogController.class);
  
    @RequestMapping("/") 
    public String log()
    {   
        String logLine = "Demo of App Service App Logs";

        // Logging various log level messages
        logger.trace(logLine);
        logger.info(logLine);
        logger.debug(logLine);
        logger.error(logLine);
        logger.warn(logLine);
  
        return "Hey! You can check the output in the logs";
    }

    @RequestMapping(value = "/https", method = RequestMethod.GET)
    public String dosomething(HttpServletRequest request, HttpServletResponse response) 
    {
        String url = request.getRequestURL().toString();

        return url;
    }

}