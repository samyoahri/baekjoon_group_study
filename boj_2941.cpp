#include<iostream>
#include<unordered_map>
using namespace std;

unordered_map<string, size_t> croatiaAlphabet = {
    {"c=", 0}, {"c-", 0}, 
    {"dz=", 0}, {"d-", 0}, 
    {"z=", 0},
    {"lj", 0}, {"nj", 0}, 
    {"s=", 0}, 
    };


void SetNumCroatiaAlpha(const string& word)
{
    for(size_t i = 0; i < word.length(); ++i)
    {
        string tmp = word.substr(i, 2);
        if(tmp == "dz")
        {
            tmp = word.substr(i, 3);
        }

        if(croatiaAlphabet.find(tmp) != croatiaAlphabet.end())
        {
            ++croatiaAlphabet[tmp];
            if(tmp == "dz=")
                i = i + 2;
            else
                i = i + 1;
        }
    }
}
size_t GetNumCroatiaAlpha(const string& word)
{
    size_t cnt = 0;
    SetNumCroatiaAlpha(word);
    
    for( pair<string, size_t> keyValue : croatiaAlphabet)
    {
        cnt += keyValue.second;
    }
    return cnt;
}
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);

    string input;
    cin >> input;

    size_t numCroatiaAlpha = GetNumCroatiaAlpha(input);

    size_t res = input.length() - numCroatiaAlpha - croatiaAlphabet["dz="];

    cout << res << "\n";

    return 0;
}