package org.apache.oodt.cas.cl.action;

public abstract class CmdLineAction {

	private String name;
	private String description;

	public CmdLineAction() {}

	public CmdLineAction(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public abstract void execute();

}
