package com.offcn.wxpay;

public class PayImpl implements Pay {

	@Override
	public void payMoney(float money) {
		System.out.println("微信支付:"+money);

	}

	@Override
	public boolean isOk(String number) {
		System.out.println("支付状态查询结果:"+number);
		return true;
	}

}
