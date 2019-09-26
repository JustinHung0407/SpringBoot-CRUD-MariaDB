package com.example.demo.model;

import java.io.Serializable;

public class RespondJson implements Serializable {

	    private static final long serialVersionUID = -1764970284520387975L;

	    public String name;
	    public Long Id;

	    public RespondJson() {

	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(Long Id) {
	        this.Id = Id;
	    }
	    
	    public String getId() {
	        return name;
	    }

	    public void setId(Long Id) {
	        this.Id = Id;
	    }
	}
