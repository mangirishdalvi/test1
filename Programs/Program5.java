
public class Program5 {
	static int scoreUp(String[] keySet, String[] answerSet) {
		int score = 0;

		for (int i = 0; i < keySet.length; i++) {
			if (answerSet[i].equals("?"))
				continue;
			else if (keySet[i].equals(answerSet[i]))
				score += 4;
			else
				score -= 1;
		}
		return score;
	}

	public static void main(String[] args) {
		String[] answers, key;
		key = new String[] { "a", "a", "b", "b" };
		answers = new String[] { "a", "c", "b", "c" };
		System.out.println(scoreUp(key, answers));
	}

}
