#include<iostream>
#include<fstream>
using namespace std;
int main()
{
    char a[100];
    ifstream in("test.txt");
    ofstream out("out.txt");
    for(string out;getline(in,out);){
        cout<<out<<endl;
}}
