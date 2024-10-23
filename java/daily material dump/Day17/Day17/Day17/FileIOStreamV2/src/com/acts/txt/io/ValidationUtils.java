package com.acts.txt.io;

import java.time.LocalDate;

public class ValidationUtils {
	public static LocalDate validatePublishDate(String strDob) {
		LocalDate publishDate = LocalDate.parse(strDob);
		LocalDate today = LocalDate.now();
		
		if(publishDate.isBefore(today)) {
			return publishDate;
		}
		return null;
	}

}
