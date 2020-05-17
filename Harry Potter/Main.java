#include<iostream>
using namespace std;
int main()
{
  char x[4];
  std::cin>>x;
  if(x[0]=='1' && x[3]=='1')
    std::cout<<'2';
  else
    std::cout<<'1';
}