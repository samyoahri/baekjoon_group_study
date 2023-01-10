#include <iostream>
#include <string>
using namespace std;

int main(){
    string a;
    cin >> a;
    for (int i = 0; i <= a.size() ; i++ ){
        if (i % 10 == 0){
            cout<<a.substr(i,10)<< "\n";
        }
    }

}