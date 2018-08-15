package com.xyb.ai.common;

public final class Constants {
	private Constants(){}

    //账号管理
	//独立模式账号导入接口
	public static final String ACCOUNT_IMPORT = "https://console.tim.qq.com/v4/im_open_login_svc/account_import?usersig={0}&identifier={1}&sdkappid={2}&random={3}&contenttype=json";

	//账号管理
	//独立模式帐号批量导入接口
	public static final String MULTIACCOUNT_IMPORT = "https://console.tim.qq.com/v4/im_open_login_svc/multiaccount_import?usersig={0}&identifier={1}&sdkappid={2}&random={3}&contenttype=json";
}
