package week6;

class Score {

	public static void main(String[] args) {
		double[][][] allScores = new double[][][]{
			{{7.5,20.5},{9.0,22.5},{15,33.5},{13,21.5},{15,2.5}},
			{{4.5,21.5},{9.0,22.5},{15,34.5},{12,20.5},{14,9.5}},
			{{6.5,30.5},{9.4,10.5},{11,33.5},{11,23.5},{10,2.5}},
			{{6.5,23.5},{9.4,32.5},{13,34.5},{11,20.5},{16,7.5}},
			{{8.5,26.5},{9.4,52.5},{13,36.5},{13,24.5},{16,2.5}},
			{{9.5,20.5},{9.4,42.5},{13,31.5},{12,20.5},{16,6.5}},
			{{1.5,29.5},{6.4,22.5},{14,30.5},{10,30.5},{16,6.0}}};
			double[] totalScore = totalScore(allScores);
			double[] averageScoreC = averageScoreC(allScores);
			double[] averageScoreP = averageScoreP(allScores);
			for(int n = 0;n<7;n++) {
			System.out.println("第"+(n+1)+"个学生的总分数是："+totalScore[n]+"\t选择平均："+averageScoreC[n]/5+"\t 程序平均："+averageScoreP[n]/5);
			}
			highestScore(totalScore);
	}
		public static double[] totalScore(double[][][] allscore) {
			int n;//学生循环
			int i;//考试循环
			int j;//分数循环
			double[] totalScore = new double[7];//7人的对应总分；
			for(n=0;n<7;n++) {
				for(i=0;i<5;i++) {
					for(j=0;j<2;j++) {
				totalScore[n]+=allscore[n][i][j];
		}}}
			return totalScore;
}
		public static double[] averageScoreP(double[][][] allscore) {//P是program；
			int n;
			int i;
			double[] averageScoreP = new double[7];//7人的程序对应总分，平均分在外面输出的时候除5;
			for(n=0;n<7;n++) {
				for(i=0;i<5;i++) {
					averageScoreP[n]+=allscore[n][i][1];//因为每个人的程序分式固定的三维数组中第三个为1；所以无需分数循环；
		}}return averageScoreP;
				}
		public static double[] averageScoreC(double[][][] allscore) {//C是choose；
			int n;
			int i;
			double[] averageScoreC = new double[7];//7人的程序对应总分，平均分在外面输出的时候除5;
			for(n=0;n<7;n++) {
				for(i=0;i<5;i++) {
					averageScoreC[n]+=allscore[n][i][0];//因为每个人的程序分式固定的三维数组中第三个为1；所以无需分数循环；
		}}return averageScoreC;
		}
		public static void highestScore(double[] totalScore) {
			int index = 0;
			double hightestScore = totalScore[0];
			for(int i = 1;i<7;i++)
			if(totalScore[i-1]<totalScore[i]) {
				hightestScore = totalScore[i];
				index = i;
				}
			System.out.println("第"+(index+1)+"个同学最高分为: "+hightestScore);
			
		}
		}
	