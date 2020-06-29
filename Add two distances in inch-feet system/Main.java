#include<iostream>
using namespace std;
struct measurements{
  int inch;
  float feet;
  
};
int main()
{
  //Type your code here.
  measurements s1,s2,s3;
  cin>>s1.inch>>s1.feet>>s2.inch>>s2.feet;
  s3.inch=s1.inch+s2.inch;
  s3.feet=s1.feet+s2.feet;
  if(s3.feet>12.0){
    s3.feet-=12.0;
    s3.inch++;
  }
  cout<<s3.inch<<"'-"<<s3.feet<<"\"";
}

