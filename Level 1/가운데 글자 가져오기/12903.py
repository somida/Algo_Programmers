def solution(s):
    return s[len(s) // 2] if len(s) % 2 else s[len(s) // 2 - 1 : len(s) // 2 + 1]

# if를 쓰지 않고 가능...대단..
def solution(s):
    return s[(len(s) - 1) // 2 : len(s) // 2 + 1]