package br.com.api.services;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import br.com.api.model.Bier;

@Path("/bier")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class BierService {
		
	// Init list for tests	
	private static final List<Bier> biers = new ArrayList<Bier>() 
			{ private static final long serialVersionUID = 1L;	{
				add(new Bier(1, "Extra Special Pig ESB", "Pig Pounder Brewery", Bier.Type.PALE_ALE));
				add(new Bier(2, "Rickshaw American IPA", "Crank Arm Brewing Co", Bier.Type.LIGHT_HYBRID_BEER));	
				add(new Bier(3, "Hi-Wire Lager", "Hi-Wire Brewing", Bier.Type.PILSNER));
			}};
	
	@GET	
    public List<Bier> getBires() {		
        return biers;        
    }	
	
	@GET
	@Path("{id}")
	public Bier findBiers(@PathParam("id") Integer id) {	 
        
		return biers.stream().filter( c -> { return c.getId() == id; } ).findFirst().get();	       		
	}
	
	@POST		
	public Response createBier(Bier bier) {	
		
		biers.add(bier);
		
		URI uri = UriBuilder.fromPath("biers/{id}").build(bier.getName());		
		return Response.created(uri).entity(bier).build();				
	}
	
	@PUT
	@Path("{id}")
	public void updateBier(@PathParam("id") Integer id, Bier bier ) {
		Integer index = biers.indexOf(biers.stream().filter( c -> { return c.getId() == id; } ).findFirst().get());
				
		if (index > 0) 
			biers.set(index, bier);
		
	}
	
	@DELETE
	@Path("{id}")
	public void deleteBier(@PathParam("id") Integer id ) {				
		biers.removeIf(p -> p.getId() == id);		
	}	
	
}

