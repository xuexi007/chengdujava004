package com.offcn.wxpay;

public interface Pay {

	public void payMoney(float money);
	public boolean isOk(String number);
}
