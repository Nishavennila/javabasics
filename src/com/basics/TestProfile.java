package com.personal;

import java.nio.charset.MalformedInputException;

public class TestProfile extends SkProfile {
public static void printprofile(IProfile profile){
	profile.myBasicInfo();
	profile.myHobbies();
}
	public static void main(String[] args) {
		IProfile s1=new SkProfile();
		TestProfile.printprofile(s1);
	
	
	
	
	}





}

	
    