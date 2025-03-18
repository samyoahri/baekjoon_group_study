#include<iostream>
#include<set>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);

    int N = 0;
    cin >> N;

    string input;


    unsigned long long int res = 0;
    set<string> personList;
    for(int i = 0; i < N; ++i)
    {
        // ENTER 혹은 사람 리스트트
        cin >> input;

        if(0 == input.compare("ENTER"))
        {
            res += personList.size();
            personList.clear();
        }
        else
        {
            personList.insert(input);
        }
    }
    res += personList.size();

    cout << res;

    return 0;
}