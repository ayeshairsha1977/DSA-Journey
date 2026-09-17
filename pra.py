
def maximumArea(h):
    m=len(h)
    stack=[]
    area=0
    for i in range(m):
        while stack and h[i]<h[stack[-1]]:
            val=h[stack.pop()]
            if stack:
                width=i-stack[-1]-1
            else:
                width=i
            area=max(area,val*width)
        stack.append(i)
    while stack:
        val=h[stack.pop()]
        if stack:
            width=m-i-1
        else:
            width=m
    area=max(area,val*width)
    return area
matrix=[["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
n=len(matrix)
m=len(matrix[0])
h=list(int(ele) for ele in matrix[0])
ref=list(int(ele) for ele in matrix[0])
area=0
for row in range(n):
    for col in range(m):
        if row>0 and matrix[row][col]=='1':
            h[row][col]=ref[row][col]+1
        else:
            h[row][col]=0
        ref[row][col]=h[row][col]
        area=max(area,maximumArea(h))
print(area)
                
       
        