#include<iostream>
using namespace std;
int main()
{
  float a,b,c,d,e,f,g,h,i;
  float x1,y1,z1,x2,y2,z2,x3,y3,z3;
  std::cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  x1=b/100;
  y1=a*x1;
  z1=a-y1;
  x2=e/100;
  y2=d*x2;
  z2=d-y2;
  x3=h/100;
  y3=g*x3;
  z3=g-y3;
  std::cout<<"In Flipkart Rs."<<z1+c;
  std::cout<<"\nIn Snapdeal Rs."<<z2+f;
  std::cout<<"\nIn Amazon Rs."<<z3+i;
  if(z1<z2 && z1<z3)
    std::cout<<"\nHe will prefer Flipkart";
  else if(z2<z1 && z2<z3)
    std::cout<<"\nHe will prefer Snapdeal";
  else if(z3<z1 && z3<z2)
    std::cout<<"\nHe will prefer Amazon";
}