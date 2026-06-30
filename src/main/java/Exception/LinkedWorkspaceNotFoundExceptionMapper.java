/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import com.example.model.ErrorMessage;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author yingj
 */
@Provider
public class LinkedWorkspaceNotFoundExceptionMapper implements ExceptionMapper<LinkedWorkspaceNotFoundException> {

    @Override
    public Response toResponse(LinkedWorkspaceNotFoundException exception) {

        return Response.status(422)
                .entity("Workspace does not exist")
                .type(MediaType.TEXT_PLAIN)
                .build();
    }
}
