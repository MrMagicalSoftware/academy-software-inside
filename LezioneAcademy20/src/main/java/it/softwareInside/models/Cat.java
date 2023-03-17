package it.softwareInside.models;

import java.util.ArrayList;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cat {
	ArrayList<MyData> myDatas;
}



@NoArgsConstructor
@AllArgsConstructor
@Data
class MyData {
	private Status status;
	//private String _id;
	private String user;
	private String text;
	
	//private int __v;
	
	private String source;
	//private Date updatedAt;
	private String type;
	//private Date createdAt;
	private boolean deleted;
	private boolean used;
}


@Data
@AllArgsConstructor
@NoArgsConstructor
class Status{
    public boolean verified;
    public String feedback;
    public int sentCount;
}