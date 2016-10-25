public class Score{
	public static void main(String[] args){
	int score = 53;
	int cnt=0, i;
	System.out.println("加分前成绩：" + score);
	for(i=0; i<= 100; i++){
	if(score<60){
		score++;
		cnt++;
	}else{
		break;
	}
	}
	System.out.println("加分后成绩：" + score);
	System.out.println("共加了" + cnt + "次！");
	}
}