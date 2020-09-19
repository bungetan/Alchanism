n = int(input())
humany = {}

for i in range(n) :
    n,s = input().split()
    if (s == "enter") :
        humany[n] = 1
    else :
        humany[n] = 0

result = sorted(humany.items(),key=lambda x:x[0],reverse=True)
for i in result :
    if (i[1] == 1) :
        print(i[0])