#include<iostream>
#include<vector>
#include<unordered_map>
#include<string>

using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);
    int N = 0, M = 0;
    cin >> N >> M;
    unordered_map<string, int> poketmon;
    vector<string> name;
    name.push_back("NO");
    string tmp;
    for(int i = 1; i <= N; ++i){
        cin >> tmp;
        poketmon.insert(make_pair(tmp, i));
        name.push_back(tmp);
    }
    for(int i = 0; i < M; ++i){
        cin >> tmp;
        //글자인 경우
        if(tmp[0] >= 65 && tmp[0] <= 90){
            cout << poketmon[tmp] << "\n";
        }
        else{
            cout << name[stoi(tmp)] << "\n";
        }
    }
    return 0;
}