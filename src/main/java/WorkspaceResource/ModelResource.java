/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkspaceResource;

import Exception.LinkedWorkspaceNotFoundException;
import com.example.dao.GenericDAO;
import com.example.dao.MockDatabase;
import core.resorce.MLWorkspace;
import core.resorce.MachineLearningModel;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author yingj
 */
@Path("/models")
public class ModelResource {

    private GenericDAO<MachineLearningModel> mlDAO = new GenericDAO<>(MockDatabase.MODELS);
    private GenericDAO<MLWorkspace> workspaceDAO = new GenericDAO<>(MockDatabase.WORKSPACES);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MachineLearningModel> getAllModels(@QueryParam("status") String status) {
        if (status == null) {
            return mlDAO.getAll();
        }

        List<MachineLearningModel> filteredModels = new ArrayList<>();

        // Loop through every model
        for (MachineLearningModel model : mlDAO.getAll()) {
            // If the model's status matches the query parameter
            if (model.getStatus().equalsIgnoreCase(status)) {
                filteredModels.add(model);
            }
        }
        // Return only the matching models
        return filteredModels;

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addModel(MachineLearningModel model) {

        if (model == null) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Request body is missing or invalid")
                    .build();
        }

        MLWorkspace workspace = workspaceDAO.getById(model.getWorkspaceId());

        if (workspace == null) {
            throw new LinkedWorkspaceNotFoundException("WorkspaceID does not exist");

        }

        mlDAO.add(model);

        return Response.ok("Model added successfully").build();
    }

//Used to test the global exception mapper
    //@GET
    //@Path("/test-error")
    //public String testError() {
    //  throw new NullPointerException("Testing global mapper");
    //}
}
