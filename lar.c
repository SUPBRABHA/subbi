#include<stdio.h>
#include<conio.h>
void main()
{
  int a=4;
  int b=5;
  int c=6;
  if(a>b&&a>c)
  {
  printf("a");
  }
  else if(b>a&&b>c)
  {
    printf("b");
  }
  else
    printf("c");
  getch();
}
