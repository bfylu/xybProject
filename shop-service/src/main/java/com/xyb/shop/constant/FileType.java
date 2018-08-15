package com.xyb.shop.constant;

public enum FileType {

	IMAGE(1);

	private int value;

	private FileType(int value) {
		this.value = value;
	}

	public int getValue() {

		return value;
	}

	public static FileType valueOf(int value) {

		switch (value) {
		case 1:
			return IMAGE;

		default:
			break;
		}
		
		return null;
		
	}
	
}
