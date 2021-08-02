package day2;

import java.util.Scanner;

public class beakJun_1244 {

	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		int swNum=sc.nextInt();
		int[] onOff=new int[swNum];
		String result;
		
		for(int i=0;i<swNum;i++) {
			 onOff[i]=sc.nextInt();
		}		
		
		int stuNum=sc.nextInt();
		
		
		int [][] stuOnOff= new int[stuNum][2];
		
		for(int i=0;i<stuNum;i++) {
			stuOnOff[i][0]=sc.nextInt();		//남여
			stuOnOff[i][1]=sc.nextInt();		//번호
			
			if(stuOnOff[i][0]==1)	// 남자
			{					
				for(int j=0;j<swNum;j++) {
					
					if((j+1)%stuOnOff[i][1]==0) {		//배수이면
						if (onOff[j]==1)  onOff[j]=0;	//스위치 바꾸기
						else onOff[j]=1; 
					}
				}
			}
			if(stuOnOff[i][0]==2)	// 여자 
			{
				int range=0;
				while(true) {	
					if(stuOnOff[i][1]-1-range==0||stuOnOff[i][1]-1+range==swNum-1) 	break;
					else {
						
						if(onOff[stuOnOff[i][1]-1+range]==onOff[stuOnOff[i][1]-1-range]) range++;
						else break;	
						
						}
					}
				for(int j=(stuOnOff[i][1]-1)-range;j<=(stuOnOff[i][1]-1)+range;j++) {
					if (onOff[j]==1)  onOff[j]=0;
					else onOff[j]=1;
				}
			}
			}
		for(int i=0;i<swNum;i++) {
			System.out.print(onOff[i]+" ");				
		}
		
	}
}

