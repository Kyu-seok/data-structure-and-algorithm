#include <stdio.h>

void function(int n) 
{
    if (n > 0) {
        printf("%d ", n);
        function(n - 1);
    }
}

int main(void) 
{
    function(3);

    return 0;
}