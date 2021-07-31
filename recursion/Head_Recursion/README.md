Tail Recursion :
```
#include <stdio.h>

void function(int n) 
{
    if (n > 0) {
        function(n - 1);    // <- Call
        printf("%d ", n);   // <- Action is done after the call
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
1 2 3
```
