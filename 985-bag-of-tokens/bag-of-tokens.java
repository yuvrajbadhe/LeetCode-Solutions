
class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);

        int score = 0;
        int maxscore = 0;

        int s = 0;
        int e = tokens.length - 1;

        while (s <= e) {
            if (power >= tokens[s]) {
                power = power - tokens[s];
                score++;
                s++;
                maxscore = Math.max(maxscore, score);
            }
            else if (score > 0 && s < e) {
                power = power + tokens[e];
                score--;
                e--;
            }
            else {
                break;
            }
        }

        return maxscore;
    }
}
