package com.lflytek.design.factory.abs.pizza;

public class BJCheesePizza extends Pizza {

	@Override
	public void prepare() {
		setName("北京的奶酪pizza");
		System.out.println(" 北京的奶酪pizza 准备原材料");
	}

}
