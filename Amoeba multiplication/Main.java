#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,sum,c=0,b=1;
  std::cin>>a;
  for(int i=2;i<a;i++)
  {
    sum=c+b;
    c=b;
    b=sum;
    
    
    
  
  }
  std::cout<<sum;
}