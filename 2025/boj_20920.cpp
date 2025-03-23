#include <iostream>
#include <unordered_map>
#include <vector>
#include <algorithm>
using namespace std;

bool cmp(pair<string, int> a, pair<string, int> b)
{
    if (a.second != b.second) {
        return a.second > b.second; // 빈도수 내림차순
    }
    if (a.first.length() != b.first.length()) {
        return a.first.length() > b.first.length(); // 길이 내림차순
    }
    return a.first < b.first; // 사전순 오름차순
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);

    int N = 0, M = 0;
    cin >> N >> M;

    unordered_map<string, int> wordList;
    
    string input;
    for(size_t i = 0; i < N; ++i)
    {
        cin >> input;
        if(input.length() < M)
        {
            continue;
        }        
        ++wordList[input];
    }
    vector<pair<string, int>> arr(wordList.begin(), wordList.end());
    
    sort(arr.begin(), arr.end(), cmp);

    for(auto it : arr)
    {
        cout << it.first << "\n";
    }
    return 0;
}