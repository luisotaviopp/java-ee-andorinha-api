package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// sudo docker run -p 5432:5432 -v /tmp/database:/var/lib/postgresql/data -e POSTGRES_PASSWORD=1234 -d postgres

@Path("/init")
public class EntranceService {
    @GET
	@Produces(MediaType.TEXT_PLAIN)
	public String entrance() {
		return "Api no ar.";
	}
}
