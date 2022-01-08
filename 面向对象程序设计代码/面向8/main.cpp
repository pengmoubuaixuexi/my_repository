#include <iostream>
#include <iomanip>
using namespace std;
class ARR{
protected:
    int n;
    int a[100];
public:
    ARR(int x[],int size)
    {
        n=size;
        for(int i=0;i<size;i++)
            a[i]=x[i];
    }
    void change()
    {
        int i,m=0,q;
        for(i=0;i<n;i++){
            if(a[i]<=0){
                q=a[m];
            a[m]=a[i];
            a[i]=q;
                m++;}}
            m=n-1;
        for(i=n-1;i>=0;i--){
            if(a[i]>=0){
                q=a[m];
                a[m]=a[i];
                a[i]=q;
                m--;}}
    }
    void show()
    {
        for(int i=0;i<n;i++)
		cout<<setw(4)<<a[i];
      cout<<endl;
    }
    };
int main()
{
    int b[]={1,-3,-1,3,2,4,-4,5,-5,-2};
    ARR v(b,10);
    v.show();
    v.change();
    v.show();
}
