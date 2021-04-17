package JavaAPI;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/API")
public class API {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String MethodAPI() {
		
return "<h1> Welcome to 'SMART TECH' </h1> <p><a href = https://www.youtube.com/channel/UC2NtU2cvBtwDhyTg5hhbyvQ/videos'> SMART TECH.YouTube! </a></p>";
		
	}
}
