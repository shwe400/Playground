#include<iostream>

using namespace std;

int main()

{

int n1= 1,n,i,j;

cin >> n;

for(i=1;i<=n;i++)

{

for(j=1;j<=i;j++)
{
  if(j<i)
cout<<n1<<"*";
  else
    cout<<n1;
}
 n1++;



cout<<endl;

}

n1--;

for(i=n;i>=1;i--)

{

for(j=1;j<=i;j++)
{
if(j<i)

cout<<n1<<"*";
  else
    cout<<n1;
}

n1--;

cout<<endl;

}
}
