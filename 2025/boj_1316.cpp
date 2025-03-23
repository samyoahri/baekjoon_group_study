#include<iostream>

using namespace std;

bool IsGroupWord(const string& word)
{
    // 아스키코드 97
    const int offset = 97;
    int alphabetTable[26] = {0,};

    int prevCh = -1;
    for(size_t i = 0; i < word.length(); ++i)
    {
        int ch = word[i] - offset;
        if(prevCh == -1)
        {
            ++alphabetTable[ch];
        }
        else
        {
            // 이전에 연속된 것을 확인한 경우(-1인 경우)
            if(alphabetTable[ch] == -1)
            {
                return false;
            }
            // 새로운 알파벳인 경우
            else if(alphabetTable[ch] == 0)
            {
                ++alphabetTable[ch];
                // 이전 알파벳테이블 -1로 변경
                alphabetTable[prevCh] = -1;
            }
            // 기존 알파벳인 경우
            else
            {
                ++alphabetTable[ch];
            }
        }
        
        prevCh = ch;
    }
    return true;
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);

    size_t N = 0;

    cin >> N;

    size_t numGroupWord = 0;
    for(size_t i = 0; i < N; ++i)
    {
        string word;
        cin >> word;
        if(IsGroupWord(word))
        {
            ++numGroupWord;
        }
    }
    cout << numGroupWord << endl;

    return 0;
}