package com.myspace.wiedzmin;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class RadioObject implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String value;
	private java.lang.String label;

	public RadioObject() {
	}

	public java.lang.String getValue() {
		return this.value;
	}

	public void setValue(java.lang.String value) {
		this.value = value;
	}

	public java.lang.String getLabel() {
		return this.label;
	}

	public void setLabel(java.lang.String label) {
		this.label = label;
	}

	public RadioObject(java.lang.String value, java.lang.String label) {
		this.value = value;
		this.label = label;
	}

}