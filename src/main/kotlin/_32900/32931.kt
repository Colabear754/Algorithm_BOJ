package _32900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val grid = Array(2) { StringTokenizer(readLine()).run { LongArray(n) { nextToken().toLong() } } }
    val dp = Array(n) { LongArray(n) }
    dp[0][0] = maxOf(grid[0][0], grid[0][0] + grid[1][0])
    dp[1][0] = grid[0][0] + grid[1][0]
    for (i in 1..<n) {
        dp[0][i] = (dp[0][i - 1] + grid[0][i]).let { maxOf(it, it + grid[1][i], dp[1][i - 1] + grid[0][i] + grid[1][i]) }
        dp[1][i] = (dp[1][i - 1] + grid[1][i]).let { maxOf(it, it + grid[0][i], dp[0][i - 1] + grid[0][i] + grid[1][i]) }
    }
    println(dp[1].last())
}

/** 코틀린으로 제출했을 때 자꾸 런타임 에러가 나서 C++로 제출한 코드
 *
 * #include <iostream>
 * #include <algorithm>
 * #define ll long long
 * using namespace std;
 *
 * ll grid[2][200002];
 * ll dp[2][200002];
 *
 * int main() {
 *     ios_base::sync_with_stdio(false); cin.tie(nullptr);
 *     int n;
 *     cin >> n;
 *     for (auto & i : grid) {
 *         for (int j = 0; j < n; ++j) {
 *             cin >> i[j];
 *         }
 *     }
 *     dp[1][0] = grid[0][0] + grid[1][0];
 *     dp[0][0] = max(grid[0][0], dp[1][0]);
 *     for (int i = 1; i < n; ++i) {
 *         ll top = dp[0][i - 1] + grid[0][i];
 *         dp[0][i] = max({top, top + grid[1][i], dp[1][i - 1] + grid[0][i] + grid[1][i]});
 *         ll bottom = dp[1][i - 1] + grid[1][i];
 *         dp[1][i] = max({bottom, bottom + grid[0][i], dp[0][i - 1] + grid[0][i] + grid[1][i]});
 *     }
 *     cout << dp[1][n - 1];
 *     return 0;
 * }
 */