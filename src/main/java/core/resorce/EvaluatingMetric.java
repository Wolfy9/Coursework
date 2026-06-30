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
public class EvaluatingMetric implements BaseModel{
    private String id;
    private long timestamp;
    private double accuracyScore;

    public EvaluatingMetric(String id, long timestamp, double accuracyScore) {
        this.id = id;
        this.timestamp = timestamp;
        this.accuracyScore = accuracyScore;
    }

    @Override
    public String getId() {
        return id;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public double getAccuracyScore() {
        return accuracyScore;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void setAccuracyScore(double accuracyScore) {
        this.accuracyScore = accuracyScore;
    }
    
    
    
}
