#include<iostream>
using namespace std;
int main()
{
  int x,y,r;
  float si,d;
  cin>>x>>y>>r;
  si=x*y*r/100;
  cout<<si<<endl;
  cout<<x+si<<endl;
  d=2*si/100;
  cout<<d<<endl;
  cout<<x+si-d<<endl;
}