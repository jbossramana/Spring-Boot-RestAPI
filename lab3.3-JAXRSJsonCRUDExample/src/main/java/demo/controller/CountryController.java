package demo.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import demo.model.Country;
import demo.service.CountryService;


@Path("/country")
public class CountryController {
	
	CountryService countryService=new CountryService();
	
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Country> getCountries(@QueryParam("start") int start,  @QueryParam("size") int size)
	{
		
    	System.out.println("Start :"+start+"  size:"+size);
		List<Country> listOfCountries=countryService.getAllCountries();
		return listOfCountries;
	}

    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Country getCountryById(@PathParam("id") int id)
	{
		return countryService.getCountry(id);
	}
   
    @POST
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Country addCountry(Country country)
	{
		return countryService.addCountry(country);
	}

    @PUT
    @Path("/{id}") 	
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
	public Country updateCountry(@PathParam("id") int id,Country country)
	{
		return countryService.updateCountry(country);
		
	}
	
    @DELETE
    @Path("/{id}")
	public void deleteCountry(@PathParam("id") int id)
	{
		 countryService.deleteCountry(id);
		
	}
	
}
