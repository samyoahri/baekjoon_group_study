#include<iostream>
#include<set>

using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);
    set<string, greater<string>> attendanceList;
    int N = 0;
    cin >> N;
    string name, state;
    for(int i = 0; i < N; ++i){
        cin >> name >> state;
        if(state=="enter"){
            attendanceList.insert(name);
        }
        else if(state=="leave"){
            attendanceList.erase(name);
        }
    }
    
    for(const string& employed : attendanceList){
        cout << employed << "\n";
    }

    return 0;
}