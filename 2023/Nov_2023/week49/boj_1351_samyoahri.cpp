#include<iostream>
#include<unordered_map>
using namespace std;

unordered_map<long long int, long long int> map;

long long int A(const long long int& n, const long long int& p, const long long int& q){
    if(map.find(n)!=map.end())  return map[n];
    long long int& reference = map[n];
    return reference = A(n/p, p, q) + A(n/q, p, q);
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);
    long long int N = 0, P = 0, Q = 0;
    cin >> N >> P >> Q;
    map.insert(make_pair(0, 1));
    map.insert(make_pair(1, 2));

    long long int A0 = A(N, P, Q);
    
    cout << A0;
    return 0;
}
// #include<iostream>
// #include<unordered_map>
// using namespace std;

// unordered_map<long long int, long long int> map;

// //A_i = A(i/p) + A(i/q)
// long long int A_recursive(long long int i, long long int p, long long int q){
//     if(map.find(i)!=map.end()){
//         return map[i];
//     }
//     return (A_recursive(i/p, p, q) + A_recursive(i/q, p, q));
// }
// long long int A_iterative(const long long int& n, const long long int& p, const long long int& q){
//     if(n==0){
//         return 1;
//     }
//     if(q < p){
//         for(int i = 0; i <= n / q; ++i){
//             if(map.find(i)!=map.end())  continue;
//             long long int A0 = A_recursive(i, p, q);
//             map.insert(make_pair(i, A0));
//         }
//     }
//     else{
//         for(int i = 0; i <= n / p; ++i){
//             if(map.find(i)!=map.end())  continue;
//             long long int A0 = A_recursive(i, p, q);
//             map.insert(make_pair(i, A0));
//         }
//     }

//     return map[n/p] + map[n/q];
// }

// int main(){
//     ios_base::sync_with_stdio(false);
//     cin.tie(NULL); cout.tie(0);
//     long long int N = 0, P = 0, Q = 0;
//     cin >> N >> P >> Q;
//     map.insert(make_pair(0, 1));
//     map.insert(make_pair(1, 2));

//     long long int A0 = A_iterative(N, P, Q);
//     long long int A0 = A_recursive(N, P, Q);
//     for(const pair<long, long>& p : map){
//         cout << "index:" <<p.first << "  value:" << p.second << "\n";
//     }
    
//     cout << A0;
    
// }