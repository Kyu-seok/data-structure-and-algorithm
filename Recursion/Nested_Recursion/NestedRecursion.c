#include <stdio.h>

int function(int n) 
{
    if (n > 100) {
        return n - 10;
    } else {
        return function( function(n + 11) );
    }
}

int main(void) 
{
    int r;
    r = function(95);
    printf("%d", r);

    return 0;
}