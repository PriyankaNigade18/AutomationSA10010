package com.PojoTest;

import java.util.List;

public class SwaggerPojo {

	/*
	 * '{ 
"id": 111, 
"category": { 
"id": 0, 
"name": "string" 
}, 
"name": "doggie", 
"photoUrls": [ 
"string" 
], 
"tags": [ 
{ 
"id": 0, 
"name": "string" 
} 
], 
"status": "available" 
}' 
	 */
	
	
	  	private int id;
	    private Category category;
	    private String name;
	    private List<String> photoUrls;
	    private List<Tag> tags;
	    private String status;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Category getCategory() {
			return category;
		}
		public void setCategory(Category category) {
			this.category = category;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<String> getPhotoUrls() {
			return photoUrls;
		}
		public void setPhotoUrls(List<String> photoUrls) {
			this.photoUrls = photoUrls;
		}
		public List<Tag> getTags() {
			return tags;
		}
		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
	    

	
}
