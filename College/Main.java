#include<iostream>
using namespace std;
struct college{
  char name[100];
  char city[100];
  int establishmentYear;
  float passPercentage;
};
void display(college c[],int n){
    for(int i=0;i<n;i++){
  
  cout<<"College:"<<i+1<<"\n";
  cout<<"Name:"<<c[i].name<<"\n";
  cout<<"City:"<<c[i].city<<"\n";
  cout<<"Year of establishment:"<<c[i].establishmentYear<<"\n";
  cout<<"Pass percentage:"<<c[i].passPercentage<<"\n";
    }
}
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of colleges"<<"\n";
  cin>>n;
  struct college c1[n];
  for(int i=0;i<n;i++){
    cout<<"Enter the details of college "<<i+1<<"\n";
    cout<<"Enter name"<<"\n";
    cin>>c1[i].name;
    cout<<"Enter city"<<"\n";
    cin>>c1[i].city;
    cout<<"Enter year of establishment"<<"\n";
    cin>>c1[i].establishmentYear;
    cout<<"Enter pass percentage"<<"\n";
    cin>>c1[i].passPercentage;
    
}
 cout<<"Details of colleges"<<"\n";
display(c1,n);
}
