#include<iostream>
#include<unordered_set>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);
    unordered_set<int> A;
    int N = 0, M = 0;
    cin >> N >> M;
    int input;
    for(int i = 0; i < N; ++i){
        cin >> input;
        A.insert(input);
    }
    for(int i = 0; i < M; ++i){
        cin >> input;
        if(A.find(input)!=A.end()){
            A.erase(input);
        }
        else{
            A.insert(input);
        }
    }
    cout << A.size();
    
    return 0;
}
// #include<iostream>
// #include<unordered_set>
// using namespace std;

// int main(){
//     ios_base::sync_with_stdio(false);
//     cin.tie(NULL); cout.tie(0);
//     unordered_set<int> A;
//     unordered_set<int> B;
//     int N = 0, M = 0;
//     cin >> N >> M;
//     int input;
//     for(int i = 0; i < N; ++i){
//         cin >> input;
//         A.insert(input);
//     }
//     for(int i = 0; i < M; ++i){
//         cin >> input;
//         B.insert(input);
//     }
//     int unionSubsetNum = 0;
//     for(const int & A_sub : A){
//         if(B.find(A_sub)!=B.end()){
//             ++unionSubsetNum;
//         }
//     }
//     cout << ((A.size() - unionSubsetNum) + (B.size() - unionSubsetNum));
//     return 0;
// }