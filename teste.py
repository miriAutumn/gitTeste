def _calculo(n1, n2, math):
    if math == 'A':
        return n1 + n2
    elif math == 'S':
        return n1 - n2
    elif math == 'M':
        return n1 * n2
    elif math == 'D':
        return n1 / n2
    else:
        return "ERROR"


print(_calculo(5, 5, 'D'))