import mbean.LogSwitcher;

import javax.management.*;
import java.lang.management.ManagementFactory;
public class Main {

    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, 
    InstanceAlreadyExistsException, MBeanRegistrationException{
	  
	
	MBeanServer server = ManagementFactory.getPlatformMBeanServer();
		ObjectName name = new ObjectName("upper_lower_case:type=LogSwitcher");

		LogSwitcher mbean = new LogSwitcher();
	        server.registerMBean(mbean, name);
	        StringConverter app = new StringConverter();
	        app.startApp();

    }

}
