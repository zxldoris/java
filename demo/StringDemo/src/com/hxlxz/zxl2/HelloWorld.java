package com.hxlxz.zxl2;

public class HelloWorld {
    public static void main(String[] args) {
		// ����һ���ַ���
		String s = "aljlkdsflkjsadjfklhasdkjlflkajdflwoiudsafhaasdasd";
        
        // ���ִ���
		int num = 0;
        byte[] b = s.getBytes();
         // ѭ������ÿ���ַ����ж��Ƿ����ַ� a ������ǣ��ۼӴ���
		for (int i=0;i<s.length();i++)
		{
            
            // ��ȡÿ���ַ����ж��Ƿ����ַ�a
			if (b[i] == 'a') {
                // �ۼ�ͳ�ƴ���
				num++; 
			}
		}
		System.out.println("�ַ�a���ֵĴ�����" + num);
	}
}