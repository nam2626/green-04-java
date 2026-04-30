package e02_text_io;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class LottoMain {
	public static TreeSet<Integer> createLotto(){
		TreeSet<Integer> set = new TreeSet<Integer>();
		Random r = new Random();
		while(set.size()<6)
			set.add(r.nextInt(45)+1);
		return set;
	}
	public static String makeText(ArrayList<TreeSet<Integer>> list) {
		String result = "";
		
		
		
		return result;
	}
	public static void main(String[] args) {
		//1. 로또 번호 셋트 저장할 리스트
		ArrayList<TreeSet<Integer>> list = new ArrayList<TreeSet<Integer>>();
		//2. 로또번호 한셋트씩 생성해서 받아서 리스트에 저장
		while(list.size()<5)
			list.add(createLotto());
		
		for(TreeSet<Integer> s : list)
			System.out.println(s);
	}

}




