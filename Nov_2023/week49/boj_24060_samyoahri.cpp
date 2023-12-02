#include<iostream>
#include<vector>

using namespace std;
int N = 0, K = 0, ans = -1;
vector<int> arr;
void arrPrint(){
    for(int integer : arr){
        cout << integer << " ";
    }
    cout << "\n";
}
void merge(const int& left, const int& mid, const int& right){
    int i = left, j = mid + 1, t = 0;
    int* tmp = new int[right-left +1];
    while(i <= mid && j <= right){
        if(arr[i] < arr[j]) tmp[t++] = arr[i++];
        else                tmp[t++] = arr[j++];
    }
    //왼쪽배열이 남은 경우
    while(i <= mid)         tmp[t++] = arr[i++];
    //우측배열이 남은 경우
    while(j<=right)         tmp[t++] = arr[j++];
    i = left, t = 0;
    while(i<=right){
        --K;
        if(K==0)    ans = tmp[t];
        arr[i++] = tmp[t++];
    }
    delete[] tmp;
}
void mergeSort(const int& left, const int& right){
    if(left<right){
        int mid = (left + right)/2;
        mergeSort(left, mid);
        mergeSort(mid+1, right);
        merge(left, mid, right);
    }

}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);
    cin >> N >> K;
    arr.resize(N);
    for(int i = 0; i < N; ++i){
        cin >> arr[i];
    }
    // arrPrint();
    mergeSort(0 , N-1);
    // arrPrint();
    cout << ans;
    return 0;
}