/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.resorce;

import com.example.model.BaseModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yingj
 */
public class MLWorkspace implements BaseModel{
    private String id;
    private String teamName;
    private int storageQuotaGb;
    private List<String> modelIds = new ArrayList<>();
    
    public MLWorkspace() {
}

    public MLWorkspace(String id, String teamName, int storageQuotaGb) {
        this.id = id;
        this.teamName = teamName;
        this.storageQuotaGb = storageQuotaGb;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getStorageQuotaGb() {
        return storageQuotaGb;
    }

    public List<String> getModelIds() {
        return modelIds;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setStorageQuotaGb(int storageQuotaGb) {
        this.storageQuotaGb = storageQuotaGb;
    }

    public void setModelIds(List<String> modelIds) {
        this.modelIds = modelIds;
    }
    
}
