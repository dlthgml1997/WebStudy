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
			
		System.out.println("코인이름:"+name+"\n마지막체결가(BTC):"+weight +" BTC\n마지막 체결가($): $"+ratio+"\n전일대비:"
				+price+"%\n24시간거래량:"+display+"\n코인단위:"
				+made_in+"\n마켓캡: "+number
				+"\nBinance상장 여부: "+b);
		
		

	}

}
