package com.ilimi.taxonomy.mgr.impl;

import org.springframework.stereotype.Component;

import com.ilimi.common.dto.Response;
import com.ilimi.graph.dac.model.Node;
import com.ilimi.taxonomy.mgr.IMimeTypeManager;

@Component
public class HTMLMimeTypeMgrImpl extends BaseMimeTypeManager implements IMimeTypeManager {

	@Override
	public void upload() {
		// TODO Auto-generated method stub

	}

	@Override
	public Response extract(Node node) {
		// TODO Auto-generated method stub
		return new Response();

	}

	@Override
	public Response publish(Node node) {
		// TODO Auto-generated method stub
		return new Response();
	}

	@Override
	public Node tuneInputForBundling(Node node) {
		// TODO Auto-generated method stub
		return node;
	}

}
