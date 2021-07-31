# Indirect Recursion

Indirect Recursion has multiple methods calling each others in a cycle, recursively.

```
EXAMPLE CODE
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
```

```
OUTPUT
20 19 9 8 4 3 1
```

funcA(int n) : calls funcB(n - 1)
funcB(int n) : calls funcA(n / 1)   

As we see from instruction above, each functions are calling the other, recursively, and the value of n is gradually decrease. Once the value of n becomes zero, the recursion ends, ending the program.