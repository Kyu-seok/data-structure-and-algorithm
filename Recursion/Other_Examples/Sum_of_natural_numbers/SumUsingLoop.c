#include <stdio.h>

int main(void) 
{
    int n, result, i;
    n = 5;
    result = 0;

    for(i = 1; i <= n; i++) {
        result += i;
    }

    printf("Result : %d\n", result);

}