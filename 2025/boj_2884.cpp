#include <iostream>
#include <vector>
#include <sstream>
using namespace std;

vector<string> split(string input, char del)
{
    istringstream iss(input);
    string buffer;

    vector<string> res;
    
    while(getline(iss, buffer, del))
    {
        res.push_back(buffer);
    }
    return res;
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);

    string input;
    getline(cin, input);

    vector<string> TimeData = split(input, ' ');

    int Hour = stoi(TimeData[0]);
    int Min = stoi(TimeData[1]);

    int TotalMin = Hour * 60 + Min;

    int EarlyTotalMin = TotalMin - 45;

    if(EarlyTotalMin < 0)
    {
        EarlyTotalMin = 60 * 24 - abs(EarlyTotalMin);
    }

    cout << EarlyTotalMin / 60 << " " << EarlyTotalMin % 60 << "\n";

    return 0;
}