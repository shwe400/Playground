#include<iostream>
#include<string.h>
#include<iomanip>
using namespace std;
struct employee{
  char name[10];
  int id;
  int age;
  char designation[8];
  float salary;
};
void display(employee e){
  cout<<"Employee Details"<<"\n";
  cout<<"Name of the Employee : "<<e.name<<"\n";
  cout<<"ID of the Employee : "<<e.id<<"\n";
  cout<<"Age of the Employee : "<<e.age<<"\n";
  cout<<"Designation of the Employee : "<<e.designation<<"\n";
  cout<<"Salary of the Employee : "<<e.salary<<"\n";
}

int main()
{
  //Type your code here.
  employee e1;
  cout<<"Enter name:"<<"\n";
 // cin>>e1.name;
  strcpy(e1.name,"Rajarajan");
  cout<<"Enter ID:"<<"\n";
  //cin>>e1.id;
  e1.id=001;
  cout<<"Enter age:"<<"\n";
  //cin>>e1.age;
  e1.age=24;
  cout<<"Enter designation:"<<"\n";
  //cin>>e1.designation;
 strcpy( e1.designation,"Manager");
  cout<<"Enter Salary:"<<"\n";
  //cin>>e1.salary;
  e1.salary=20000;
  display(e1);
}

