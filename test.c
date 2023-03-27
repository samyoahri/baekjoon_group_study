#include <stdio.h>

int main(){
    int a = 12;
    int *p;
    p= &a;
 
    printf("int a의 주소: %d \n", &a);
    printf("포인터 p의 값: %d \n", p);
    printf("포인터 p가 가리키는 값: %d \n", *p);

    return 0;
}