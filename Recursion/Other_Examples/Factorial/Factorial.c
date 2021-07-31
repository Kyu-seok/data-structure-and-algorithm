#include <stdio.h>

int factorial(int n) 
{
    if (n == 0) {
        return 1;
    } else {
        return n * factorial(n-1);
    }
}

int factorialIteration(int n) 
{
    int result = 1, i;

    for(i = 1; i <= n; i++) {
        result *= i;
    }

    return result;
}

int main(void)
{
    int r;

    printf("Result (recursion): %d\n", factorial(5));
    printf("Result (iteration): %d\n", factorialIteration(5));

    return 0;

}