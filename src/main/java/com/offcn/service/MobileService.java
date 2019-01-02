package com.offcn.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.offcn.po.Mobile;

public interface MobileService {

	public void save(Mobile m);
	public void saves(List<Mobile> list);
	 @GET
	 @Path("/mobile/{mobilenumber}")
	 @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	 public Mobile findMobile(@PathParam("mobilenumber")String mobilenumber);
}
