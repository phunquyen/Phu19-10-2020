package com.xtel.tranning.webservice.api;

import com.google.gson.Gson;
import com.xtel.tranning.webservice.entities.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("simple")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class SimpleApi {
    @GET
    @Path("index")
    public Response index(@QueryParam("page_index") int page_index,
                          @QueryParam("page_size") int page_size){
        //todo call xuong database lay du lieu
//        DbModule dbModule = DbModule.getInstance();

        List<User> userList = new ArrayList<User>();
        userList.add(new User(1,"Phu"));
        userList.add(new User(2,"Tu"));
        //todo convert object -> json
        return Response.ok(new Gson().toJson(userList)).build();
    }

    @GET
    @Path("save")
    public Response save(String body){
        User user = new Gson().fromJson(body, User.class);

        //todo call xuong database lay du lieu
//        DbModule dbModule = DbModule.getInstance();

        List<User> userList = new ArrayList<User>();
        userList.add(new User(1,"Phu21"));
        userList.add(new User(2,"Phu12"));
        //todo convert object -> json
        return Response.ok(new Gson().toJson(userList)).build();
    }
}
