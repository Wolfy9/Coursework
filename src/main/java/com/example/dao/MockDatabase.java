/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dao;

import core.resorce.MLWorkspace;
import java.util.ArrayList;
import java.util.List;
import core.resorce.MachineLearningModel;

/**
 *
 * @author yingj
 */
public class MockDatabase {
    
    public static List<MLWorkspace> WORKSPACES = new ArrayList<>();
    
    static{
    WORKSPACES.add(new MLWorkspace("WS-VISION-01", "BOB", 100)); 
    WORKSPACES.add(new MLWorkspace("WS-VISION-02", "ALICE", 200));
    WORKSPACES.add(new MLWorkspace("WS-VISION-03", "Dave", 300));   
    }
    
    public static List<MachineLearningModel> MODELS = new ArrayList<>();
    
    static{
    MODELS.add(new MachineLearningModel("MOD-1234", "pytorch ",
                   "TRAINING", 10, "WS-VISION-01"));   
    
    MODELS.add(new MachineLearningModel("MOD-2468", "tensor flow ",
                   "DEPRECATED", 10, "WS-VISION-02")); 
    
    MODELS.add(new MachineLearningModel("MOD-1357", "scikit-learn ",
                   "DEPLOYED", 10, "WS-VISION-03")); 
    }
    
}
