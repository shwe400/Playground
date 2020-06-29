#include<iostream>
int main()
{
    // Type your code here
   int row, col, m1[10][10], m2[10][10], sum[10][10];



 std::cin>>row;


 std::cin>>col;


 for (int i = 0;i<row;i++ ) {

 for (int j = 0;j < col;j++ ) {

std:: cin>>m1[i][j];

 }

 }



for (int i = 0;i<row;i++ ) {

 for (int j = 0;j<col;j++ ) {

std::cin>>m2[i][j];

 }

 }



 for (int i = 0;i<row;i++ ) 
 {

for (int j = 0;j<col;j++ ) 
{

sum[i][j]=m1[i][j]+m2[i][j];
  
  
  if(i==j)
     std::cout<<sum[i][j]<<" ";
  else
      std::cout<<sum[i][j]<<" ";
           
        


}
std::cout<<"\n";
}

 return 0;

}