/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.resorce;

import com.example.model.BaseModel;

/**
 *
 * @author yingj
 */
public class MachineLearningModel implements BaseModel{
    private String id;
    private String framework;
    private String status;
    private double latestAccuracy;
    private String workspaceId;
    
    public MachineLearningModel() {
    }


    public MachineLearningModel(String id, String framework, String status, double latestAccuracy, String workspaceId) {
        this.id = id;
        this.framework = framework;
        this.status = status;
        this.latestAccuracy = latestAccuracy;
        this.workspaceId = workspaceId;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getFramework() {
        return framework;
    }

    public String getStatus() {
        return status;
    }

    public double getLatestAccuracy() {
        return latestAccuracy;
    }

    public String getWorkspaceId() {
        return workspaceId;
    }

     @Override
    public void setId(String id) {
        this.id = id;
      
    }
      

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLatestAccuracy(double latestAccuracy) {
        this.latestAccuracy = latestAccuracy;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }   
}
