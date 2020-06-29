#include<iostream>
using namespace std;
int main()
{
int a;
  float sum=0.5;
  std::cin>>a;
  for(int i=1;i<=a;i++)
  { 
    if(i==1)
      std::cout<<sum<<" ";
     
   else
   {
   sum=sum*3;
  std::cout<<sum<<" ";
   }
}
}