package com.prac1;

public class Ethereum {

	public static void main(String[] args) {
		String name = "Ethereum";
		double weight = 0.021914;
		float price = -8.28f;
		double display = 11364.66;
		String made_in = "ETH";
		String number = "$24,072.25M";
		float ratio = 225.21f;	
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