#include<iostream>
#include<vector>
#include<algorithm>
#include<assert.h>
#include<map>
#include<cmath>
using namespace std;

double customRound(double num, const int n)
{
    double tmp = num * (pow(10, n));
    tmp = round(tmp);
    return tmp / (pow(10, n));

}
int GetAvg(const vector<int>& arr)
{
    long long int sum = 0;
    for(size_t i = 0; i < arr.size(); ++i )
    {
        sum += arr[i];
    }
    return customRound((double)sum / (double)arr.size(), 0);
}

int GetMedian(vector<int> arr)
{
    assert(arr.size()%2 != 0);

    sort(arr.begin(), arr.end());

    return arr[arr.size()/2];
}

int GetMostFreq(const vector<int>& arr)
{
    map<int, int> freqMap;
    for (int num : arr) {
        freqMap[num]++;
    }

    if (freqMap.empty()) {
        return -2147000000; // 빈 배열 처리
    }

    int maxFreq = 0;
    for (auto const& [num, freq] : freqMap) {
        if (freq > maxFreq) {
            maxFreq = freq;
        }
    }

    vector<int> mostFrequentNumbers;
    for (auto const& [num, freq] : freqMap) {
        if (freq == maxFreq) {
            mostFrequentNumbers.push_back(num);
        }
    }

    sort(mostFrequentNumbers.begin(), mostFrequentNumbers.end());

    if (mostFrequentNumbers.size() >= 2) {
        return mostFrequentNumbers[1];
    } else {
        return mostFrequentNumbers[0];
    }
}
int absolute(int a)
{
    return a > 0 ? a : -a;
}
int GetMinMaxRange(vector<int> arr)
{
    sort(arr.begin(), arr.end());

    return arr[arr.size()-1] - arr[0];
}
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);

    int N = 0;
    cin >> N;

    int num = 0;
    vector<int> arr(N);
    for(int i = 0; i < N; ++i)
    {
        cin >> arr[i];
    }

    

    double arthAvg = GetAvg(arr);

    int median = GetMedian(arr);

    int mostFrequency = GetMostFreq(arr);

    int minMaxRange = GetMinMaxRange(arr);

    cout << fixed;
    cout.precision(0);
    cout << arthAvg << "\n";
    
    cout << median << "\n";
    cout << mostFrequency << "\n";
    cout << minMaxRange << "\n";

    return 0;
}