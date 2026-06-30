/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import com.example.model.ErrorMessage;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 *
 * @author yingj
 */
public class WorkspaceNotEmptyExceptionMapper implements ExceptionMapper<WorkspaceNotEmptyException> {

    @Override
    public Response toResponse(WorkspaceNotEmptyException exception) {
        ErrorMessage errorMessage = new ErrorMessage(
                exception.getMessage(),
                409,
                "https://myuniversity.edu/api/docs/errors"
        );

        return Response.status(409)
                .entity(errorMessage)
                .type(MediaType.APPLICATION_JSON)
                .build();
    }

}
