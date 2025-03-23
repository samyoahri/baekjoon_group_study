#include<iostream>
#include<vector>
#include<cmath>
#include<assert.h>
using namespace std;
struct Point
{
    int x;
    int y;
};
void Print(const vector<Point>& housesList)
{
    for(auto it : housesList)
    {
        cout << it.x << " " << it.y << "\n";
    }
}
int GetDist(const Point& a, const Point& b)
{
    return abs(a.x - b.x) + abs(a.y - b.y);
}
int customMin(const int& a, const int& b, const int& c)
{
    if(a <= b && a <= c)        return a;
    else if(b <= c && b <= a)   return b;
    else                        return c;
}
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);

    int N = 0, K = 0;

    cin >> N >> K;
    
    vector<Point> housesList(N);
    int X = 0, Y = 0;
    for(size_t i = 0; i < N; ++i)
    {
        cin >> X >> Y;
        Point point{X, Y};
        housesList[i] = point;
    }
    // Print();
    int ans = 2147000000;
    if(K==1)
    {
        for(size_t i = 0; i < housesList.size(); ++i)
        {
            int maxDist = 0;
            for(size_t j = 0; j < housesList.size(); ++j)
            {
                if(i==j)    continue;
                //대피소와 집사이의 거리 중 가장 긴 거리
                maxDist = max(maxDist, GetDist(housesList[j], housesList[i]));
            }
            ans = min(ans, maxDist);
        }
    }
    else if(K==2)
    {
        for(size_t i = 0; i < housesList.size(); ++i)
        {
            for(size_t j = 0; j < housesList.size(); ++j)
            {
                if(i==j) continue;

                int maxDist = 0;
                for(size_t k = 0; k < housesList.size(); ++k)
                {
                    if(i==k || j == k) continue;
                    //대피소와 집사이의 거리 중 가장 긴 거리
                    maxDist = max(maxDist, min(GetDist(housesList[k], housesList[i]), GetDist(housesList[k], housesList[j])));
                }
                ans = min(ans, maxDist);
            }
        }
    }
    else if(K==3)
    {
        for(size_t i = 0; i < housesList.size(); ++i)
        {
            for(size_t j = 0; j < housesList.size(); ++j)
            {
                if(i==j) continue;

                for(size_t k = 0; k < housesList.size(); ++k)
                {
                    if(k == i || k == j) continue;

                    int maxDist = 0;
                    for(size_t l = 0; l < housesList.size(); ++l)
                    {
                        if(l == i || l == j || l == k) continue;
                        //대피소와 집사이의 거리 중 가장 긴 거리
                        maxDist = max(maxDist, customMin(
                            GetDist(housesList[l], housesList[i]), 
                            GetDist(housesList[l], housesList[j]),
                            GetDist(housesList[l], housesList[k])
                        ));
                    }
                    ans = min(ans, maxDist);
                }
            }
        }
    }
    else
    {
        assert(K==1 || K==2|| K==3);
    }

    cout << ans;
    return 0;
}
