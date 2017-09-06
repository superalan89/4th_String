import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
/**
 * �ζǹ�ȣ �����⸦ ����
 * 
 * 6�ڸ� 1~45
 * 
 * */
public class AlgoMath {

	public int[] getLottoNumbers() {
	    int[] result = new int[6];     
		Random random = new Random();
	    
       for(int i = 0; i < 6; i++) {
    	   
    	   // random �Լ����� �߻��Ǵ� ������ �ߺ��� �� �մ�
    	   // �Ʒ��������� ������� ó���� 33�� ������ ���
    	   // �ι�° ���̽������� 33�� ���� �� �ִ�.
    	   
    	   int temp = random.nextInt(45) + 1;
    	   result[i] = temp;
    	   
    	   
    	   // �ߺ����� ���� ����ó��
    	   for(int j = 0; j < i; j++) {
    		   if (temp == result[j]) {
    			   
    		   }
    	   }
       }
	    
		return result;
	}

	
	public int[] getlottonNumbers2() {
		int[] result = new int[6];
		
		Random random = new Random();
		int temp = 0;
		int cnt = 0;
		for(int i=0; i<result.length ; i++) {
			temp = random.nextInt(45)+1;
			if(cnt > 0) {
				for(int item : result) {
					while (item == temp) {
						temp = random.nextInt(45)+1;
					}
				}
			}
			result[cnt] = temp;
			cnt++;
		}		
		return result;
	}
	
	public ArrayList<Integer> getLottonumbers3() {
		ArrayList<Integer> result = new ArrayList<>();
		Set<Integer> treeSet = new TreeSet<>();
		Random random = new Random();
		
		// ���� �迭 - ũ�⸦ �������� �ʴ� ��ü �迭
		// ���� : List, Set, Map
		// List = �ε����� ���� ������ �ִ� �迭
		// Set = ����Ʈ�� �����ѵ� �ߺ����� �Էµ��� �ʴ´�
		// Map = Ű�� ���� ������ �ִ� ���� �迭, ���� �ߺ��� ���ȴ�.
		// Map map = new HashMap();
		//     map.put("Ű", 33);
		
		
		for( /*���۰�*/; 6 > treeSet.size();) { /*������ �� ��� �������� �� �� ����*/
			treeSet.add(random.nextInt(45)+1);
		}
		
		Iterator<Integer> iterator = treeSet.iterator();
		
		while(iterator.hasNext()) {
			result.add(iterator.next());
		}
		return result;
	}
	
	/**
	 * �Ƴ��׷� �˰���
	 * 
	 * �ΰ��� ���ڿ� �Է��� �޾Ƽ� �ΰ��� ���谡 �Ƴ��׷� �������� Ȯ���ϴ�
	 * ���α׷��� ����
	 * 
	 * option. ���� ���ڿ��� ��������
	 * 1. ���� ���ڿ��� ���̸� üũ -> ���̰� �ٸ��� �˻����� �ʴ´�.
	 * 2. ���� ���ڿ��� ����
	 * 3. ���ĵ� ���ڿ��� ��
	 * 
	 * cat -> act
	 * was it a cat i saw -> was it a cat is
	 * listen -> silent
	 * 
	 * */
	
	
	public boolean checkAnagram(String a, String b) {
		boolean result = false;
		
		// ��ҹ��� ó��
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		// ��������
		a = a.replace(" ", "");
		b = b.replace(" ", "");
		
		// ���� ��
		if (a.length() != b.length()) {
			return false;
		} 
		
		// ������ �ϱ� ���ؼ� char �迭�� ����
		char aTemp[] = a.toCharArray();
		char bTemp[] = b.toCharArray();
		
		// ĳ���� �迭 ����
		Arrays.sort(aTemp);
		Arrays.sort(bTemp);
	
		// ���ڿ� ���� ����
		return Arrays.equals(aTemp, bTemp);
		}
	
		public void testMath() {
		
		// ���밪 ���ϱ�
		int a = Math.abs(-123);
		
		// �ݿø�
		long b = Math.round(123.5);
		
		// �ø�
		double c = Math.ceil(343.1543);
		
		// ����
		double d = Math.floor(563.8);
		
		Math.random();
		
		Random random = new Random(); // 0���� ũ�ų� ���� 1���� 
		
		// 1���� 100������ ������ ���� ��������
		random.nextInt(100); // -> 0~99 ������ ������ ����
		int r = random.nextInt(100) + 1;
		
	}
	
}
