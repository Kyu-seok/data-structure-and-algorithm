# Tree Recursion  

Tree Recursion is Recursion which calls itself mulitple times


```
EXAMPLE CODE
#include <stdio.h>

void function(int n)
{
    if (n > 0) {
        printf("%d ", n);
        function(n - 1);    //  <- Call Once
        function(n - 1);    //  <- Call Twice
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
3 2 1 1 2 1 1
```

Tree recursion solves problem effectively with very short amount of code. However it requries precise logic and has very high time complexity.
O(2^n) in abover case, as there is two recursive calls.