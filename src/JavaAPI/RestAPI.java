package JavaAPI;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("/RestAPI")
public class RestAPI {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String method(@QueryParam("name") String name, @QueryParam("Card number") String Card_number, @QueryParam("amount") int amount){
		System.out.println("Name is  "+name);
		System.out.println("Amount is  "+amount);
		String Response;
		if(amount>100000) {
		System.out.println("Amount is greater than 100000$");
		Response = "Credit Card is not approved ";
		}else {
			System.out.println("Amount is lesser than 100000$");
			Response = "Credit Card is approved ";
		}
		
		return "<html>" + "<title>" + "Credit Card Authorization " + name + "</title>" + "<body><h1>" + Response + "</h1><body>" + "</html>";
		
	}
	
}
