
public class StringApi {
	public void text() {
		String a = "String/Text";
		
		// ����
		System.out.println(a.length());
		
		// ��ġ�˻�
		System.out.println(a.indexOf("Test"));
		
		// Ư�� �����ڷ� ����  ex) String�̶� Text�� ������
		String[] temp = a.split("/");
		
		for (String item : temp) {
			System.out.println(item);
		}
		
		
		// �� ���ڿ��� �ڸ��� ���� �ϳ� ������ �ɰ��ش�
		String temp2[] = a.split("");
		
		// ���ڿ� �ڸ���
		System.out.println(a.substring(2,7));
		
		// ���ڿ� �ٲٱ�
		System.out.println(a.replace("Te", "Px"));
		
		// Ư�� ���ڿ��� ���۵Ǵ����� �˻� ex) ���ͳ� �ּҰ� �������� �ּ����� Ȯ���Ҷ� ���
		a.startsWith("Str");  //Str�� ���۵Ǹ� true���� �����ش�. 
		
		String address = "naver.com";
		
		if(!address.startsWith("http:")) {
			address = "http://" + address;
		}		
	}
	
	public void builderVsBuffer() {
		// jdk 1.5 ���� �̻���ʹ� �Ϲ����� ��Ʈ�� ������ StringBuilder�� Ŀ���Ϸ��� �ڵ���ȯ ���ش�.
		String result = "��" + "����" + "����" + "! �ݰ����ϴ�";
		
	
		StringBuffer buffer = new StringBuffer();
		buffer.append("��");
		buffer.append("����").append("����");
		buffer.append("�ݰ����ϴ�");
		
		System.out.println(buffer.toString());
		
		// �ӵ� ���� ����
		// �񵿱⿡�� �������� ������� �ʴ´�.
		// ���� thread ȯ�濡���� StringBuilder�� ������ ������� �ʴ´�.
		StringBuilder builder = new StringBuilder();
		builder.append("��");
		builder.append("����").append("����");
		builder.append("�ݰ����ϴ�");
		System.out.println(builder.toString());
		
	}
	
	public void stringConstantPool() {
		String a = "�ȳ��ϼ���";
		String b = "�ȳ��ϼ���";
		
		System.out.println(a==b);  // �ּ�üũ
		System.out.println(a.equals(b)); // ��üũ
		
		String c = new String("�ȳ��ϼ���"); 
		
		String d = c.intern(); //new�� ������� ��ü�� constant pool�� �̵���Ų��.

	}
}
