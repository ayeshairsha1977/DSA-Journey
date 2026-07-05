s=list("loewbi")
t=list("pxezla")
n=len(s)
fre=[0]*n
for i in range(n):
    fre[i]=abs(ord(s[i])-ord(t[i]))
for i in fre:
    print(i,end=" ")
