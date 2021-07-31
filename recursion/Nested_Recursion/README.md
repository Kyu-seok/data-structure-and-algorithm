Nested Recursion : Recursion in Recursion
~~Now this is the fun part~~

```
#include <stdio.h>

int function(int n) 
{
    if (n > 100) {
        return n - 10;
    } else {
        return function( function(n + 11) );    // <- calling recursion in recursion
    }
}

int main(void) 
{
    int r;
    r = function(95);
    printf("%d", r);

    return 0;
}
```

```
OUTPUT
91
```

| step | return |
| -|-|
0 | return function( function(106) )
1 | return function(96)
2 | return function( function(107) )
3 | return function(97)
4 | return function( function(108) )
5 | return function(98)
6 | return function( function(109) )
7 | return function(99)
8 | return function( function(110) )
9 | return function(100)
10 | return function( function(111) )
11 | return function(111)
12 | return 91
