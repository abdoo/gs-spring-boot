package hello;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
	InetAddress ip;
	String ipHost;
	String hostname;
    @RequestMapping("/")
    public String index() {
    	try{
    	ip = InetAddress.getLocalHost();
    	ipHost = ip.getHostAddress();
    	hostname = ip.getHostName();
        return "Greetings from Azure ===> " + hostname + "  ====> " + ipHost;
    	}
    	catch(UnknownHostException e){
    		e.printStackTrace();
    		return "Greetings from Azure";
    	}
    }
    
}
