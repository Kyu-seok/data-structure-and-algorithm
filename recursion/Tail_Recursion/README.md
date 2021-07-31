# Tail Recursion 

Tail recursion is recursion which all actions are done BEFORE recursive call. The logic of this recursion is similar with using while loop.

```
EXAMPLE CODE
#include <stdio.h>

void function(int n) 
{
    if (n > 0) {
        printf("%d ", n);   // <- Action is done before the call
        function(n - 1);    // <- Call
    }
}

int main(void) 
{
    function(3);

    return 0;
}
```

```
OUTPUT
3 2 1 
```


