t = int(input())  # Number of test cases

for _ in range(t):
    n = int(input())  # Number of boxes
    weights = list(map(int, input().split()))  # Weights of the boxes

    max_diff = 0
    for k in range(1, n + 1):
        if n % k == 0:  # Check if k is a valid option
            groups = [sum(weights[i:i+k]) for i in range(0, n, k)]
            diff = max(groups) - min(groups)
            max_diff = max(max_diff, diff)

    print(max_diff)
