package com.eduLooping;

public class EvenOddSumProg {

	public static void main(String[] args) {

		int n=100;
		int sumEven=0;
		int sumOdd=0;
		for(int i=0;i<=n;i++) {

			if(i%2==0) {
				sumEven=sumEven+i;
			}else {
				sumOdd=sumOdd+i;
			}
		}
				System.out.println("Sum of even= "+sumEven);
				System.out.println("Sum of odd= "+sumOdd);
			}
		}