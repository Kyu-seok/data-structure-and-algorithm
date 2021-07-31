#include <stdio.h>

int function(int n)
{
    static int x = 0;                   //  note that variable x is declared static
    if (n > 0) {
        x++;
        return function(n - 1) + x;     //  if function(5), return : x + x + x + x + x
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
    25
*/