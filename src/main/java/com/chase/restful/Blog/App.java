package com.chase.restful.Blog;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import model.PostModel;
import model.userTest;
 
 
@ApplicationPath("rest")
public class App extends Application {
 
    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> returnValue = new HashSet<Class<?>>();
        returnValue.add(userResources.class);
        returnValue.add(PostsResources.class);
        returnValue.add(PostModel.class);
        returnValue.add(userTest.class);
        return returnValue;
    }
}