package com.xiyou.apps.lookpan.model;

import com.google.api.client.util.Key;

public class News_HotBean {

	@Key
	private String node_title;
	@Key
	private String nid;
	@Key
	private String node_created;
	@Key
	private String file_managed_field_data_upload_uri;
	
	public String getNode_title() {
		return node_title;
	}
	public void setNode_title(String node_title) {
		this.node_title = node_title;
	}
	public String getNid() {
		return nid;
	}
	public void setNid(String nid) {
		this.nid = nid;
	}
	public String getNode_created() {
		return node_created;
	}
	public void setNode_created(String node_created) {
		this.node_created = node_created;
	}
	public String getFile_managed_field_data_upload_uri() {
		return file_managed_field_data_upload_uri;
	}
	public void setFile_managed_field_data_upload_uri(
			String file_managed_field_data_upload_uri) {
		this.file_managed_field_data_upload_uri = file_managed_field_data_upload_uri;
	}
	@Override
	public String toString() {
		return "News_Recommend [node_title=" + node_title + ", nid=" + nid
				+ ", node_created=" + node_created
				+ ", file_managed_field_data_upload_uri="
				+ file_managed_field_data_upload_uri + "]";
	}

}
