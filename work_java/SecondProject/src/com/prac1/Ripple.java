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
			
		System.out.println("코인이름:"+name+"\n마지막체결가(BTC):"+weight +" BTC\n마지막 체결가($): $"+ratio+"\n전일대비:"
				+price+"%\n24시간거래량:"+display+"\n코인단위:"
				+made_in+"\n마켓캡: "+number
				+"\nBinance상장 여부: "+b);

	}

}
