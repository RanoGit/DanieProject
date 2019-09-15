package com.dani.practiceSample;

public class AddKbeforeFs {

	public static void main(String[] args){
		String word="Force";
		System.out.println(addKbeforeFs(word));

	}

	/*public static String SF(String word){

		if(word.contains("F")||word.contains("f")||word.contains("s")|| word.contains("S")){
			word="K"+word;
			//for(int i=0;i<)
			char[]s=word.toCharArray();
			for(int i=0;i<s.length;i++){
				if(s[i]=='F'||s[i]=='f'||s[i]=='S'||s[i]=='s'){

				}
			}
		}

		return word;
	}*/

	public static String addKbeforeFs(String text) {
		String str=text;
		for(int i=0; i<str.length();i++){
			if(str.charAt(i)=='f'||str.charAt(i)=='F'){
				if(i==0){
					str="K"+str;
					i++;
				}else{
					str=str.substring(0,i)+"K"+str.substring(i,str.length());
					i++;
				}
			}
		}
		return str;
	}

}
