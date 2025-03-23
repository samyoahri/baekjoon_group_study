#include <iostream>
#include <vector>
using namespace std;
int max(int a, int b)
{
    return (a < b) ? b : a;
}
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);

    unsigned int N = 0;
    cin >> N;
    vector <unsigned short> scores(N);
    unsigned short maxScore = 0;
    for(int i = 0; i < N; ++i)
    {
        cin >> scores[i];
        maxScore = max(maxScore, scores[i]);
    }
    
    vector<float> correctedScores(N);
    for(int i = 0; i < N; ++i)
    {
        correctedScores[i] = (float)scores[i] / (float)maxScore * 100;
    } 
    
    float total = 0;  
    for(int i = 0 ; i < N; ++i)
    {
        total += correctedScores[i];
    }

    float avg = (float)total / N;

    // cout << fixed;
    // cout.precision(3);
    cout << avg << "\n";
}