#include<iostream>
using namespace std;
int main()
{
  float a;
  int b,c;
  std::cin>>a>>b>>c;
  if((a*b)<c)
    std::cout<<"Cannot reach";
  else
    std::cout<<"Can reach";
}