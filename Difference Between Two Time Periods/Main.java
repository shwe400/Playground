#include<iostream>
using namespace std;
struct Time{
  int hours;
  int minutes;
  int seconds;
};
int main()
{
  //Type your code here.
  Time t1,t2,t3;
  cin>>t1.hours>>t1.minutes>>t1.seconds;
  cin>>t2.hours>>t2.minutes>>t2.seconds;
  if(t1.seconds<t2.seconds){
    t1.minutes--;
    t1.seconds+=60;
  }
  t3.seconds=t1.seconds-t2.seconds;
  if(t1.minutes<t2.minutes){
    t1.hours--;
    t1.minutes+=60;
  }
  t3.minutes=t1.minutes-t2.minutes;
  t3.hours=t1.hours-t2.hours;
  cout<<t3.hours<<":"<<t3.minutes<<":"<<t3.seconds;
    
}
