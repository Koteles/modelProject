package com.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ZipPath {
	
	/**
	 * 	Model class for Student
	 */

	private String pathToFile;

	@Override
	public String toString() {
		return pathToFile;
	}

	public String getPathToFile() {
		return pathToFile;
	}
	
	@XmlElement
	public void setPathToFile(String pathToFile) {
		this.pathToFile = pathToFile;
	}
}
