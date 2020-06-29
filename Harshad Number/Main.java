#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,sum=0,n,temp;
  std::cin>>a;
  temp=a;
 while(a>0)
 {
 n=a%10;
 a=a/10;
 sum=sum+n;
 }
  if(temp%sum==0)
    std::cout<<"Harshad Number";
  else
    std::cout<<"Not Harshad Number";
  
  
}