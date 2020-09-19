n = int(input())
sell = {}

for i in range(n) :
    bn = input()
    if (bn in sell) :
        sell[bn] += 1
    else :
        sell[bn] = 1

result = sorted(sell.items(),key=lambda x:x[1],reverse=True)
chk = result[0][1]
result.sort(key=lambda x:x[0])

for i in result :
    if (i[1] == chk) :
        print(i[0])
        break