package com.kodnest.august.controlconstructs;

public class SwitchCC {

	public static void main(String[] args) {
		
		float num=1.02f;
		switch(num)
		{
		case 0.02: System.out.println("hi float1");
		break;
		
		case 0.04: System.out.println("hi float2");
		break;
			
		case 1.06: System.out.println("hi float3");
		break;
			
		case 1.02: System.out.println("hi float4");
		break;
		
		default: System.out.println("hi default");
			
			
		}

	}

}
