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
			System.out.println("��"+(n+1)+"��ѧ�����ܷ����ǣ�"+totalScore[n]+"\tѡ��ƽ����"+averageScoreC[n]/5+"\t ����ƽ����"+averageScoreP[n]/5);
			}
			highestScore(totalScore);
	}
		public static double[] totalScore(double[][][] allscore) {
			int n;//ѧ��ѭ��
			int i;//����ѭ��
			int j;//����ѭ��
			double[] totalScore = new double[7];//7�˵Ķ�Ӧ�ܷ֣�
			for(n=0;n<7;n++) {
				for(i=0;i<5;i++) {
					for(j=0;j<2;j++) {
				totalScore[n]+=allscore[n][i][j];
		}}}
			return totalScore;
}
		public static double[] averageScoreP(double[][][] allscore) {//P��program��
			int n;
			int i;
			double[] averageScoreP = new double[7];//7�˵ĳ����Ӧ�ܷ֣�ƽ���������������ʱ���5;
			for(n=0;n<7;n++) {
				for(i=0;i<5;i++) {
					averageScoreP[n]+=allscore[n][i][1];//��Ϊÿ���˵ĳ����ʽ�̶�����ά�����е�����Ϊ1�������������ѭ����
		}}return averageScoreP;
				}
		public static double[] averageScoreC(double[][][] allscore) {//C��choose��
			int n;
			int i;
			double[] averageScoreC = new double[7];//7�˵ĳ����Ӧ�ܷ֣�ƽ���������������ʱ���5;
			for(n=0;n<7;n++) {
				for(i=0;i<5;i++) {
					averageScoreC[n]+=allscore[n][i][0];//��Ϊÿ���˵ĳ����ʽ�̶�����ά�����е�����Ϊ1�������������ѭ����
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
			System.out.println("��"+(index+1)+"��ͬѧ��߷�Ϊ: "+hightestScore);
			
		}
		}
	