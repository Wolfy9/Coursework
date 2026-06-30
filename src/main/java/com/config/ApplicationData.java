/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.config;


import Exception.GlobalExceptionMapper;
import Exception.LinkedWorkspaceNotFoundExceptionMapper;
import Exception.ModelDeprecatedExceptionMapper;
import Exception.WorkspaceNotEmptyExceptionMapper;
import WorkspaceResource.ModelResource;
import WorkspaceResource.WorkspaceResource;
import com.example.filter.LoggingFilter;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author yingj
 */
@ApplicationPath("/api/v1")
public class ApplicationData extends Application {

    @Override
    public Set<Class<?>> getClasses() {

        Set<Class<?>> classes = new HashSet<>();

        // Register your resources here
        classes.add(DiscoveryResource.class);
        classes.add(WorkspaceResource.class);
        classes.add(ModelResource.class);
        classes.add(LoggingFilter.class);
        classes.add(LinkedWorkspaceNotFoundExceptionMapper.class);
        classes.add(WorkspaceNotEmptyExceptionMapper.class);
        classes.add(GlobalExceptionMapper.class);
        classes.add(ModelDeprecatedExceptionMapper.class);

        return classes;
    }
}
