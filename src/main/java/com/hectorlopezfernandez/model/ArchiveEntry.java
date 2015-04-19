package com.hectorlopezfernandez.model;

import org.joda.time.DateTime;

public class ArchiveEntry {

	private int year;
	private int month;

	// getters sinteticos
	
	public DateTime getDate() {
		DateTime dt = new DateTime(year, month, 1, 0, 0);
		return dt;
	}
	
	// getters & setters
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	public int getMonth() {
		return month;
	}

}