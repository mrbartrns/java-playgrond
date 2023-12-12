package algorithm;

// https://www.acmicpc.net/problem/2525

public class B2525 {
    /**
     * 
     * @param hour 현재 시간
     * @param minute 현재 분
     * @param t 필요한 시간(분)
     * @return 오븐구이가 끝나는 시간
     */
    public int[] solve(int hour, int minute, int t) {
        int totalNeededMinutes = minute + t;
        int neededHour = totalNeededMinutes / 60;
        int neededMinute = totalNeededMinutes % 60;
        int totalHour = (hour + neededHour) % 24;

        int[] answer = {totalHour, neededMinute};

        return answer;
    }
}
