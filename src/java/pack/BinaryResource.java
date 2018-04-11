package pack;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imac
 */
@Stateless
@Path("/binary")

public class BinaryResource {
    
    @GET
    public String getBinary(@QueryParam("numero") long numero){
        return Long.toBinaryString(numero);
    }
}
