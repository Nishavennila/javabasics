package com.personal;

public class NishaProfile implements IProfile{

	@Override
	public void myBasicInfo() {
		// TODO Auto-generated method stub

		System.out.println(ProfileConstants.FIRST_NAME+"nisha");
		System.out.println(ProfileConstants.AGE+"20");
	}

	@Override
	public void myHobbies() {
		// TODO Auto-generated method stub
		System.out.println("write");
		
	}
}
