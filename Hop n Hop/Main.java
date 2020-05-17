#include<iostream>
using namespace std;
int main()
{
  int x1=3;
  int y1=4;
  int x2,y2,a,b;
  std::cin>>x2>>y2;
  a=x2-x1;
  b=y2-y1;
  a>b?std::cout<<a:std::cout<<b;
}