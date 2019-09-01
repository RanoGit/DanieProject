package com.dani.practiceSample;

import java.util.ArrayList;

public class MergeStr {

	public static void main(String[] args){
		String[]words={"We","are about to","Eat"};
		String[]words2={"Stack","In","De brazil"};
		System.out.print(Merge(words,words2));
		
	}

	public static ArrayList<String> Merge(String[]words,String[]more){

		ArrayList<String> Sentence = new ArrayList<>();

		//for(String x:words)
			
		for(int i=0;i<words.length;i++)
			Sentence.add(words[i]);
		for(String y:more)
			Sentence.add(y);
		return Sentence;

	}

}
