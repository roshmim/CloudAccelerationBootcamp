package apps.sling.components;

import com.adobe.cq.sightly.WCMUsePojo;

public class HelloWorld extends WCMUsePojo  {
	private String title;
    private String description;
    
	@Override
	public void activate() throws Exception {
		// TODO Auto-generated method stub
		title = getProperties().get("text", "").toLowerCase();
		description = getProperties().get("name", "").toLowerCase();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
