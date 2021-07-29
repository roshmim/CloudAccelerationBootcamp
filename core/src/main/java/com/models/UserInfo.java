package com.models;
 
import javax.inject.Inject;
 
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
  
@Model(adaptables = Resource.class)
public class UserInfo {
    @Inject
    private String text;
    
    public String getText() {
        return text;
    }
  
    @Inject
    @Optional
    private String name;
    
    public String getName() {
        return name;
    }
}