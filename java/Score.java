public class Score{
	public static void main(String[] args){
	int score = 53;
	int cnt=0, i;
	System.out.println("�ӷ�ǰ�ɼ���" + score);
	for(i=0; i<= 100; i++){
	if(score<60){
		score++;
		cnt++;
	}else{
		break;
	}
	}
	System.out.println("�ӷֺ�ɼ���" + score);
	System.out.println("������" + cnt + "�Σ�");
	}
}