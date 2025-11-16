package com.klef.sdp.service;

import java.util.List;

import com.klef.sdp.model.Visitor;



public interface VisitorService {
	public String addvisitor(Visitor visitor);
	public List<Visitor> viewallvisitors();
	public String deletevisitor(int vid);
	public String updateVisitor(Visitor visitor);
	public Visitor viewVisitorById(int vid);
}