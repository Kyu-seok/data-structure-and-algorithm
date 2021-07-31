#include <stdio.h>

int function(int n)
{
    if (n > 0) {
        return function(n - 1) + n;
    } else {
        return 0;
    }

}

int main(void)
{
    int r;
    r = function(5);
    printf("%d\n", r);

    return 0;
}

/*  
    Output 
    15
*/  