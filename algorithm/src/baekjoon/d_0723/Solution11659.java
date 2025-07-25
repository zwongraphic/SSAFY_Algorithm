package baekjoon.d_0723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1차원 배열 구간합
public class Solution11659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st1.nextToken());
		int M = Integer.parseInt(st1.nextToken());
		int nums[] = new int[N];
		int sums[] = new int[N];

		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st2.nextToken());
		}

		sums[0] = nums[0];
		for (int i = 1; i < N; i++) {
			sums[i] = sums[i - 1] + nums[i];
		}

		for (int i = 0; i < M; i++) {
			StringTokenizer st3 = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st3.nextToken());
			int t = Integer.parseInt(st3.nextToken());
			if (s == 1) {
				System.out.println(sums[t - 1]);
			} else {
				System.out.println(sums[t - 1] - sums[s - 2]);
			}
		}
	}
}
