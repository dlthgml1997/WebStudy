package com.prac1;

public class Ripple {

	public static void main(String[] args) {
		String name = "Ripple";
		double weight = 0.00003036;
		float price = -2.71f;
		double display = 3239.07;
		String made_in = "XRP";
		String number = "$13,280.95M";
		float ratio = 0.312004f;	
		boolean CD = true;
		String b = "";
		if (CD == true)
			b = "YES";
		else 
			b = "NO";
			
		System.out.println("�����̸�:"+name+"\n������ü�ᰡ(BTC):"+weight +" BTC\n������ ü�ᰡ($): $"+ratio+"\n���ϴ��:"
				+price+"%\n24�ð��ŷ���:"+display+"\n���δ���:"
				+made_in+"\n����ĸ: "+number
				+"\nBinance���� ����: "+b);

	}

}