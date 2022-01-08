try:
    n = float(input())
    s = input()
    m = float(input())
    cucun = {'+':n+m,'-':n-m,'*':n*m,'/':n/m}
    print('{:.2f}'.format(cucun[s]))
except:
    print("divided by zero")