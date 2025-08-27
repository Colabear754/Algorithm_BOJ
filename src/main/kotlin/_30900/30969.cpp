#include <iostream>
using namespace std;

int n;
long long jinju;
int result;
int count[1001];
string destination;
long long cost;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cin >> n;
    for (int i = 0; i < n; ++i) {
        cin >> destination >> cost;
        if (destination == "jinju") {
            jinju = cost;
            continue;
        }
        if (cost > 1000L) {
            result++;
            continue;
        }
        count[cost]++;
    }
    for (long long i = jinju + 1; i <= 1000L; ++i) {
        result += count[i];
    }
    cout << jinju << '\n' << result;
    return 0;
}