#include <iostream>
#include <set>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);

    int N = 0;
    cin >> N;
    set<string> personList; 
    for(int i = 0; i < N; ++i)
    {
        string A, B;
        cin >> A >> B;

        if(0 == A.compare("ChongChong"))
        {
            personList.insert(A);
        }
        if(0== B.compare("ChongChong"))
        {
            personList.insert(B);
        }

        if(personList.find(A) != personList.end())
        {
            personList.insert(B);
        }
        if(personList.find(B) != personList.end())
        {
            personList.insert(A);
        }
    }
    cout << personList.size();
    return 0;
}