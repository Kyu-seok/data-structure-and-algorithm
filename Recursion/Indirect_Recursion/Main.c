#include <stdio.h>

void funcB(int n);  

void funcA(int n)
{
    if (n > 0) {
        printf("%d ", n);
        funcB(n - 1);       //  funcB is called
    }
}

void funcB(int n) 
{
    if (n > 0) {
        printf("%d ", n);
        funcA(n / 2);       //  funcA is called
    }
}

int main(void) 
{
    funcA(20);

    return 0;
}