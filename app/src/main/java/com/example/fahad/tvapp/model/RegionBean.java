package com.example.fahad.tvapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RegionBean {

@SerializedName("Id")
@Expose
private String id;
@SerializedName("Name")
@Expose
private String name;
@SerializedName("Created_date")
@Expose
private String createdDate;

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getCreatedDate() {
return createdDate;
}

public void setCreatedDate(String createdDate) {
this.createdDate = createdDate;
}

}