//�ⲿ��HelloWorld
public class HelloWorld{
    
    //�ⲿ���˽������name
    private String name = "imooc";
    
    //�ⲿ��ĳ�Ա����
    int age = 20;
    
	//��Ա�ڲ���Inner
	public class Inner {
		String name = "��Ľ��";
        //�ڲ����еķ���
		public void show() { 
			System.out.println("�ⲿ���е�name��" + HelloWorld.this.name);
			System.out.println("�ڲ����е�name��" + name);
			System.out.println("�ⲿ���е�age��" + age);
		}
	}
    
	//���Գ�Ա�ڲ���
	public static void main(String[] args) {
        
        //�����ⲿ��Ķ���
		HelloWorld o = new HelloWorld (); 
        
        //�����ڲ���Ķ���
		Inner inn = o.new Inner();
        
        //�����ڲ�������show����
		inn.show();
	}
}