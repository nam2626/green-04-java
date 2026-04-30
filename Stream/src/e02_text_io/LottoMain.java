package e02_text_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
		result += String.format("%18s\n", "LOTTO");
		result += "--------------------------------\n";
		for(int i=0;i<list.size();i++) {
			String numbers = "";
			for(int n : list.get(i)) {
				numbers += String.format("%02d ", n);
			}
			result += String.format("%5dset %s\n", i+1, numbers);
		}
		result += "--------------------------------\n";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		result += "  판매시간 : " + sdf.format(new Date()) + "\n";
		result += "--------------------------------\n";
		
		return result;
	}
	public static void createFile(String str) {
		try(FileWriter fw = new FileWriter("lotto.txt");
			PrintWriter pw = new PrintWriter(fw);){
			pw.println(str);
			System.out.println("파일 출력 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		//1. 로또 번호 셋트 저장할 리스트
		ArrayList<TreeSet<Integer>> list = new ArrayList<TreeSet<Integer>>();
		//2. 로또번호 한셋트씩 생성해서 받아서 리스트에 저장
		while(list.size()<5)
			list.add(createLotto());
		
//		for(TreeSet<Integer> s : list)
//			System.out.println(s);
		
		//3. 출력 형식 확인
		System.out.println(makeText(list));
		
		//4. 파일 출력
		createFile(makeText(list));
	}

}




