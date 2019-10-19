package br.inatel.dm110.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public interface CalcService {

	@GET
	@Path("/somar/{op1}/{op2}")
	@Produces(MediaType.TEXT_HTML)
	String doAddition(@PathParam("op1") String op1,
			@PathParam("op2") String op2);
	
	@GET
	@Path("/subtrair/{op1}/{op2}")
	@Produces(MediaType.TEXT_HTML)
	String doSubtraction(@PathParam("op1") String op1,
			@PathParam("op2") String op2);
	
	@GET
	@Path("/multiplicar/{op1}/{op2}")
	@Produces(MediaType.TEXT_HTML)
	String doMultiplication(@PathParam("op1") String op1,
			@PathParam("op2") String op2);
	
	@GET
	@Path("/dividir/{op1}/{op2}")
	@Produces(MediaType.TEXT_HTML)
	String doDivision(@PathParam("op1") String op1,
			@PathParam("op2") String op2);

}
