#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
// bool desc(pair<int, int> a, pair<int, int>b){
//     if(a.first > b.first){
//         return 1;
//     }
//     else if(a.first < b.first){
//         return 0;
//     }
//     else{
//         if(a.second < b.second){
//             return 1;
//         }
//         else{
//             return 0;
//         }
//     }
// }
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);
    int N = 0;
    cin >> N;
    int x = 0; int y = 0;
    vector<pair<int, int>> arr(N);
    
    for(int i = 0; i < N; ++i){
        cin >> x >> y;
        arr[i].first = x;
        arr[i].second = y;
    }
    // sort(arr.begin(), arr.end(), desc);
    sort(arr.begin(), arr.end());
    for(int i = 0; i < N; ++i){
        cout << arr[i].first << " " << arr[i].second << "\n";
    }
    return 0;
}
// #include<iostream>
// #include<algorithm>

// using namespace std;
// class Coordinate{
//     public:
//         int x;
//         int y;
//     public:
//         Coordinate(){
//             this->x = 0;
//             this->y = 0;
//         }
//         Coordinate(int _x_, int _y_){
//             this->x = _x_;
//             this->y = _y_;
//         }
//         int getX(){
//             return this->x;
//         }
//         int getY(){
//             return this->y;
//         }
//         void setX(int _x){
//             this->x = _x;
//         }
//         void setY(int _y){
//             this->y = _y;
//         }
//         bool operator < (Coordinate& coor){
//             // return coor1 > coor2;
//             if(this->x < coor.x){
//                 return true;
//             }
//             else if(this->x==coor.x){
//                 return this->y < coor.y;
//             }
//             else{
//                 return false;
//             }
//         }
//         ~Coordinate(){

//         };
// };

// int main(){
//     int N = 0;
//     cin >> N;
//     //// Coordinate coordinates = new Coordinate[N];
//     Coordinate* coordinates = new Coordinate[N];
//     for(int k = 0; k < N; ++k){
//         int x = 0, y = 0;
//         cin >> x >> y;
//         coordinates[k].setX(x);
//         coordinates[k].setY(y);
//     }
//     // sort(coordinates.begin(), coordinates.end(), cmp);
//     sort(coordinates, coordinates + N);
//     for(int i = 0; i < N; ++i){
//         cout << coordinates[i].x << " " << coordinates[i].y << "\n";
//     }
//     return 0;
// }