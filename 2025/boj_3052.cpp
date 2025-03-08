#include <iostream>
#include <set>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);

    set<size_t> remainders;

    for(size_t i = 0 ; i < 10; ++i)
    {
        int tmp;
        cin >> tmp;
        remainders.insert(tmp%42);
    }

    cout << remainders.size() << endl;

}