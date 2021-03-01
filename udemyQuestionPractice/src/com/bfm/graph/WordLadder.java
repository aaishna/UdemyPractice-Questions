package com.bfm.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class WordLadder {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		//"hot","dot","dog","lot","log","cog"
		/*list.add("hot");
		list.add("dot");
		list.add("dog");
		list.add("lot");
		list.add("log");
		list.add("cog");*/
		list.add("a");
		list.add("b");
		list.add("c");
		int l = ladderLength("a", "c",list);
		System.out.println("length is "+l);

	}

	public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
		
		if(!wordList.contains(endWord))
			return 0;
		HashMap<String, Boolean> vmap = new HashMap<>();
		for(int i=0; i<wordList.size(); i++){
			vmap.put(wordList.get(i), false);
		}
		int length =1;
		Queue<String> qu = new LinkedList<>();
		qu.add(beginWord);
		
		while(!qu.isEmpty()){
			
			for(int i=0; i< qu.size() ; i++){
				String s=qu.poll();
				if(endWord.compareTo(s) == 0){
					return length;
				}		
				wordMatch(qu,s,vmap);
			}	
			length++;
		}
		return 0;
		
	}
	
	public static void wordMatch(Queue<String> qu, String s, Map<String, Boolean> vmap){
		String temp;
		char t;
		char[] arr = s.toCharArray();
		for(int i=0; i<arr.length; i++){
			t = arr[i];
			for(int j=97; j<=122; j++){	
				arr[i] = (char)j;
				temp = String.valueOf(arr);
				if(vmap.containsKey(temp) && vmap.get(temp) == false){
					
					if(temp.compareTo(s)!=0){
						qu.add(temp);
						vmap.put(temp, true);
					}
						
				}
			}
			arr[i] = t;
		}
		
	}

}
