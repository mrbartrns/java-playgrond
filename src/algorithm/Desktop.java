package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

class Solution {
    public int[] solution(String[] wallpaper) {
        List<int[]> positions = new ArrayList<>();

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                char c = wallpaper[i].charAt(j);

                if (c == '#') {
                    int[] position = {i, j};
                    positions.add(position);
                }
            }
        }
        return getMinMaxPosition(positions);
    }

    int[] getMinMaxPosition(List<int[]> positions) {
        // do nothing

        List<Integer> positionY = new ArrayList<>();
        List<Integer> positionX = new ArrayList<>();

        for (int i = 0; i < positions.size(); i++) {
            positionY.add(positions.get(i)[0]);
            positionX.add(positions.get(i)[1]);
        }

        Collections.sort(positionY);
        Collections.sort(positionX);

        int[] position = {positionY.get(0), positionX.get(0),
                positionY.get(positionY.size() - 1) + 1, positionX.get(positionX.size() - 1) + 1};


        return position;
    }
}


public class Desktop {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] wallpaper = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..",
                "...#.#...", "....#...."};
        System.out.println(Arrays.toString(s.solution(wallpaper)));
    }
}
