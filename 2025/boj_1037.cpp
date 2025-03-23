#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);

    int N = 0;
    cin >> N;

    vector<int> iNumList(N, 0);

    for(int i = 0; i < N; ++i)
    {
        cin >> iNumList[i];
    }

    sort(iNumList.begin(), iNumList.end());

    int res = iNumList[0] * iNumList[iNumList.size()-1];

    cout << res;

    return 0;
}