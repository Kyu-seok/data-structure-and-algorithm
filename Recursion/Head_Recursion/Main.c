#include <stdio.h>

void function(int n) 
{
    if (n > 0) {
        function(n - 1);
        printf("%d ", n);
    }
}

int main(void) 
{
    function(3);

    return 0;
}