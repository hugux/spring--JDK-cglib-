package com.bjsxt.secretary;

import com.bjsxt.boss.Boss;

public class Secretary {
	Boss b = new Boss();
	public void eat() {
		System.out.println("��ԤԼ����");
		b.eat();
		System.out.println("�Ǽ�ʱ��");
	}
}
