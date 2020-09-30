chemical_formular = input()
cf = []
for i in chemical_formular :
    if (i == 'H') :
        cf.append(1)
    elif (i == 'O') :
        cf.append(16)
    elif (i == 'C') :
        cf.append(12)
    elif (i == '(') :
        cf.append(0)
    elif (i == ')') :
        tmp = 0
        while True :
            v = cf.pop()
            if (v == 0) :
                break
            tmp += v
        cf.append(tmp)
    else :
        cf.append(cf.pop()*int(i))
print(sum(cf))