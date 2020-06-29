#include<iostream>
using namespace std;
int swap(int &a,int &b)
{
int temp;
  temp=a;
  a=b;
  b=temp;
}
int main()
{
int x,y;
  std::cin>>x>>y;
  std::cout<<"Before swapping a= "<<x<<" and b="<<y;
  swap(x,y);
  std::cout<<"\nAfter swapping a= "<<x<<" and b="<<y;
}