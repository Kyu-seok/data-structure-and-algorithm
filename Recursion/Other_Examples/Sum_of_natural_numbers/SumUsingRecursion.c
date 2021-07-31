#include <stdio.h>

int sum(int n)
{
    if (n > 0) {
        return n + sum(n-1);
    } else {
        return 0;
    }
}

int main(void)
{
    int n = 5, result;
    result = sum(5);

    printf("Result : %d\n", result);
}