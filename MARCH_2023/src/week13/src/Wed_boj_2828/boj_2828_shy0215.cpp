#include<iostream>
#include<vector>
#include<cstdlib>
using namespace std;

int main(){
    int n, m, num;
    int ans = 0;
    int front = 0;
    int back = 0;

    cin >> n >> m;
    back = m;

    int apple;
    cin >> num;

    for(int i = 0; i <num; i++){
        cin >> apple;
        while(1){
            if(front < apple && apple <= back)
            break;
            if(apple<=front){
                front --;
                back --;
                ans ++;
            }
            if(apple > back){
                front ++;
                back ++;
                ans ++;
            }
        }
    }
    cout << ans;

    return 0;
}