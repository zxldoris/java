package com.hxlxz.zxl;

public class HelloWorld {
    public static void main(String[] args) {
        // Java�ļ���
		String fileName = "HelloWorld.java"; 
        // ����
		String email = "laurenyang@imooc.com";
		
		// �ж�.java�ļ����Ƿ���ȷ���Ϸ����ļ���Ӧ����.java��β
        /*
        �ο����裺
        1����ȡ�ļ��������һ�γ���"."�ŵ�λ��
        2������"."�ŵ�λ�ã���ȡ�ļ��ĺ�׺
        3���ж�"."��λ�ü��ļ���׺��
        */
        //��ȡ�ļ��������һ�γ���"."�ŵ�λ��
		int index = fileName.lastIndexOf('.');
        
        // ��ȡ�ļ��ĺ�׺
		String prefix = fileName.substring(10);
        
		// �жϱ������"."�ţ��Ҳ��ܳ�������λ��ͬʱ��׺��Ϊ"java"
		if (fileName.indexOf('.')>0 &&(fileName.lastIndexOf(".java") == (fileName.length()-5))) {
			System.out.println("Java�ļ�����ȷ");
		} else {
			System.out.println("Java�ļ�����Ч");
		}

        // �ж������ʽ�Ƿ���ȷ���Ϸ���������������Ҫ����"@", ����"@"����"."֮ǰ
         /*
        �ο����裺
        1����ȡ�ļ�����"@"���ŵ�λ��
        2����ȡ������"."�ŵ�λ��
        3���жϱ������"@"���ţ���"@"������"."֮ǰ
        */
	    // ��ȡ������"@"���ŵ�λ��
		int index2 = email.indexOf('@');
        
        // ��ȡ������"."�ŵ�λ��
		int index3 = email.indexOf('.');
        
		// �жϱ������"@"���ţ���"@"������"."֮ǰ
		if (index2 != -1 && index3 > index2) {
			System.out.println("�����ʽ��ȷ");
		} else {
			System.out.println("�����ʽ��Ч");
		}
	}
}