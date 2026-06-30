/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkspaceResource;

import Exception.WorkspaceNotEmptyException;
import core.resorce.MLWorkspace;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import com.example.dao.GenericDAO;
import com.example.dao.MockDatabase;
import com.example.model.BaseModel;
import core.resorce.MachineLearningModel;
import javax.ws.rs.core.Response;
import javax.ws.rs.DELETE;
import javax.ws.rs.PathParam;
import WorkspaceResource.ModelResource;

/**
 *
 * @author yingj
 */
@Path("/workspaces")
public class WorkspaceResource {

    private GenericDAO<MLWorkspace> workspaceDAO = new GenericDAO<>(MockDatabase.WORKSPACES);
    private GenericDAO<MachineLearningModel> mlDAO = new GenericDAO<>(MockDatabase.MODELS);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MLWorkspace> getAllWorkspaces() {
        return workspaceDAO.getAll();
    }

    @GET
    @Path("/{workspaceId}")
    @Produces(MediaType.APPLICATION_JSON)
    public MLWorkspace getworkspace(@PathParam("workspaceId") String workspaceId) {
        return workspaceDAO.getById(workspaceId);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addworkspace(MLWorkspace workspace) {
        workspaceDAO.add(workspace);
    }

    @DELETE
    @Path("/{workspaceId}")
    public void deleteworkspace(@PathParam("workspaceId") String workspaceId) {
        for (MachineLearningModel model : mlDAO.getAll()) {
            if (model.getWorkspaceId().equalsIgnoreCase(workspaceId)) {
                throw new WorkspaceNotEmptyException("Workspace cannot be deleted because it contains models");
            }

        }

        workspaceDAO.delete(workspaceId);
    }
}
