package com.mypack;

import java.util.StringTokenizer;

public class FindParticularWordInString 
{
	public static void main(String[] args)
	{
		String st = "Maria Montessori, postulated that “play is the child’s work.” "
				+ "Montessori believed in sensory play, where the child learns through play from hands on experiences, "
				+ "with the help of a teacher helping the child play to learn. ";
		
//		String[] str = st.split(" ");
//		
//		int count = 0;
//		
//		for (String word : str) 
//		{
//			if(word.contains("ri"))
//			{
//				System.out.println(word+" ");
//				count++;
//			}
//		}
//		
//		System.out.println(count);
		
		System.out.println(args.length);
		
		StringTokenizer str = new StringTokenizer(st, " ");
		
		System.out.println(str.countTokens());
		
		while(str.hasMoreTokens())
		{
			String s = str.nextToken();
			
			if(s.contains("ri"))
			{
				System.out.println(s);
			}
		}
		
	
	}
}
