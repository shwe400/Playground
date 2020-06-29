#include<iostream>
using namespace std;
int main()
{
int a ,b=11,sum;
  sum=b*b;
  std::cin>>a;
  for(int i=1;i<=a;i++)
  {
  if(i==1)
    std::cout<<sum<<" ";
  else
  {
  b=b+4;
    sum=b*b;
    std::cout<<sum<<" ";
  }
  }
}