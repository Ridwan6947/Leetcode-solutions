def solve(msg, pat):
    n = len (pat)
    res=''
    for i in range (len (msg)-n+1):
        x = i
        k = 0
        for j in range(n):
            if(msg[k] == pat[j]):
                k +=1
            x += 1
        if k == n:
            res += str(i+1)
    return res


msg = "hellofromtheotherside"
pat = "##o#"
print(solve(msg,pat))