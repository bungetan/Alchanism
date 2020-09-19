n = int(input())

chk = 0
for i in range(n) :
    word = list(str(input()))
    stack = []
    for j in word :
        if (len(stack) == 0) :
            stack.append(j)
        else :
            if (j == stack[-1]) :
                stack.pop()
            else :
                stack.append(j)
    if (len(stack) == 0) :
        chk += 1

print(chk)