package edu.qust.Book1.constant;

public enum ErrorEnum {

	
    Unlogin("用户还没有登陆系统", 101),
    UnknownAccount("无效的账户", 102), 
    IncorrectCredentials("错误的密码", 103);
	
	
    // 成员变量
    private String errorName;
    private int errorCode;
    
    // 构造方法
    private ErrorEnum(String errorName, int errorCode) {
        this.errorName = errorName;
        this.errorCode = errorCode;
    }

    // 普通方法
    public static String getErrorName(int code) {
        for (ErrorEnum c : ErrorEnum.values()) {
            if (c.getErrorCode() == code) {
                return c.getErrorName();
            }
        }
        return null;
    }

	public String getErrorName() {
		return errorName;
	}

	public void setErrorName(String errorName) {
		this.errorName = errorName;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
    
    
}
