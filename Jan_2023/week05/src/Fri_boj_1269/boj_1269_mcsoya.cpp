#include <iostream>
#include <map>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    
    map<int, int> maps;
    int A, B, data;
    
    cin >> A >> B;
    
    for(int i = 1; i <= A; i++) {
        cin >> data;
        maps[data]++;
    }
    
    for(int i = 1; i <= B; i++) {
        cin >> data;
        if(maps[data] == 0) maps[data]++;
        else maps.erase(data);
    }
    cout << maps.size();
}