package com.hxlxz.zxl;

public class TryCatch {

	public static void main(String[] args) {
		TryCatch tc = new TryCatch();
		int re = tc.test();
		System.out.println("返回值：" + re);
		int test2 = tc.test2();
		System.out.println("test2:"+test2);
	}
	public int test(){
		int divider=10;
		int result=10;
		try{
			while(divider>-1){
				divider--;
				result = result + 100/divider;
			}
			return result;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("抛出异常！");
			return -1;
		}
	}
	public int test2(){
		int divider=10;
		int result=100;
		try{
			while(divider > -1){
				divider--;
				result = result + 100/divider;
			}
			return result;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("抛出异常！2");
			return -1;
		}finally{
			System.out.println("finally!");
		}
	}
	

}
