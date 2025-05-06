import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.HashMap;
@Path("/product")
public class jax {
    HashMap<Integer,Product>prod=new HashMap<>();
    static int idCounter=0;
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product getProduct(@PathParam("id") int id){
        return prod.get(id);
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void addProduct(Product product){
        product.setId(idCounter++);
        prod.put(product.getId(),product);
    }
    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Product updateProduct(@PathParam("id") int id, Product product){
        product.setId(id);
        prod.put(id,product);
        return product;
    }
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteProduct(@PathParam("id") int id) {
        prod.remove(id);
    }
}
