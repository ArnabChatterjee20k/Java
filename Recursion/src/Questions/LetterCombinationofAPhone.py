letters = {
    "2": "abc",
    "3": "def",
    "4": "ghi",
    "5": "jkl",
    "6": "mno",
    "7": "pqrs",
    "8": "tuv",
    "9": "wxyz",
}

digits = "234"

res = []


def backtracK(i, curStr):
    if len(curStr) == len(digits):
        res.append(curStr)
        return

    cur = letters[digits[i]]
    for ch in cur:
        prev = i
        backtracK(prev+1, curStr+ch)


backtracK(0, "")
print(res)
