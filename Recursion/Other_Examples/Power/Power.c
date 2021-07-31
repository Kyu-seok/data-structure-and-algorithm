#include <stdio.h>

int power(int m, int n) 
{
    if (n == 0) {
        return 1;
    } else {
        return m * power(m, n - 1);
    }
}

int powerEfficient(int m, int n)
{
    if (n == 0) {
        return 1;
    } else if (n % 2 == 0) {
        return  powerEfficient(m * m, n / 2);
    } else {
        return m * powerEfficient(m * m, (n - 1) / 2);
    }
}

int main(void)
{

    printf("Result : %d\n", power(2,9));            //  power(2,9) function uses stack space of 9 times
    printf("Result : %d\n", powerEfficient(2,9));   //  powerEfficient(2,9) uses (9 / 2) + 1 times = 5times 

    return 0;
}