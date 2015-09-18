package aggregate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;

@RestController
public class AggregateController {
	
	@Autowired
	DiscoveryClient discoveryClient;

	@RequestMapping(value="/get/{id}", method=RequestMethod.GET)
	public String getData(@PathVariable String id){
		InstanceInfo movieInstance = discoveryClient.getNextServerFromEureka("MOVIES", false);
		InstanceInfo ratingInstance = discoveryClient.getNextServerFromEureka("RATING", false);
		RestTemplate template = new RestTemplate();
		
		String response = template.getForObject(movieInstance.getHomePageUrl()+"/movie/"+id, String.class);
		response += "<br/>";
		response += template.getForObject(ratingInstance.getHomePageUrl()+"/movie/"+id, String.class);
		return response;
	}
}
